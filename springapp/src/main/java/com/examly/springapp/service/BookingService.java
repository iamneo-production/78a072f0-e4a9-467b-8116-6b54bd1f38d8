<<<<<<< HEAD
package com.examly.springapp.service;

import com.examly.springapp.model.*;
import com.examly.springapp.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    private final PaymentRepository paymentRepository;
    private final CancellationRepository cancellationRepository;

    public BookingService(
            BookingRepository bookingRepository,
            PaymentRepository paymentRepository,
            CancellationRepository cancellationRepository) {
        this.bookingRepository = bookingRepository;
        this.paymentRepository = paymentRepository;
        this.cancellationRepository = cancellationRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBookingById(int bookingId) {
        Optional<Booking> booking = bookingRepository.findById(bookingId);
        return booking.orElseThrow(() -> null);
=======
package main.java.com.examly.springapp.service;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.examly.springapp.model.Booking;
import main.java.com.examly.springapp.repository.BookingRepo;

import java.util.List;

@Service
public class BookingService {


    @Autowired
    private BookingRepo bookingRepo;

    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }

    public Booking getBookingById(int bookingId) {
        return bookingRepo.findById(bookingId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid booking Id:" + bookingId));
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
        
    }

    public Booking createBooking(Booking booking) {
<<<<<<< HEAD
        return bookingRepository.save(booking);
    }

    public Booking updateBooking(int bookingId, Booking updatedBooking) {
        Booking booking = getBookingById(bookingId);

        booking.setCheckInDate(updatedBooking.getCheckInDate());
        booking.setCheckOutDate(updatedBooking.getCheckOutDate());
        booking.setRoom(updatedBooking.getRoom());
        booking.setCustomer(updatedBooking.getCustomer());
        booking.setPayments(updatedBooking.getPayments());
        booking.setCancellations(updatedBooking.getCancellations());
    
        return bookingRepository.save(booking);
    }    

    public void deleteBooking(int bookingId) {
        Booking booking = getBookingById(bookingId);
        bookingRepository.delete(booking);
    }

    public List<Payment> getAllPaymentsForBooking(int bookingId) {
        Booking booking = getBookingById(bookingId);
        return booking.getPayments();
    }

    public Payment createPaymentForBooking(int bookingId, Payment payment) {
        Booking booking = getBookingById(bookingId);
        Payment pay = paymentRepository.save(payment);
        booking.getPayments().add(pay);
        bookingRepository.save(booking);
        return pay;
    }

    public Payment updatePaymentForBooking(int bookingId, int paymentId, Payment updatedPayment) {
        Booking booking = getBookingById(bookingId);
        
        List<Payment> payments = booking.getPayments();
        Payment payment = payments.stream()
        .filter(p -> p.getPaymentId() == paymentId)
        .findFirst()
        .orElse(null);
        if (payment == null) {
            return null;
        }
        
        payment.setAmount(updatedPayment.getAmount());
        payment.setPaymentDateTime(updatedPayment.getPaymentDateTime());
        payment.setPaymentStatus(updatedPayment.getPaymentStatus());
    
    
        bookingRepository.save(booking);
    
        return payment;
    }
    

    public void deletePaymentForBooking(int bookingId, int paymentId) {
        Booking booking = getBookingById(bookingId);
        List<Payment> payments = booking.getPayments();
        Payment payment = payments.stream()
        .filter(p -> p.getPaymentId() == paymentId)
        .findFirst()
        .orElse(null);
        if (payment == null) {
            return;
        }
        payments.remove(payment);
        booking.setPayments(payments);
        bookingRepository.save(booking);
        paymentRepository.delete(payment);
    }

    public List<Cancellation> getAllCancellationsForBooking(int bookingId) {
        Booking booking = getBookingById(bookingId);
        return booking.getCancellations();
    }

    public Cancellation createCancellationForBooking(int bookingId, Cancellation cancellation) {
        Booking booking = getBookingById(bookingId);
        Cancellation cancel = cancellationRepository.save(cancellation);
        booking.getCancellations().add(cancel);
        bookingRepository.save(booking);
        return cancel;
    }

    public Cancellation updateCancellationForBooking(
        int bookingId, int cancellationId, Cancellation updatedCancellation) {
    Booking booking = getBookingById(bookingId);

    List<Cancellation> cancellations = booking.getCancellations();
    Cancellation cancellationToUpdate = null;
    
    for (Cancellation cancellation : cancellations) {
        if (cancellation.getCancellationId() == cancellationId) {
            cancellationToUpdate = cancellation;
            break;
        }
    }

    if (cancellationToUpdate == null) {
        return null;
    }

    cancellationToUpdate.setDateCancelled(updatedCancellation.getDateCancelled());
    cancellationToUpdate.setReason(updatedCancellation.getReason());


    bookingRepository.save(booking);

    return cancellationToUpdate;
}


public void deleteCancellationForBooking(int bookingId, int cancellationId) {
    Booking booking = getBookingById(bookingId);

    Cancellation cancellationToRemove = null;
    List<Cancellation> cancellations = booking.getCancellations();
    
    for (Cancellation cancellation : cancellations) {
        if (cancellation.getCancellationId() == cancellationId) {
            cancellationToRemove = cancellation;
            break;
        }
    }

    if (cancellationToRemove == null) {
        return;
    }

    
    cancellations.remove(cancellationToRemove);
    booking.setCancellations(cancellations);
    bookingRepository.save(booking);
    cancellationRepository.delete(cancellationToRemove);
}
=======
        return bookingRepo.save(booking);
    }

    public Booking updateBooking(int bookingId, Booking updatedBooking) {

        Booking booking = bookingRepo.findById(bookingId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid booking Id:" + bookingId));

        booking.setCheckInDate(updatedBooking.getCheckInDate());
        booking.setCheckOutDate(updatedBooking.getCheckOutDate());
        booking.setGuests(updatedBooking.getGuests());
        booking.setPreferences(updatedBooking.getPreferences());
        booking.setRoomType(updatedBooking.getRoomType());
        booking.setCustomer(updatedBooking.getCustomer());

        return bookingRepo.save(booking);
        
    }

    public void deleteBooking(int bookingId) {
        bookingRepo.deleteById(bookingId);
    }

>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
}