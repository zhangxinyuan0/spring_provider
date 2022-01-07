package com.zxy.service;

import com.zxy.pojo.User;

import java.util.List;

/**
 * @Author 张新远
 * @date 2022/1/3 16:36
 * @Version 1.0
 */
public interface UserService {
    List<User> findAll();

    User getUserById(Long id);
}

