package com.jmall.mapper;

import com.jmall.model.User;

import java.util.List;

public interface UserMapper {

    User findById(int id);

    List<User> findAll();

    void addUser(User user);
}
