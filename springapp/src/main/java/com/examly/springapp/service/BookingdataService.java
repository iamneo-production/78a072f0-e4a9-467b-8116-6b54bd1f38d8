package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.exceptions.NotFoundException;
import com.examly.springapp.model.Bookingdata;
import com.examly.springapp.repository.BookingdataRepository;
import com.examly.springapp.repository.CancellationRepository;
import com.examly.springapp.repository.PaymentRepository;

@Service
public class BookingdataService {
    private BookingdataRepository bookingdataRepository;
    private PaymentRepository paymentRepository;
    private CancellationRepository cancellationRepository;

    @Autowired
    public BookingdataService(BookingdataRepository bookingdataRepository, PaymentRepository paymentRepository,
            CancellationRepository cancellationRepository) {
        this.bookingdataRepository = bookingdataRepository;
        this.paymentRepository = paymentRepository;
        this.cancellationRepository = cancellationRepository;
    }

    public Bookingdata updateBooking(int bookingId, Bookingdata updatedBooking) {
        Bookingdata existingBooking = bookingdataRepository.findById(bookingId)
                .orElseThrow(() -> new NotFoundException("Booking not found with id: " + bookingId));

        // Update all fields from the updatedBooking object
        existingBooking.setCheckInDate(updatedBooking.getCheckInDate());
        existingBooking.setCheckOutDate(updatedBooking.getCheckOutDate());
        existingBooking.setCustomerId(updatedBooking.getCustomerId());
        existingBooking.setName(updatedBooking.getName());
        existingBooking.setEmail(updatedBooking.getEmail());
        existingBooking.setPhone(updatedBooking.getPhone());
        existingBooking.setRoom(updatedBooking.getRoom());
        existingBooking.setPayment(updatedBooking.getPayment());
        existingBooking.setCancellation(updatedBooking.getCancellation());

        // Save the updated booking to the database
        return bookingdataRepository.save(existingBooking);
    }
}
