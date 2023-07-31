package com.examly.springapp.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

=======
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
import com.examly.springapp.model.Cancellation;
import com.examly.springapp.model.Booking;

public interface CancellationRepo extends JpaRepository<Cancellation,Integer>{
<<<<<<< HEAD
	@Query("SELECT c FROM Cancellation c WHERE c.booking = :booking")
    List<Cancellation> findAllByBooking(@Param("booking") Booking booking);
=======
	List<Cancellation> findByBooking(Booking booking);
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
}