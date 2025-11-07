package com.ai4everyone.tutorial.qualifier.service;

import com.ai4everyone.tutorial.qualifier.api.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("ACTIVE_CUSTOMER")
@Slf4j
public class ActiveCustomer implements CustomerService {
    @Override
    public boolean isCustomerValid(String customerName) {
        log.info("ActiveCustomer#isCustomerValid: {}", customerName);
        return true;
    }
}
