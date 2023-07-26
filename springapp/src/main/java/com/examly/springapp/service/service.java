package com.examly.springapp.service;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.booking.bookingapi.model.Booking;

import com.booking.bookingapi.repository.BookingRepo;

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
        // return bookingRepo.get(bookingId);
    }

    public Booking createBooking(Booking booking) {
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
        // bookingRepo.put(bookingId, updatedBooking);
        // return updatedBooking;
    }

    public void deleteBooking(int bookingId) {
        bookingRepo.deleteById(bookingId);
        // bookingRepo.remove(bookingId);
    }

}