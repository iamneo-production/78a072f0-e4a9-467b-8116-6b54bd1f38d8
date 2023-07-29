package com.examly.springapp.service;

import com.examly.springapp.model.Payment;
import com.examly.springapp.repository.PaymentRepository;
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
