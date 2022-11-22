package com.jyp.controller;

import com.jyp.pojo.User;
import com.jyp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/22 15:24
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("user")
    public String user() {
        return "admin/user_list";
    }

    @RequestMapping("listuser")
    @ResponseBody
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
