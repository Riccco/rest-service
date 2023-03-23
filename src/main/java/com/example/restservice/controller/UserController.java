package com.example.restservice.controller;
import com.example.restservice.model.User;
import com.example.restservice.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        // 处理用户注册逻辑，将用户信息保存到数据库中
        userRepository.save(user);
        return "注册成功！";
    }
}