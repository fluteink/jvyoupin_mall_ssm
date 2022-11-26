package com.jyp.service;

import com.jyp.pojo.User;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/22 15:24
 */
public interface UserService {
    List<User> getAllUsers();

    void addUser(User u);
}
