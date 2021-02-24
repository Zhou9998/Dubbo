package com.zsc.dubbo.service.impl;

import com.zsc.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "Hello link Dubbo";
    }
}
