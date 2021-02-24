package com.z1s1c1.dubbo.service.impl;

import com.z1s1c1.dubbo.model.User;
import com.z1s1c1.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("zhangsan");
        user.setAge(20);
        return user;
    }
}
