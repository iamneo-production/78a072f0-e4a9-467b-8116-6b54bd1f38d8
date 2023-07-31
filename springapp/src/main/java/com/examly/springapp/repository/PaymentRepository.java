<<<<<<< HEAD
package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springapp.model.*;
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    
}
=======
package com.customer.Customer.repository;

import com.customer.Customer.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
    @Repository
    public interface PaymentRepository extends JpaRepository<Payment, Long> {

    }

>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
