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
import com.examly.springapp.service.PaymentService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "https://8081-ceafffcbaffbffebceaeaadbdbabf.project.examly.io")

public class PaymentController {
    @Autowired
    PaymentRepository paymentRepository;
    private final PaymentService paymentService; 
    
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @GetMapping("/payments")
    public ResponseEntity<List<Payment>> getAllPayments() {
        return ResponseEntity.ok (this.paymentService.getAllPayments());
    }

    @GetMapping("/bookings/{bookingId}")
    public List<Payment> displayPayment(@PathVariable Long bookingId) 
    {return paymentRepository.findAll();}
    

  
    @PostMapping("/bookings/{bookingId}/payments")
    public Payment addPayment(@PathVariable Long bookingId, @RequestBody Payment pay) {
        return paymentRepository.save(pay);
    }


    @PutMapping("/bookings/{bookingId}/payments/{paymentId}")
    public ResponseEntity<Payment> updatepaymentById(@PathVariable Long bookingId, @PathVariable Long paymentId, @RequestBody Payment payment) {
        Payment getPay = paymentRepository.findById(bookingId).orElseThrow(() -> new ResourceNotFoundException("Customer not exist with id: " + bookingId));
        getPay.setPaymentId(payment.getPaymentId());
        getPay.setAmount(payment.getAmount());
        getPay.setPaymentDateTime(payment.getPaymentDateTime());
        getPay.setPaymentStatus(payment.getPaymentStatus());
    
        Payment updatePay = paymentRepository.save(getPay);
        return ResponseEntity.ok(updatePay);
    }
    
    @DeleteMapping("/bookings/{bookingId}/payments/{paymentId}")
    public ResponseEntity<Map<String,Boolean>> deletePayment(@PathVariable Long bookingId, @PathVariable Long paymentId) {
        Payment payment = paymentRepository.findById(paymentId).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + paymentId));
    
        paymentRepository.delete(payment);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}


