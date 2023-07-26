package com.customer.Customer.controller;
import com.customer.Customer.exception.ResourceNotFoundException;
import com.customer.Customer.model.Payment;
import com.customer.Customer.repository.PaymentRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")

public class PaymentController {
    @Autowired
    PaymentRepository paymentRepository;


    //get payment
    //http://localhost:8080/api/v1/payment

    @GetMapping("/payment")
    public List<Payment> displayPayment(){return paymentRepository.findAll();}


    // save payment
    //http://localhost:8080/api/v1/payment

    @PostMapping("/payment")
    public Payment addPayment(@RequestBody Payment pay){
        return paymentRepository.save(pay);
    }


    //get payment by id
    //http://localhost:8080/api/v1/payment/1

    @PutMapping("/payment/{id}")
    public ResponseEntity<Payment> updatepaymentById(@PathVariable Long id,@RequestBody Payment payment) {
        Payment getPay=paymentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer not exist with id :" + id));
        getPay.setPaymentId(payment.getPaymentId());
        getPay.setAmount(payment.getAmount());
        getPay.setPaymentDateTime(payment.getPaymentDateTime());
        getPay.setPaymentStatus(payment.getPaymentStatus());

        Payment updatePay =paymentRepository.save(getPay);
        return ResponseEntity.ok(updatePay);
    }

    //delete payment by id
    //http://localhost:8080/api/v1/payment/{id}

    @DeleteMapping("/payment/{id}")
    public ResponseEntity<Map<String,Boolean>> deletePayment(@PathVariable Long id){
        Payment payment=paymentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        paymentRepository.delete(payment);
        Map<String, Boolean> response =new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}


