package com.springboot.miaosha.service;

import com.springboot.miaosha.bean.UserBean;
import com.springboot.miaosha.dao.UserMapper;
import com.springboot.miaosha.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author :王磊
 * @version :
 * @date :Created in 2022/9/3 2:36
 * @description:
 */
public interface UserService {

    UserBean getUserById(Integer id) throws Exception;
}
