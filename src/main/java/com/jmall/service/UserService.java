package com.jmall.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.jmall.mapper.UserMapper;
import com.jmall.model.User;
import com.jmall.util.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(int id){
        return userMapper.selectById(id);
    }

    public BasePage<User> selectPage(int page, int rows){
        Page<User> p = new Page<User>(page,rows);
        List<User> userList = userMapper.selectPage(p,null);
        return new BasePage<User>(p.getTotal(),userList);
    }

}
