package com.wwj.controller;

import com.wwj.pojo.User;
import com.wwj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("test")
    //@ResponseBody
    public String test(){
        return "user/userList";
    }

    @RequestMapping(value = "userLogin", method = RequestMethod.POST)
    public String userLogin(String username, String password, Model model){
        User user = userService.userLogin(username, password);
        model.addAttribute("username",user.getUsername());
        System.out.println(user);
        return "user/welcome";
    }

    @RequestMapping("userList")
    public String queryUserList(Model model){
        List<User> users = userService.queryUserList();
        model.addAttribute("users", users);
        return "user/userList";
    }
}
