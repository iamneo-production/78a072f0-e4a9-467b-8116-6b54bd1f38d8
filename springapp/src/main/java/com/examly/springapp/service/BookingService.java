<<<<<<< HEAD
package com.examly.springapp.service;


import org.springframework.stereotype.Service;

import com.examly.springapp.model.Booking;
import com.examly.springapp.repository.BookingRepo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BookingService {


    @Autowired
    private BookingRepo bookingRepo;

    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }

    public Booking getBookingById(int bookingId) {
        return bookingRepo.findById(bookingId).get();
        // return bookingRepo.get(bookingId);
    }

    public Booking createBooking(Booking booking) {
        return bookingRepo.save(booking);
    }

    public Booking updateBooking(int bookingId, Booking updatedBooking) {

        Booking booking = bookingRepo.findById(bookingId).get();

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
        
    }

    public void deleteBooking(int bookingId) {
        bookingRepo.deleteById(bookingId);
    }

>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
}