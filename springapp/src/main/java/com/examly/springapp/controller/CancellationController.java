package com.examly.springapp.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Cancellation;
import com.examly.springapp.service.CancellationService;

@RestController
@RequestMapping("/cancellations")
public class CancellationController {

   private final CancellationService cancellationService;

   public CancellationController(CancellationService cancellationService) {
       this.cancellationService = cancellationService;
   }

   @GetMapping("/{cancellationId}")
   public Cancellation getCancellationById(@PathVariable int cancellationId) {
       return cancellationService.getCancellationById(cancellationId);
   }

   @PostMapping("/{bookingId}/cancellations")
   public Cancellation createCancellationForBooking(@PathVariable int bookingId, @RequestBody Cancellation cancellation) {
       return cancellationService.createCancellationForBooking(bookingId, cancellation);
   }

   @PutMapping("/{bookingId}/cancellations/{cancellationId}")
   public Cancellation updateCancellationForBooking(@PathVariable int bookingId, @PathVariable int cancellationId, @RequestBody Cancellation cancellation) {
       return cancellationService.updateCancellationForBooking(bookingId, cancellationId, cancellation);
   }

   @DeleteMapping("/{bookingId}/cancellations/{cancellationId}")
   public void deleteCancellationForBooking(@PathVariable int bookingId, @PathVariable int cancellationId) {
       cancellationService.deleteCancellationForBooking(bookingId, cancellationId);
   }
}
