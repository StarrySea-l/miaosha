package com.springboot.miaosha.controller;

import com.springboot.miaosha.base.ResultBean;
import com.springboot.miaosha.bean.UserBean;
import com.springboot.miaosha.controller.viewobject.UserVO;
import com.springboot.miaosha.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author :王磊
 * @version :
 * @date :Created in 2022/9/3 2:41
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public ResultBean getUserById(Integer id) {
        try {
            if (null == id) {
                return ResultBean.fail("参数不能为空");
            }
            UserBean userBean = userService.getUserById(id);
            if (null == userBean) {
                return ResultBean.fail("用户不存在");
            }
            UserVO userVO = convertFromDataObject(userBean);
            return ResultBean.success(userVO);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private UserVO convertFromDataObject(UserBean userBean) {
        if (null == userBean) {
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userBean, userVO);
        return userVO;
    }

}
