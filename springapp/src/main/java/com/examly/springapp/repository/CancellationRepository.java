package com.examly.springapp.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Cancellation;

@Repository
public interface CancellationRepository extends JpaRepository<Cancellation, Integer> {
	List<Cancellation> findByBookingId(int bookingId);
}