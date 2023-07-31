package com.examly.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examly.springapp.exceptions.NotFoundException;
import com.examly.springapp.model.Booking;
import com.examly.springapp.model.Payment;
import com.examly.springapp.repository.BookingRepository;
import com.examly.springapp.repository.PaymentRepository;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final BookingRepository bookingRepository;

    public PaymentService(PaymentRepository paymentRepository, BookingRepository bookingRepository) {
        this.paymentRepository = paymentRepository;
        this.bookingRepository = bookingRepository;
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(int paymentId) {
        return paymentRepository.findById(paymentId)
                .orElseThrow(() -> new NotFoundException("Payment not found"));
    }

    public Payment createPaymentForBooking(int bookingId, Payment payment) {
        Booking booking = getBookingById(bookingId);
        payment.setBooking(booking);
        return paymentRepository.save(payment);
    }

    public Payment updatePaymentForBooking(int bookingId, int paymentId, Payment updatedPayment) {
        Payment payment = getPaymentById(paymentId);
        payment.setBooking(getBookingById(bookingId));
        // Update the payment with new data from updatedPayment
        // ...
        return paymentRepository.save(payment);
    }

    public void deletePaymentForBooking(int bookingId, int paymentId) {
        Payment payment = getPaymentById(paymentId);
        if (payment.getBooking().getId() != bookingId) {
            throw new NotFoundException("Payment not found for the given booking");
        }
        paymentRepository.delete(payment);
    }

    public List<Payment> getPaymentsForBooking(int bookingId) {
        return paymentRepository.findPaymentsByBookingId(bookingId);
    }

    private Booking getBookingById(int bookingId) {
        return bookingRepository.findById(bookingId)
                .orElseThrow(() -> new NotFoundException("Booking not found"));
    }
}

