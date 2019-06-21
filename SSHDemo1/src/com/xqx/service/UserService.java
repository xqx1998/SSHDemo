package com.xqx.service;

import com.xqx.dao.UserDao;
import com.xqx.entity.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    // 登录的方法
    public User login(User user) {
        // 调用dao里面的方法

        return userDao.loginUser(user);
    }
}
