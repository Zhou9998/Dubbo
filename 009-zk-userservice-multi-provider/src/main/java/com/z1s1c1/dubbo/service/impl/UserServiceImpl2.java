package com.z1s1c1.dubbo.service.impl;

import com.z1s1c1.dubbo.model.User;
import com.z1s1c1.dubbo.service.UserService;

public class UserServiceImpl2 implements UserService {
    @Override
    public User queryUserById(Integer id, String username) {
        User user = new User();
        user.setId(id);
        user.setName(username+"-2");
        return user;
    }
}
