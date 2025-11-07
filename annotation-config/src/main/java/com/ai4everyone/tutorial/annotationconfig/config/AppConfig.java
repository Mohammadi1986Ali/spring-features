package com.ai4everyone.tutorial.annotationconfig.config;

import com.ai4everyone.tutorial.annotationconfig.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ai4everyone.tutorial"})
@Slf4j
public class AppConfig {

    @Bean
    public Customer getCustomer() {
        log.info("AppConfig#getCustomer");
        return Customer.builder().name("someName").age(30).build();
    }
}
