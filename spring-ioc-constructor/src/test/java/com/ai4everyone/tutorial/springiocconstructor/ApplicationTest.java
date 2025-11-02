package com.ai4everyone.tutorial.springiocconstructor;

import com.ai4everyone.tutorial.springiocconstructor.api.GeneralService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    private static final Logger log = LoggerFactory.getLogger(ApplicationTest.class);
    static ApplicationContext context;

    @BeforeAll
    static void setup() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    void whenGeneralServiceCreatedBySpringContext_thenCustomerServiceShouldBeNotNull() {
        log.info("ApplicationTest#whenGeneralServiceCreatedBySpringContext_thenGeneralServiceShouldBeNotNull");
        var generalService = context.getBean("generalService", GeneralService.class);
        assertNotNull(generalService.getService());
    }
}
