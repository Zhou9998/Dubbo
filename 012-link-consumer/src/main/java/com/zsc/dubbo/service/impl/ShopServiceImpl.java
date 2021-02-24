package com.zsc.dubbo.service.impl;

import com.zsc.dubbo.service.ShopService;
import com.zsc.dubbo.service.UserService;

public class ShopServiceImpl implements ShopService {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String hello() {
        String sayHello = userService.sayHello();
        return sayHello;
    }

}
