package com.examly.springapp.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Model.Customer;
import com.examly.springapp.Repository.CustomerRepo;

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

    public Customer getCustomerById(Long id) {
        return customerRepo.findById(id).orElse(null);
    }

    public Customer updateCustomer(Long id, Customer customer) {
        if (customerRepo.existsById(id)) {
            customer.setId(id);
            return customerRepo.save(customer);
        } else {
            return null;
        }
    }

    public void deleteCustomer(Long id) {
        customerRepo.deleteById(id);
    }

	
}

