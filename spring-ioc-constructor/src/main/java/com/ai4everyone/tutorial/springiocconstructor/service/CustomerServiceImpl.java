package com.ai4everyone.tutorial.springiocconstructor.service;

import com.ai4everyone.tutorial.springiocconstructor.api.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerServiceImpl implements CustomerService {
    private static final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

    public CustomerServiceImpl() {
        log.info("CustomerServiceImpl#CustomerServiceImpl");
    }

    @Override
    public void welcomeCustomer(String customerName) {
        log.info("CustomerServiceImpl#welcomeCustomer");
        log.info("Welcome: {}", customerName);
    }

    public void beanInitMethod() {
        log.info("CustomerServiceImpl#beanInitMethod");
    }

    public void beanDestroyMethod() {
        log.info("CustomerServiceImpl#beanDestroyMethod");
    }
}
