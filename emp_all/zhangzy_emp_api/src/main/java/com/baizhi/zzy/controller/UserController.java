package com.baizhi.zzy.controller;

import com.baizhi.zzy.entity.User;
import com.baizhi.zzy.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("queryuser")
    public int queryUser(@RequestBody User user){
        int login= userService.queryUser(user);
        return login;
    }
    @RequestMapping("adduser")
    public void addUser(@RequestBody User user){
        userService.addUserService(user);
    }
}
