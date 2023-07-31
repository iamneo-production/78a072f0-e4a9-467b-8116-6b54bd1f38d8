package com.examly.springapp.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.examly.springapp.exceptions.NotFoundException;
import com.examly.springapp.model.Booking;
import com.examly.springapp.model.Cancellation;
import com.examly.springapp.repository.BookingRepository;
import com.examly.springapp.repository.CancellationRepository;

@Service
public class CancellationService {

    private final CancellationRepository cancellationRepository;
    private final BookingRepository bookingRepository;

    public CancellationService(CancellationRepository cancellationRepository, BookingRepository bookingRepository) {
        this.cancellationRepository = cancellationRepository;
        this.bookingRepository = bookingRepository;
    }

    public List<Cancellation> getAllCancellations() {
        return cancellationRepository.findAll();
    }

    public Cancellation getCancellationById(int cancellationId) {
        return cancellationRepository.findById(cancellationId)
                .orElseThrow(() -> new NotFoundException("Cancellation not found"));
    }

    public Cancellation createCancellationForBooking(int bookingId, Cancellation cancellation) {
        Booking booking = getBookingById(bookingId);
        cancellation.setBooking(booking);
        return cancellationRepository.save(cancellation);
    }

    public Cancellation updateCancellationForBooking(int bookingId, int cancellationId, Cancellation updatedCancellation) {
        Cancellation cancellation = getCancellationById(cancellationId);
        cancellation.setBooking(getBookingById(bookingId));
        // Update the cancellation with new data from updatedCancellation
        // ...
        return cancellationRepository.save(cancellation);
    }

    public void deleteCancellationForBooking(int bookingId, int cancellationId) {
        Cancellation cancellation = getCancellationById(cancellationId);
        if (cancellation.getBooking().getId() != bookingId) {
            throw new NotFoundException("Cancellation not found for the given booking");
        }
        cancellationRepository.delete(cancellation);
    }

    public List<Cancellation> getAllCancellationsForBooking(int bookingId) {
        return cancellationRepository.findByBookingId(bookingId);
    }

    private Booking getBookingById(int bookingId) {
        return bookingRepository.findById(bookingId)
                .orElseThrow(() -> new NotFoundException("Booking not found"));
    }
}
