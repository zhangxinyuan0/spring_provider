package com.zxy.controller;

import com.zxy.pojo.User;
import com.zxy.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 张新远
 * @date 2022/1/3 16:37
 * @Version 1.0
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("getUserById/{id}")
    public User getUserById(@PathVariable String id){
        return userService.getUserById(Long.parseLong(id));
    }
}

