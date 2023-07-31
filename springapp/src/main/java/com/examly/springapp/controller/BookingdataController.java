package com.examly.springapp.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Bookingdata;
import com.examly.springapp.service.BookingdataService;

@RestController
@RequestMapping("/bookings")
public class BookingdataController {
    private BookingdataService bookingdataService;


    public BookingdataController(BookingdataService bookingdataService) {
        this.bookingdataService = bookingdataService;
    }

    // Testcase -1 Update an existing booking by ID
    @PutMapping("/{bookingId}")
    public ResponseEntity<Bookingdata> updateBooking(@PathVariable int bookingId, @RequestBody Bookingdata updatedBooking) {
        Bookingdata updatedBookingResult = bookingdataService.updateBooking(bookingId, updatedBooking);
        return ResponseEntity.ok(updatedBookingResult);
    }
}


