<<<<<<< HEAD
package com.examly.springapp.service;

public class CustomerService {
    
}
=======
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
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
