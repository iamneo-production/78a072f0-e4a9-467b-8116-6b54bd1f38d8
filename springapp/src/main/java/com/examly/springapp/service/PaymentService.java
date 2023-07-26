package com.customer.Customer.service;

import com.customer.Customer.model.Payment;
import com.customer.Customer.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PaymentService {

        private final PaymentRepository paymentRepository;

        @Autowired
        public PaymentService(PaymentRepository paymentRepository) {
            this.paymentRepository = paymentRepository;
        }
    }
