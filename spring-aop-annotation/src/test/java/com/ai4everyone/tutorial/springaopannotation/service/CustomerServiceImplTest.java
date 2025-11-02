package com.ai4everyone.tutorial.springaopannotation.service;

import com.ai4everyone.tutorial.springaopannotation.api.CustomerService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CustomerServiceImplTest {
    private static final Logger log = LoggerFactory.getLogger(CustomerServiceImplTest.class);
    static ApplicationContext context;

    @BeforeAll
    static void setup() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    void whenCustomerObjectCreatedByApplicationContext_thenCustomerMustBeCreated() {
        log.info("CustomerServiceImplTest#whenCustomerObjectCreatedByApplicationContext_thenCustomerMustBeCreated");
        CustomerService customerService = context.getBean("customerService", CustomerServiceImpl.class);
        customerService.findCustomerById(100L);
        customerService.findAllCustomer();
    }
}