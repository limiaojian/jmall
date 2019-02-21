package com.jmall.controller;

import com.jmall.model.User;
import com.jmall.service.UserService;
import com.jmall.util.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(String name){
        return "hello," + name;
    }

    @RequestMapping("/user")
    public BaseResult findUser(int id){
        User user = userService.findById(id);
        return new BaseResult(user);
    }

    public void addUser(User user){
        userService.addUser(user);
    }
}

