package com.ai4everyone.tutorial.springaopxml.service;

import com.ai4everyone.tutorial.springaopxml.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAllCustomer();

    Optional<Customer> findCustomerById(Long customerId);
}
