package com.example.restservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        // 处理用户注册逻辑，将用户信息保存到数据库中
        return "注册成功！";
    }
}