package com.wwj.mapper;

import com.wwj.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    User findUserById(Integer id);

    User userLogin(@Param("username") String username, @Param("password") String password);

    List<User> queryUserList();

    Integer updateMyInfo(User user);
}
