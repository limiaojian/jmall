package com.jmall.controller;

import com.jmall.model.User;
import com.jmall.service.UserService;
import com.jmall.util.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/hello")
    public String hello(String name){
        return "hello," + name;
    }

    @RequestMapping(value = "/user")
    public User findUser(int id){
        return userService.findById(id);
    }

    @RequestMapping(value = "/selectPage")
    public BasePage<User> selectPage(int page, int rows){
        return userService.selectPage(page,rows);
    }

}

