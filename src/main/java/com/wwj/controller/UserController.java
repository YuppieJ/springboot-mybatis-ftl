package com.wwj.controller;

import com.wwj.pojo.User;
import com.wwj.service.UserService;
import org.apache.ibatis.javassist.expr.Instanceof;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "findUserById", method = RequestMethod.GET)
    public String findUserById(@RequestParam("id") Integer id, Model model){
        User userById = userService.findUserById(id);
        model.addAttribute("userById", userById);
        return "user/userInfo";
    }

    @RequestMapping(value = "userLogin", method = RequestMethod.POST)
    public String userLogin(String username, String password, Model model){
        User user = userService.userLogin(username, password);
        model.addAttribute("user",user);
        return "user/welcome";
    }

    @RequestMapping("userList")
    public String queryUserList(Model model){
        List<User> users = userService.queryUserList();
        model.addAttribute("users", users);
        return "user/userList";
    }

    @RequestMapping(value = "updateMyInfo", method = RequestMethod.POST)
    public String updateMyInfo(User user){
        Integer updateMyInfo = userService.updateMyInfo(user);
        if(updateMyInfo > 0){
            return "user/login";
        } else {
            return "user/userInfo";
        }
    }

    @RequestMapping(value = "findUserById/{id}")
    @ResponseBody
    public User findUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }
}
