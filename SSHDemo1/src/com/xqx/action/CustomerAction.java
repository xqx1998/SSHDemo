package com.xqx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xqx.service.CustomerService;

public class CustomerAction extends ActionSupport {
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    // 1.�����ҳ��
    public String toAddPage(){
        return "toAddPage";
    }

    //2.��ӷ���
    public String add(){

        return "add";
    }

    //3.�ͻ��б�ķ���
    public String  list(){
        return "list";
    }

    //4.�޸ĺ�ɾ���ķ���
}
