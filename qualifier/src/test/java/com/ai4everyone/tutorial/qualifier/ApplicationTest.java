package com.ai4everyone.tutorial.qualifier;

import com.ai4everyone.tutorial.qualifier.api.CustomerService;
import com.ai4everyone.tutorial.qualifier.config.AppConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
@Slf4j
class ApplicationTest {

    @Autowired
    @Qualifier("ACTIVE_CUSTOMER")
    CustomerService customerService;

    @Test
    public void whenUsingQualifier_thenAutowiredBeanShouldWorksCorrectly() {
        log.info("ApplicationTest#whenUsingQualifier_thenAutowiredBeanShouldWorksCorrectly");
        assertTrue(customerService.isCustomerValid("someName"));
    }
}