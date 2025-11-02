package com.ai4everyone.tutorial.springaopannotation.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {
    private static final Logger log = LoggerFactory.getLogger(AopConfig.class);

    public AopConfig() {
        log.info("AopConfig#AopConfig");
    }
}