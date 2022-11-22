package com.jyp.service.impl;

import com.jyp.mapper.UserMapper;
import com.jyp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/22 15:25
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
}
