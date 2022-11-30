package com.jyp.service.impl;

import com.jyp.mapper.UserMapper;
import com.jyp.pojo.User;
import com.jyp.pojo.UserExample;
import com.jyp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/22 15:25
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {

        List<User> users = userMapper.selectByExample(new UserExample());
        return users;
    }

    @Override
    public void addUser(User u) {
        userMapper.insert(u);
    }

    @Override
    public List<User> loginselect(User u) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameEqualTo(u.getName()).andPasswordEqualTo(u.getPassword());
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public User finduserbyid(Integer uid) {
        User user = userMapper.selectByPrimaryKey(uid);
        return user;
    }
}
