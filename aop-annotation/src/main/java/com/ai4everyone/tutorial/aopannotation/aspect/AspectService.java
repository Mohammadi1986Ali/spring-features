package com.ai4everyone.tutorial.aopannotation.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectService {
    private static final Logger log = LoggerFactory.getLogger(AspectService.class);

    @Before("execution(* com.ai4everyone.tutorial.aopannotation.service.CustomerServiceImpl+.*(..))")
    public void beforeService() {
        log.info("AspectService#beforeService");
    }

    @After("execution(* com.ai4everyone.tutorial.aopannotation.service.CustomerServiceImpl+.*(..))")
    public void afterService() {
        log.info("AspectService#afterService");
    }
}