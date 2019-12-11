package com.wwj.service;

import com.wwj.pojo.User;

import java.util.List;

public interface UserService {

    User findUserById(Integer id);

    User userLogin(String username, String password);

    List<User> queryUserList();

    Integer updateMyInfo(User user);
}
