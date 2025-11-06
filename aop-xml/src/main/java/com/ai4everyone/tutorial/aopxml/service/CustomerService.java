package com.ai4everyone.tutorial.aopxml.service;

import com.ai4everyone.tutorial.aopxml.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAllCustomer();

    Optional<Customer> findCustomerById(Long customerId);
}
