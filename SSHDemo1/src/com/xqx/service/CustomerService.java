package com.xqx.service;

import com.xqx.dao.CustomerDao;

public class CustomerService {
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
