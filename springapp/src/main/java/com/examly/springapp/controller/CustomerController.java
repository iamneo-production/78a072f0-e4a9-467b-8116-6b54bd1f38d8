<<<<<<< HEAD
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
=======
package com.customer.Customer.controller;

import com.customer.Customer.exception.ResourceNotFoundException;
import com.customer.Customer.model.Customer;
import com.customer.Customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")

public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;


    //get customers
    //http://localhost:8080/api/v1/customer
    @GetMapping("/customer")
    public List<Customer> displayMessage(){
       return customerRepository.findAll();
    }

    // save customer
    //http://localhost:8080/api/v1/customer
    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer cust){
        return customerRepository.save(cust);

    }

    // get  customer by id
    //http://localhost:8080/api/v1/customer/1
    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        Customer cust= customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not exist with id :" + id));
        return ResponseEntity.ok(cust);
    }

    // update customer by id
    //http://localhost:8080/api/v1/customer/1
    @PutMapping("/customer/{id}")
    public ResponseEntity<Customer> updateCustomerById(@PathVariable Long id, @org.jetbrains.annotations.NotNull @RequestBody Customer customer){
        Customer getCust= customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer not exist with id :" + id));
        getCust.setName(customer.getName());
        getCust.setCheckIn(customer.getCheckIn());
        getCust.setCheckOut(customer.getCheckOut());
        getCust.setEmail(customer.getEmail());
        getCust.setPhoneNumber(customer.getPhoneNumber());

        Customer updateCust = customerRepository.save(getCust);
        return ResponseEntity.ok(updateCust);
    }

    // delete customer by id
    //http://localhost:8080/api/v1/customer/{id}
    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        customerRepository.delete(customer);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
