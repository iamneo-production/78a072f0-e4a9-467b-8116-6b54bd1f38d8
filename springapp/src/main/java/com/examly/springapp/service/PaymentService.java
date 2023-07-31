<<<<<<< HEAD
package com.examly.springapp.service;

import com.examly.springapp.model.Payment;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaymentService {
    List<Payment> getAllPaymentsForBooking(int bookingId);

    Payment createPaymentForBooking(int bookingId, Payment payment);

    Payment updatePaymentForBooking(int bookingId, int paymentId, Payment payment);

    void deletePaymentForBooking(int bookingId, int paymentId);
}
=======
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
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
