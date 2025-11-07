package com.ai4everyone.tutorial.qualifier.service;

import com.ai4everyone.tutorial.qualifier.api.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("EXPIRED_CUSTOMER")
@Slf4j
public class ExpiredCustomer implements CustomerService {
    @Override
    public boolean isCustomerValid(String customerName) {
        log.info("ExpiredCustomer#isCustomerValid: {}", customerName);
        return false;
    }
}
