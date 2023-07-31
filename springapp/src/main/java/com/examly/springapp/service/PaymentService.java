package com.examly.springapp.service;

import com.examly.springapp.exception.ResourceNotFoundException;
import com.examly.springapp.model.Payment;
import com.examly.springapp.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> getAllpayments() {
        return paymentRepository.findAll();
    }

    // Method to add a new payment
    public Payment addPayment(Payment payment) {
        // Set the paymentDateTime to the current date and time
        payment.setPaymentDateTime(LocalDateTime.now());
        return paymentRepository.save(payment);
    }

    // Method to update an existing payment
    public Payment updatePayment(Long id, Payment updatedPayment) {
        Optional<Payment> existingPayment = paymentRepository.findById(id);
        if (existingPayment.isPresent()) {
            Payment payment = existingPayment.get();
            // Update payment fields with the values from updatedPayment
            payment.setAmount(updatedPayment.getAmount());
            payment.setPaymentStatus(updatedPayment.getPaymentStatus());
            return paymentRepository.save(payment);
        } else {
            throw new ResourceNotFoundException("Payment not found with id: " + id);
        }
    }

    // Method to get all payments
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Method to get a payment by id
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Payment not found with id: " + id));
    }

    // Method to delete a payment by id
    public void deletePayment(Long id) {
        Optional<Payment> existingPayment = paymentRepository.findById(id);
        if (existingPayment.isPresent()) {
            paymentRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Payment not found with id: " + id);
        }
    }
}
