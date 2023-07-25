package com.customer.Customer.service;

import com.customer.Customer.model.Customer;
import com.customer.Customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public  Customer registerCustomer(Customer customer){
         return customerRepository.save(customer);
    };
}
