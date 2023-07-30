package main.java.com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.examly.springapp.model.Booking;


public interface BookingRepo extends JpaRepository<Booking, Integer> {

    
}
