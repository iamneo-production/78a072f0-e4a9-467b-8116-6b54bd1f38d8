package com.examly.springapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Customer;
import com.examly.springapp.repository.CustomerRepo;



import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    public Customer getCustomerById(Integer id) {
        return customerRepo.findById(id).orElse(null);
    }



    public Customer updateCustomer(Integer id, Customer customer) {
        if (customerRepo.existsById(id)) {
            customer.setCustomerId(id);
            return customerRepo.save(customer);
        } else {
            return null;
        }
    }

    public void deleteCustomer(Integer id) {
        customerRepo.deleteById(id);
    }
}