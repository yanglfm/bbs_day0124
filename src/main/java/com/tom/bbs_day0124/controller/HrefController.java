package com.tom.bbs_day0124.controller;

import com.tom.bbs_day0124.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class HrefController {
    @Resource
    private UsersService usersServiceImpl;


    @RequestMapping("user/login")
    public String login() {
        return "bbs/login";
    }

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("bbs/index");
        return mv;
    }

    @RequestMapping("/admin")
    public String admin() {
        return "bbs/admin";
    }

}
