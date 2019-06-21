package com.xqx.dao;

import com.xqx.entity.User;
import org.hibernate.Hibernate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    // private HibernateTemplate hibernateTemplate;
    //
    // public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
    //     this.hibernateTemplate = hibernateTemplate;
    // }

    //登录的方法

    @Override
    public User loginUser(User user) {
        //调用方法得到hibernateTemplate对象
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        //登录的查询操作
        //根据用户名和密码查询
        List<User> list = (List<User>) hibernateTemplate.
                find("from User where username=? and password=?",
                        user.getUsername(), user.getPassword());
        //判断
        if (list != null && list.size() != 0) {
            User u = list.get(0);
            return u;
        }
        return null;
    }
}
