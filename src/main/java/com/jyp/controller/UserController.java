package com.jyp.controller;

import com.jyp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/22 15:24
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
}
