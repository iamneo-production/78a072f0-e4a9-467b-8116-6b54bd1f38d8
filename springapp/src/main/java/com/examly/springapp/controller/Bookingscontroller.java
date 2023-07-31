package com.examly.springapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.examly.springapp.exceptions.ResourceNotFoundException;
import com.examly.springapp.model.Bookings;
import com.examly.springapp.repository.Bookingsrepository;


@RestController
@CrossOrigin(origins = "https://8081-fdedbdfabffebcfbfbfaeedd.project.examly.io")
@RequestMapping

public class Bookingscontroller {

  @Autowired
  private Bookingsrepository bookingsrepository;

  //get all Bookings
  @GetMapping("/getbookings")
  public List<Bookings> getAllBookings()
  {
    return bookingsrepository.findAll();
  }

  //create
  @PostMapping("/book")
  public Bookings bookRoom(@RequestBody Bookings booking){
    return bookingsrepository.save(booking);
  }

  //retriving the infos
  @GetMapping("/booking/{id}")
  public ResponseEntity<Bookings> getbookingById(@PathVariable long id) {
    Bookings booking = bookingsrepository.findById(id).
                       orElseThrow(() -> new ResourceNotFoundException("Booking not existedd for id:"+id));
   return ResponseEntity.ok(booking);
 }
 
   //retriving the booking info by booking username
    @GetMapping("/bookingbyname/{name}")
    public List<Bookings> getElementsByname(@PathVariable String name)
    {
      return bookingsrepository.findByname(name);
    }

 //update the infos
 @PutMapping("/updatebooking/{bookingno}")
 public ResponseEntity<Bookings> updateRoom(@PathVariable long bookingno,@RequestBody Bookings bookingdetails) {
   Bookings booking = bookingsrepository.findById(bookingno).
                       orElseThrow(() -> new ResourceNotFoundException("Booking not existedd for id:"+bookingno));
   

    booking.setCheckin(bookingdetails.getCheckin());
    booking.setCheckout(bookingdetails.getCheckout());
    booking.setNoOfGuests(bookingdetails.getNoOfGuests());
    booking.setRoomtype(bookingdetails.getRoomtype());

    Bookings updatedbooking = bookingsrepository.save(booking);
    return ResponseEntity.ok(updatedbooking);
  }

  //delete  the booking infos
 @DeleteMapping("/booking/{bookingNo}")
 public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long bookingNo){
 
   Bookings booking = bookingsrepository.findById(bookingNo).
   orElseThrow(() -> new ResourceNotFoundException("Booking not existedd for id:"+bookingNo));

   bookingsrepository.delete(booking);
   Map<String,Boolean> response = new HashMap<>();
   response.put("deleted",Boolean.TRUE);
   return ResponseEntity.ok(response);
 }





  
  
}
