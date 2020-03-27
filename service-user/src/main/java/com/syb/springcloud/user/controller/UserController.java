package com.syb.springcloud.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("get")
    public String get(){
        return "张三";
    }
}
