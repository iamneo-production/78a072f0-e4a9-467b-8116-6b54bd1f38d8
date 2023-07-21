package com.examly.springapp.Controller;

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
import org.springframework.web.bind.annotation.CrossOrigin;

import com.examly.springapp.Model.Customer;
import com.examly.springapp.Service.CustomerService;

@RestController
@CrossOrigin(origins= "https://8081-ceafffcbaffbffebceaeaadbdbabf.project.examly.io/")
@RequestMapping("/api/v1")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/customer/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long customerid,@RequestBody Customer customer){
    	Customer customerItems = customerService.getCustomerById(customerid);
    	customerItems.setCustomerId(customer.getCustomerId());
    	customerItems.setFirstName(customer.getFirstName());
    	customerItems.setLastName(customer.getLastName());
    	customerItems.setEmail(customer.getEmail());
    	customerItems.setPassword(customer.getPassword());
    	customerItems.setPhoneNumber(customer.getPhoneNumber());
    	customerItems.setGender(customer.getGender());
    	customerItems.setAddress(customer.getAddress());
    	customerItems.setState(customer.getState());
    	customerItems.setPincode(customer.getPincode());

    	return ResponseEntity.ok(customerItems);
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteCustomer(@PathVariable Long customerid){

    	 
    	  customerService.deleteCustomer(customerid);
    	  Map<String, Boolean> response = new HashMap<>();
    	  response.put("deleted",Boolean.TRUE);
    	  return ResponseEntity.ok(response);
       
    }
}
