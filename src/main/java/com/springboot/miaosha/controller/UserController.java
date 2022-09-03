package com.springboot.miaosha.controller;

import com.springboot.miaosha.entity.User;
import com.springboot.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :王磊
 * @version :
 * @date :Created in 2022/9/3 2:41
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    public User getUserById(@RequestParam(name = "id") int id) {
        try {
            User user = userService.getUserById(id);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
