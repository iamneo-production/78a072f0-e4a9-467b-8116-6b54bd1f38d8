package com.examly.springapp.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.springapp.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	List<Payment> findPaymentsByBookingId(int bookingId);
	List<Payment> findByBookingId(int bookingId);
}