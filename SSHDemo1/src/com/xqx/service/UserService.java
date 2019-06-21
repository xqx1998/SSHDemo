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

    // ��¼�ķ���
    public User login(User user) {
        // ����dao����ķ���

        return userDao.loginUser(user);
    }
}
