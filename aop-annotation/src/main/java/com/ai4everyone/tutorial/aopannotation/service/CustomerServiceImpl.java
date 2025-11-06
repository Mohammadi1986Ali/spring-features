package com.ai4everyone.tutorial.aopannotation.service;

import com.ai4everyone.tutorial.aopannotation.api.CustomerService;
import com.ai4everyone.tutorial.aopannotation.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component("customerService")
public class CustomerServiceImpl implements CustomerService {
    private static final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

    public CustomerServiceImpl() {
        log.info("CustomerServiceImpl#CustomerServiceImpl");
    }

    @Override
    public List<Customer> findAllCustomer() {
        log.info("CustomerServiceImpl#findAllCustomer");
        return Collections.emptyList();
    }

    @Override
    public Optional<Customer> findCustomerById(Long customerId) {
        log.info("CustomerServiceImpl#findCustomerById: {}", customerId);
        return Optional.empty();
    }
}
