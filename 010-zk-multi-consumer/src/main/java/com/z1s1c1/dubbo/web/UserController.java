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

    @Autowired
    private UserService userService2;

    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model , Integer id, String name){
        User user = userService.queryUserById(id,name);
        User user2 = userService2.queryUserById(id,name);

        model.addAttribute("user",user);
        model.addAttribute("user2",user2);
        return "userDetail";
    }

    @RequestMapping(value = "userDetail2")
    public String userDetail2(Model model,Integer id,String name){
        User user2 = userService2.queryUserById(id,name);

        model.addAttribute("user2",user2);
        return "userDetail";
    }
}
