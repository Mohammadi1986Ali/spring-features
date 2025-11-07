package com.ai4everyone.tutorial.annotationconfig.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Builder
@Slf4j
public class Customer {
    private String name;
    private Integer age;

    @PostConstruct
    public void postConstruct(){
        log.info("Customer#postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        log.info("Customer#preDestroy");
    }
}
