package com.springboot.miaosha.service.impl;

import com.springboot.miaosha.dao.UserMapper;
import com.springboot.miaosha.entity.User;
import com.springboot.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :王磊
 * @version :
 * @date :Created in 2022/9/3 2:37
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) throws Exception {
        return userMapper.selectByPrimaryKey(id);
    }
}
