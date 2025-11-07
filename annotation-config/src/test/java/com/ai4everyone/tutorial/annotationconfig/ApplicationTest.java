package com.ai4everyone.tutorial.annotationconfig;

import com.ai4everyone.tutorial.annotationconfig.config.AppConfig;
import com.ai4everyone.tutorial.annotationconfig.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ApplicationTest {
    static ConfigurableApplicationContext context;

    @BeforeAll
    public static void setup() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void whenCustomerObjectCreatedBySpringContext_thenCustomerObjectMustBeCreatedCorrectly() {
        log.info("ApplicationTest#whenCustomerObjectCreatedBySpringContext_thenCustomerObjectMustBeCreatedCorrectly");
        Customer customer = context.getBean("getCustomer", Customer.class);
        assertNotNull(customer);
        assertEquals(30, customer.getAge());
        assertEquals("someName", customer.getName());
    }

    @AfterAll
    public static void cleanup() {
        context.close();
    }
}
