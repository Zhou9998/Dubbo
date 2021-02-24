package com.z1s1c1.dubbo.web;

import com.z1s1c1.dubbo.model.User;
import com.z1s1c1.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model,Integer id){

        //根据用户标识获取用户详情
        User user = userService.queryUserById(id);
        //获取总人数
        Integer amount = userService.queryAllUserCount();
        model.addAttribute("user",user);
        model.addAttribute("amount",amount);
        return "userDetail";
    }
}
