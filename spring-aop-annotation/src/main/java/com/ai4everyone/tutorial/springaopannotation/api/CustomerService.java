package com.ai4everyone.tutorial.springaopannotation.api;

import com.ai4everyone.tutorial.springaopannotation.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAllCustomer();
    Optional<Customer> findCustomerById(Long customerId);
}
