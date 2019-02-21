package com.jmall.mapper;

import com.jmall.model.User;

public interface UserMapper {

    User findById(int id);

    void addUser(User user);
}
