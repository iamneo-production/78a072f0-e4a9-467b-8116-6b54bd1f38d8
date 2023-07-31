package com.examly.springapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.examly.springapp.model.Booking;
import com.examly.springapp.model.Cancellation;
import com.examly.springapp.repository.BookingRepo;
import com.examly.springapp.repository.CancellationRepo;

@Service
public class CancellationService {
	private BookingRepo bookingRepository;
    private CancellationRepo cancellationRepository;

    public CancellationService(BookingRepo bookingRepository, CancellationRepo cancellationRepository) {
        this.bookingRepository = bookingRepository;
        this.cancellationRepository = cancellationRepository;
    }

    public List<Cancellation> getAllCancellations() {
        return cancellationRepository.findAll();
    }
    public Cancellation createCancellation(int bookingId, Cancellation cancellation) {
        Optional<Booking> optionalBooking = bookingRepository.findById(bookingId);
        if (optionalBooking.isPresent()) {
            Booking booking = optionalBooking.get();
            cancellation.setBooking(booking);
            return cancellationRepository.save(cancellation);
        } else {
        	throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Cancellation updateCancellation(int bookingId, int cancellationId, Cancellation updatedCancellation) {
        Optional<Booking> optionalBooking = bookingRepository.findById(bookingId);
        if (optionalBooking.isPresent()) {
            Optional<Cancellation> optionalCancellation = cancellationRepository.findById(cancellationId);
            if (optionalCancellation.isPresent()) {
                Cancellation cancellation = optionalCancellation.get();
                cancellation.setReason(updatedCancellation.getReason());
                return cancellationRepository.save(cancellation);
            } else {
            	throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }
        } else {
        	throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public List<Cancellation> getAllCancellations(int bookingId) {
        Optional<Booking> optionalBooking = bookingRepository.findById(bookingId);
        if (optionalBooking.isPresent()) {
            Booking booking = optionalBooking.get();
            return cancellationRepository.findByBooking(booking);
        } else {
        	throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public void deleteCancellation(int bookingId, int cancellationId) {
        Optional<Booking> optionalBooking = bookingRepository.findById(bookingId);
        if (optionalBooking.isPresent()) {
            Optional<Cancellation> optionalCancellation = cancellationRepository.findById(cancellationId);
            if (optionalCancellation.isPresent()) {
                cancellationRepository.delete(optionalCancellation.get());
            } else {
            	throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }
        } else {
        	throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}