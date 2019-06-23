package com.xqx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xqx.service.CustomerService;

public class CustomerAction extends ActionSupport {
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    // 1.到添加页面
    public String toAddPage(){
        return "toAddPage";
    }

    //2.添加方法
    public String add(){

        return "add";
    }

    //3.客户列表的方法
    public String  list(){
        return "list";
    }

    //4.修改和删除的方法
}
