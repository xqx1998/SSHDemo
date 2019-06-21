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

    //��¼�ķ���

    @Override
    public User loginUser(User user) {
        //���÷����õ�hibernateTemplate����
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        //��¼�Ĳ�ѯ����
        //�����û����������ѯ
        List<User> list = (List<User>) hibernateTemplate.
                find("from User where username=? and password=?",
                        user.getUsername(), user.getPassword());
        //�ж�
        if (list != null && list.size() != 0) {
            User u = list.get(0);
            return u;
        }
        return null;
    }
}
