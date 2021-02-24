package com.z1s1c1.dubbo.service;

import com.z1s1c1.dubbo.model.User;

public interface UserService {
    //根据用户标识获取用户信息
    User queryUserById(Integer id);

    //查询用户总人数
    Integer queryAllUserCount();
}
