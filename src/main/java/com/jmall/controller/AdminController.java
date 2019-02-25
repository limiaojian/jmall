package com.jmall.controller;

import com.jmall.interceptor.JmallException;
import com.jmall.model.User;
import com.jmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/hello")
    public String hello(String name){
        return "hello," + name;
    }

    @RequestMapping(value="/getInt")
    public int getInt(){
        return 1;
    }

    @RequestMapping(value = "/user")
    public User findUser(int id){
        int i = 1/0;
        return userService.findById(id);
    }

    @RequestMapping(value = "/findAllUser")
    public List<User> findAllUser(){
        return userService.findAll();
    }

    public void addUser(User user){
        userService.addUser(user);
    }
}

