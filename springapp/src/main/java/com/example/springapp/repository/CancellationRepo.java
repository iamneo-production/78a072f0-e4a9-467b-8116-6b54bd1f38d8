package com.example.springapp.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.springapp.model.Cancellation;
import com.example.springapp.model.Booking;

public interface CancellationRepo extends JpaRepository<Cancellation,Integer>{
	@Query("SELECT c FROM Cancellation c WHERE c.booking = :booking")
    List<Cancellation> findAllByBooking(@Param("booking") Booking booking);
}
