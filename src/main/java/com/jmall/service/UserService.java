package com.jmall.service;

import com.jmall.mapper.UserMapper;
import com.jmall.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(int id){
        return userMapper.findById(id);
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }

    public void addUser(User user){
        userMapper.addUser(user);
    }
}
