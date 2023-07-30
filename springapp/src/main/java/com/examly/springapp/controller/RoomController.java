package com.examly.springapp.controller;
import com.examly.springapp.exception.ResourceNotFoundException;
import com.examly.springapp.model.Payment;
import com.examly.springapp.repository.PaymentRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(" /bookings/{bookingId}/payments")
@CrossOrigin(origins = "https://8081-ceafffcbaffbffebceaeaadbdbabf.project.examly.io/")

public class PaymentController {
    @Autowired
    PaymentRepository paymentRepository;


    @GetMapping("/payments")
    public List<Payment> displayPayment(){return paymentRepository.findAll();}


  
    @PostMapping("/payments")
    public Payment addPayment(@RequestBody Payment pay){
        return paymentRepository.save(pay);
    }


    @PutMapping("/payments/{paymentId}")
    public ResponseEntity<Payment> updatepaymentById(@PathVariable Long id,@RequestBody Payment payment) {
        Payment getPay=paymentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer not exist with id :" + id));
        getPay.setPaymentId(payment.getPaymentId());
        getPay.setAmount(payment.getAmount());
        getPay.setPaymentDateTime(payment.getPaymentDateTime());
        getPay.setPaymentStatus(payment.getPaymentStatus());

        Payment updatePay =paymentRepository.save(getPay);
        return ResponseEntity.ok(updatePay);
    }



    @DeleteMapping("/payments/{paymentId}")
    public ResponseEntity<Map<String,Boolean>> deletePayment(@PathVariable Long id){
        Payment payment=paymentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        paymentRepository.delete(payment);
        Map<String, Boolean> response =new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}


