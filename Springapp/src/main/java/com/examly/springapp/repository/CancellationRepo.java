package com.examly.springapp.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springapp.model.Cancellation;
import com.examly.springapp.model.Booking;

public interface CancellationRepo extends JpaRepository<Cancellation,Integer>{
	List<Cancellation> findByBooking(Booking booking);
}