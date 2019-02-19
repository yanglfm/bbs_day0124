package com.tom.bbs_day0124.service.impl;

import com.bilibili.yl.util.MD5Utils;
import com.tom.bbs_day0124.constants.ResultEntity;
import com.tom.bbs_day0124.constants.ResultEnum;
import com.tom.bbs_day0124.mapper.UsersMapper;
import com.tom.bbs_day0124.model.Users;
import com.tom.bbs_day0124.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;

    @Override
    public ResultEntity<Users> login(Users users) {
        ResultEntity<Users> result = new ResultEntity<>();
        users.setPassword(MD5Utils.MD5Encode(users.getPassword(), "utf-8"));
        users = usersMapper.findOne(users);
        if (users == null) {
            result.setCodeAndMsg(ResultEnum.USER_NOT_FOUND);
        } else {
            result.setCodeAndMsg(ResultEnum.LOGIN_SUCCESS_MESS);
            result.setData(users);
        }
        return result;
    }

    @Override
    public List<Users> usersPage(Map map) {
        return usersMapper.findAll(map);
    }

    @Override
    public Long usersCount() {
        return usersMapper.countAllUsers();
    }
}
