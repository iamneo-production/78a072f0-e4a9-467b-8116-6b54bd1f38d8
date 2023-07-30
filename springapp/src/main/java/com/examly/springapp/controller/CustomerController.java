package com.examly.springapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Customer;
import com.examly.springapp.service.CustomerService;

import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@CrossOrigin(origins = "https://8081-eccfdafeaeefbffebceaeaadbdbabf.project.examly.io")
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/bookings")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return ResponseEntity.ok (this.customerService.getAllCustomers());
    }



    @GetMapping("/{customerId}/bookings")
    public ResponseEntity<Customer> getCustomer(@PathVariable Integer customerId) {
        return ResponseEntity.ok(this.customerService.getCustomerById(customerId));
    }

    @PostMapping("/bookings")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/{customerId}/bookings")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Integer customerId, @RequestBody Customer customer) {
        Customer customerItems = customerService.getCustomerById(customerId);
        customerItems.setCustomerId(customer.getCustomerId());
        customerItems.setName(customer.getName());
        customerItems.setEmail(customer.getEmail());
        customerItems.setPhone(customer.getPhone());

        return ResponseEntity.ok(customerItems);
    }

    @DeleteMapping("/{customerId}/bookings")
    public ResponseEntity<Map<String, Boolean>> deleteCustomer(@PathVariable Integer customerId) {
        customerService.deleteCustomer(customerId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
