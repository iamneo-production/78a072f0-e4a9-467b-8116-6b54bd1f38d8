package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.exceptions.NotFoundException;
import com.examly.springapp.model.Booking;
import com.examly.springapp.model.Cancellation;
import com.examly.springapp.model.Payment;
import com.examly.springapp.repository.BookingRepository;
import com.examly.springapp.repository.CancellationRepository;
import com.examly.springapp.repository.PaymentRepository;

@Service
public class BookingService {
    private BookingRepository bookingRepository;
    private PaymentRepository paymentRepository;
    private CancellationRepository cancellationRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository, PaymentRepository paymentRepository,
            CancellationRepository cancellationRepository) {
        this.bookingRepository = bookingRepository;
        this.paymentRepository = paymentRepository;
        this.cancellationRepository = cancellationRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBookingById(int bookingId) {
        return bookingRepository.findById(bookingId)
                .orElseThrow(() -> new NotFoundException("Booking not found with ID: " + bookingId));
    }

    public Booking createBooking(Booking booking) {
        // Perform any necessary validations or business logic
        return bookingRepository.save(booking);
    }

    public void deleteBooking(int bookingId) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new NotFoundException("Booking not found with ID: " + bookingId));

        // Perform any necessary validations or business logic

        bookingRepository.delete(booking);
    }

    public List<Payment> getAllPaymentsForBooking(int bookingId) {
        return paymentRepository.findByBookingId(bookingId);
    }

    public Payment createPaymentForBooking(int bookingId, Payment payment) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new NotFoundException("Booking not found with ID: " + bookingId));

        // Perform any necessary validations or business logic
        // Add the payment to the booking's payments list

        payment.setBooking(booking);
        return paymentRepository.save(payment);
    }

    public Payment updatePaymentForBooking(int bookingId, int paymentId, Payment updatedPayment) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new NotFoundException("Booking not found with ID: " + bookingId));

        Payment payment = paymentRepository.findById(paymentId)
                .orElseThrow(() -> new NotFoundException("Payment not found with ID: " + paymentId));

        // Perform any necessary validations or business logic
        // Update the properties of the payment object with the updatedPayment object

        return paymentRepository.save(payment);
    }

    public void deletePaymentForBooking(int bookingId, int paymentId) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new NotFoundException("Booking not found with ID: " + bookingId));

        Payment payment = paymentRepository.findById(paymentId)
                .orElseThrow(() -> new NotFoundException("Payment not found with ID: " + paymentId));

        // Perform any necessary validations or business logic

        paymentRepository.delete(payment);
    }

    public List<Cancellation> getAllCancellationsForBooking(int bookingId) {
        return cancellationRepository.findByBookingId(bookingId);
    }

    public Cancellation createCancellationForBooking(int bookingId, Cancellation cancellation) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new NotFoundException("Booking not found with ID: " + bookingId));

        // Perform any necessary validations or business logic
        // Add the cancellation to the booking's cancellations list

        cancellation.setBooking(booking);
        return cancellationRepository.save(cancellation);
    }

    public Cancellation updateCancellationForBooking(int bookingId, int cancellationId,
            Cancellation updatedCancellation) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new NotFoundException("Booking not found with ID: " + bookingId));

        Cancellation cancellation = cancellationRepository.findById(cancellationId)
                .orElseThrow(() -> new NotFoundException("Cancellation not found with ID: " + cancellationId));

        // Perform any necessary validations or business logic
        // Update the properties of the cancellation object with the updatedCancellation
        // object

        return cancellationRepository.save(cancellation);
    }

    public void deleteCancellationForBooking(int bookingId, int cancellationId) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new NotFoundException("Booking not found with ID: " + bookingId));

        Cancellation cancellation = cancellationRepository.findById(cancellationId)
                .orElseThrow(() -> new NotFoundException("Cancellation not found with ID: " + cancellationId));

        // Perform any necessary validations or business logic

        cancellationRepository.delete(cancellation);
    }
}
