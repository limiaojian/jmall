package com.jmall.controller;

import com.jmall.interceptor.JmallException;
import com.jmall.model.User;
import com.jmall.service.UserService;
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

    @RequestMapping(value = "/user")
    public User findUser(int id){
        throw new JmallException("出错了啊");
        //return userService.findById(id);
    }

    public void addUser(User user){
        userService.addUser(user);
    }
}

