package com.tom.bbs_day0124.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HrefController {
    @RequestMapping("user/login")
    public String login() {
        return "bbs/login";
    }
}
