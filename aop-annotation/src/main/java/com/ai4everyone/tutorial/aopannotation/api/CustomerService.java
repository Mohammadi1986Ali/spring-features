package com.ai4everyone.tutorial.aopannotation.api;

import com.ai4everyone.tutorial.aopannotation.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAllCustomer();
    Optional<Customer> findCustomerById(Long customerId);
}
