package com.xqx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xqx.entity.User;
import com.xqx.service.UserService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class UserAction extends ActionSupport {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // ��¼�ķ���
    public String login(){
        //��װʵ�������
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        // ����service�ķ���ʵ��
        User userExist = userService.login(user);
        //�ж�
        if(userExist != null){//�ɹ�
            //ʹ��session���ֵ�¼״̬
            HttpServletRequest request = ServletActionContext.getRequest();
            request.getSession().setAttribute("user", userExist);
            return "loginsuccess";
        }else {//ʧ��
            return "login";
        }
    }
}
