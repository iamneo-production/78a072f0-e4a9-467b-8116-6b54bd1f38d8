package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.springapp.model.Booking;


public interface BookingRepo extends JpaRepository<Booking, Integer> {

    // void put(int bookingId, Booking updatedBooking);

    // void remove(int bookingId);

    // Booking get(int bookingId);
}
