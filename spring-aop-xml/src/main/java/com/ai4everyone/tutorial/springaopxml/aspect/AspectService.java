package com.ai4everyone.tutorial.springaopxml.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AspectService {
    private static final Logger log = LoggerFactory.getLogger(AspectService.class);

    public void beforeService() {
        log.info("AspectService#beforeService");
    }

    public void afterService() {
        log.info("AspectService#afterService");
    }
}
