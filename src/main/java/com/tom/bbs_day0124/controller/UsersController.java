package com.tom.bbs_day0124.controller;

import com.tom.bbs_day0124.constants.ResultEntity;
import com.tom.bbs_day0124.constants.ResultEnum;
import com.tom.bbs_day0124.model.Users;
import com.tom.bbs_day0124.service.UsersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class UsersController {

    @Resource
    private UsersService usersServiceImpl;

    @RequestMapping("/login")
    public ResultEntity<Users> login(Users users, HttpSession session) {
        ResultEntity<Users> result = usersServiceImpl.login(users);
        if (result.getCode() == 30005) {
            session.setAttribute("users", result.getData());
        }
        return result;
    }

    @RequestMapping("/pageUsers")
    public ResultEntity<List<Users>> pageUsers(@RequestParam Integer page, @RequestParam Integer limit) {
        Map<String, Integer> map = new HashMap<>();
        map.put("start", (page - 1) * limit);
        map.put("limit", limit);
        ResultEntity<List<Users>> result = new ResultEntity<>();
        try {
            result.setCode(0);
            result.setMsg("查询成功");
            result.setCount(usersServiceImpl.usersCount());
            result.setData(usersServiceImpl.usersPage(map));
        } catch (Exception e) {
            result.setCodeAndMsg(ResultEnum.SELECT_FAILED);
            e.printStackTrace();
        }
        return result;
    }


}
