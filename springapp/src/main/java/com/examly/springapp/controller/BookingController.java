package com.examly.springapp.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Booking;
import com.examly.springapp.model.Cancellation;
import com.examly.springapp.model.Payment;
import com.examly.springapp.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    // Testcase-2 Get all bookings
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    // GET /bookings/{bookingId} - Get a specific booking by ID
    @GetMapping("/{bookingId}")
    public Booking getBookingById(@PathVariable int bookingId) {
        return bookingService.getBookingById(bookingId);
    }

    // POST /bookings - Create a new booking
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }



    // Test case - 3 DELETE /bookings/{bookingId} - Delete a booking by ID
    @DeleteMapping("/{bookingId}")
    public void deleteBooking(@PathVariable int bookingId) {
        bookingService.deleteBooking(bookingId);
    }

    // Test case -6 GET /bookings/{bookingId}/payments - Get all payments for a specific booking
    @GetMapping("/{bookingId}/payments")
    public List<Payment> getAllPaymentsForBooking(@PathVariable int bookingId) {
        return bookingService.getAllPaymentsForBooking(bookingId);
    }

    // Test case- 4 POST /bookings/{bookingId}/payments - Create a new payment for a specific booking
    @PostMapping("/{bookingId}/payments")
    public ResponseEntity<?> createPaymentForBooking(@PathVariable int bookingId, @RequestBody Payment payment) {
        Booking booking = bookingService.getBookingById(bookingId);
        if (booking == null) {
            return ResponseEntity.notFound().build();
        }

        Payment createdPayment = bookingService.createPaymentForBooking(bookingId, payment);
        if (createdPayment != null) {
            return ResponseEntity.ok().body(true);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // Test case-5 PUT /bookings/{bookingId}/payments/{paymentId} - Update an existing payment for a specific booking
    @PutMapping("/{bookingId}/payments/{paymentId}")
    public Payment updatePaymentForBooking(@PathVariable int bookingId, @PathVariable int paymentId, @RequestBody Payment payment) {
        return bookingService.updatePaymentForBooking(bookingId, paymentId, payment);
    }

    // Test case -7 DELETE /bookings/{bookingId}/payments/{paymentId} - Delete a payment for a specific booking
    @DeleteMapping("/{bookingId}/payments/{paymentId}")
    public void deletePaymentForBooking(@PathVariable int bookingId, @PathVariable int paymentId) {
        bookingService.deletePaymentForBooking(bookingId, paymentId);
    }

    // GET /bookings/{bookingId}/cancellations - Get all cancellations for a specific booking
    @GetMapping("/{bookingId}/cancellations")
    public List<Cancellation> getAllCancellationsForBooking(@PathVariable int bookingId) {
        return bookingService.getAllCancellationsForBooking(bookingId);
    }

    // POST /bookings/{bookingId}/cancellations - Create a new cancellation for a specific booking
    @PostMapping("/{bookingId}/cancellations")
    public Cancellation createCancellationForBooking(@PathVariable int bookingId, @RequestBody Cancellation cancellation) {
        return bookingService.createCancellationForBooking(bookingId, cancellation);
    }

    // PUT /bookings/{bookingId}/cancellations/{cancellationId} - Update an existing cancellation for a specific booking
    @PutMapping("/{bookingId}/cancellations/{cancellationId}")
    public Cancellation updateCancellationForBooking(@PathVariable int bookingId, @PathVariable int cancellationId, @RequestBody Cancellation cancellation) {
        return bookingService.updateCancellationForBooking(bookingId, cancellationId, cancellation);
    }

    // DELETE /bookings/{bookingId}/cancellations/{cancellationId} - Delete a cancellation for a specific booking
    @DeleteMapping("/{bookingId}/cancellations/{cancellationId}")
    public void deleteCancellationForBooking(@PathVariable int bookingId, @PathVariable int cancellationId) {
        bookingService.deleteCancellationForBooking(bookingId, cancellationId);
    }


}
