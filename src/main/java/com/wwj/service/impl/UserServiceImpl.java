package com.wwj.service.impl;

import com.wwj.mapper.UserMapper;
import com.wwj.pojo.User;
import com.wwj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public User userLogin(String username, String password) {
        return userMapper.userLogin(username, password);
    }

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public Integer updateMyInfo(User user) {
        return userMapper.updateMyInfo(user);
    }
}
