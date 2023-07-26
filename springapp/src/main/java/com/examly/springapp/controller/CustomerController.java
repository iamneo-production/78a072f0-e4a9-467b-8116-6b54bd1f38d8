package main.java.com.examly.springapp.controller;

import com.examly.springapp.exception.ResourceNotFoundException;
import com.examly.springapp.model.Customer;
import com.examly.springapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "https://8081-aeadcaeeecbffebcfbfbfaeedd.project.examly.io/")

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

