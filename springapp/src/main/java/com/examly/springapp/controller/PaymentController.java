package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Payment;
import com.examly.springapp.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

   private final PaymentService paymentService;

   public PaymentController(PaymentService paymentService) {
       this.paymentService = paymentService;
   }

   @GetMapping("/{paymentId}")
   public Payment getPaymentById(@PathVariable int paymentId) {
       return paymentService.getPaymentById(paymentId);
   }

   @PostMapping("/{bookingId}/payments")
   public Payment createPaymentForBooking(@PathVariable int bookingId, @RequestBody Payment payment) {
       return paymentService.createPaymentForBooking(bookingId, payment);
   }

   @PutMapping("/{bookingId}/payments/{paymentId}")
   public Payment updatePaymentForBooking(@PathVariable int bookingId, @PathVariable int paymentId, @RequestBody Payment payment) {
       return paymentService.updatePaymentForBooking(bookingId, paymentId, payment);
   }

   @DeleteMapping("/{bookingId}/payments/{paymentId}")
   public void deletePaymentForBooking(@PathVariable int bookingId, @PathVariable int paymentId) {
       paymentService.deletePaymentForBooking(bookingId, paymentId);
   }
}
