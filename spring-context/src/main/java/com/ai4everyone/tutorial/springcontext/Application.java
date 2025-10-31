package com.ai4everyone.tutorial.springcontext;

import com.ai4everyone.tutorial.springcontext.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        log.info("Application#main");
        log.info("Initializing context");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer customer = context.getBean("customer", Customer.class);
        log.info(customer.toString());
    }
}
