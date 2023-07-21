package com.example.springapp.controller;

import java.util.List;

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

import com.example.springapp.model.Cancellation;
import com.example.springapp.service.CancellationService;

@RestController
@CrossOrigin(origins="https://8081-dfabcadabfbffebceaeaadbdbabf.project.examly.io")
@RequestMapping("/bookings/{bookingId}/cancellations")
public class CancellationController {
	private CancellationService cancellationService;

    public CancellationController(CancellationService cancellationService) {
        this.cancellationService = cancellationService;
    }

    @PostMapping
    public ResponseEntity<Cancellation> createCancellation(@PathVariable int bookingId, @RequestBody Cancellation cancellation) {
        Cancellation createdCancellation = cancellationService.createCancellation(bookingId, cancellation);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCancellation);
    }

    @GetMapping
    public ResponseEntity<List<Cancellation>> getAllCancellations(@PathVariable int bookingId) {
        List<Cancellation> cancellations = cancellationService.getAllCancellations(bookingId);
        return ResponseEntity.ok(cancellations);
    }

    @PutMapping("/{cancellationId}")
    public ResponseEntity<Cancellation> updateCancellation(@PathVariable int bookingId, @PathVariable int cancellationId, @RequestBody Cancellation updatedCancellation) {
        Cancellation savedCancellation = cancellationService.updateCancellation(bookingId, cancellationId, updatedCancellation);
        return ResponseEntity.ok(savedCancellation);
    }

    @DeleteMapping("/{cancellationId}")
    public ResponseEntity<Void> deleteCancellation(@PathVariable int bookingId, @PathVariable int cancellationId) {
        cancellationService.deleteCancellation(bookingId, cancellationId);
        return ResponseEntity.noContent().build();
    }
}
