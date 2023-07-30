package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.*;
import com.examly.springapp.model.Booking;
import com.examly.springapp.service.BookingService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://8081-ceafffcbaffbffebceaeaadbdbabf.project.examly.io/bookings")
@RequestMapping
public class BookingController {
    // Add your controller methods here
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/bookings")
    public ResponseEntity<List<Booking>> getAllBookings() {
        List<Booking> bookings = bookingService.getAllBookings();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/bookings/{bookingId}")
    public ResponseEntity<Booking> getBookingById(@PathVariable int bookingId) {
        Booking bookings = bookingService.getBookingById(bookingId);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody Booking bookings) {
        Booking createdBooking = bookingService.createBooking(bookings);
        return new ResponseEntity<>(createdBooking, HttpStatus.CREATED);
    }

    @PutMapping("/bookings/{bookingId}")
    public ResponseEntity<Booking> updateBooking(@PathVariable int bookingId, @RequestBody Booking bookings) {
        Booking updatedBooking = bookingService.updateBooking(bookingId, bookings);
        return new ResponseEntity<>(updatedBooking, HttpStatus.OK);
    }

    @DeleteMapping("/bookings/{bookingId}")
    public ResponseEntity<Void> deleteBooking(@PathVariable int bookingId) {
        bookingService.deleteBooking(bookingId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
