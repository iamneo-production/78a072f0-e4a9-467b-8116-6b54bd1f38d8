package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.bookingapi.model.Booking;


public interface BookingRepo extends JpaRepository<Booking, Integer> {

        
}
