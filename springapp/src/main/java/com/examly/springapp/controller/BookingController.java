<<<<<<< HEAD
package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.examly.springapp.service.*;
import com.examly.springapp.model.*;
import java.util.List;


@RestController
@RequestMapping("/bookings")
public class BookingController {
=======
package main.java.com.examly.springapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.examly.springapp.model.Booking;
import main.java.com.examly.springapp.service.BookingService;

import java.util.List;

@RestController
@CrossOrigin(origins="https://8081-addcfefcbbffebceaeaadbdbabf.project.examly.io/")

@RequestMapping("/bookings")
public class BookingController {
    // Add your controller methods here
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
<<<<<<< HEAD
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{bookingId}")
    public Booking getBookingById(@PathVariable int bookingId) {
        return bookingService.getBookingById(bookingId);
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @PutMapping("/{bookingId}")
    public Booking updateBooking(@PathVariable int bookingId, @RequestBody Booking booking) {
        return bookingService.updateBooking(bookingId, booking);
    }

    @DeleteMapping("/{bookingId}")
    public void deleteBooking(@PathVariable int bookingId) {
        bookingService.deleteBooking(bookingId);
    }

    @GetMapping("/{bookingId}/payments")
    public List<Payment> getAllPaymentsForBooking(@PathVariable int bookingId) {
        return bookingService.getAllPaymentsForBooking(bookingId);
    }

    @PostMapping("/{bookingId}/payments")
    public Payment createPaymentForBooking(@PathVariable int bookingId, @RequestBody Payment payment) {
        return bookingService.createPaymentForBooking(bookingId, payment);
    }

    @PutMapping("/{bookingId}/payments/{paymentId}")
    public Payment updatePaymentForBooking(
            @PathVariable int bookingId, @PathVariable int paymentId, @RequestBody Payment payment) {
        return bookingService.updatePaymentForBooking(bookingId, paymentId, payment);
    }

    @DeleteMapping("/{bookingId}/payments/{paymentId}")
    public void deletePaymentForBooking(@PathVariable int bookingId, @PathVariable int paymentId) {
        bookingService.deletePaymentForBooking(bookingId, paymentId);
    }

    @GetMapping("/{bookingId}/cancellations")
    public List<Cancellation> getAllCancellationsForBooking(@PathVariable int bookingId) {
        return bookingService.getAllCancellationsForBooking(bookingId);
    }

    @PostMapping("/{bookingId}/cancellations")
    public Cancellation createCancellationForBooking(
            @PathVariable int bookingId, @RequestBody Cancellation cancellation) {
        return bookingService.createCancellationForBooking(bookingId, cancellation);
    }

    @PutMapping("/{bookingId}/cancellations/{cancellationId}")
    public Cancellation updateCancellationForBooking(
            @PathVariable int bookingId, @PathVariable int cancellationId, @RequestBody Cancellation cancellation) {
        return bookingService.updateCancellationForBooking(bookingId, cancellationId, cancellation);
    }

    @DeleteMapping("/{bookingId}/cancellations/{cancellationId}")
    public void deleteCancellationForBooking(@PathVariable int bookingId, @PathVariable int cancellationId) {
        bookingService.deleteCancellationForBooking(bookingId, cancellationId);
    }
}
=======
    public ResponseEntity<List<Booking>> getAllBookings() {
        List<Booking> bookings = bookingService.getAllBookings();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/{bookingId}")
    public ResponseEntity<Booking> getBookingById(@PathVariable int bookingId) {
        Booking booking = bookingService.getBookingById(bookingId);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
        Booking createdBooking = bookingService.createBooking(booking);
        return new ResponseEntity<>(createdBooking, HttpStatus.CREATED);
    }

    @PutMapping("/{bookingId}")
    public ResponseEntity<Booking> updateBooking(@PathVariable int bookingId, @RequestBody Booking booking) {
        Booking updatedBooking = bookingService.updateBooking(bookingId, booking);
        return new ResponseEntity<>(updatedBooking, HttpStatus.OK);
    }

    @DeleteMapping("/{bookingId}")
    public ResponseEntity<Void> deleteBooking(@PathVariable int bookingId) {
        bookingService.deleteBooking(bookingId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
