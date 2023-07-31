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
import com.examly.springapp.model.Rooms;
import com.examly.springapp.repository.Roomsrepository;

@RestController
@CrossOrigin(origins = "https://8081-fdedbdfabffebcfbfbfaeedd.project.examly.io")
@RequestMapping


public class Roomscontroller {

  @Autowired
  private Roomsrepository roomsrepository;

  //get all rooms
  @GetMapping("/getrooms")
  public List<Rooms> getAllRooms()
  {
    return roomsrepository.findAll();
  }

  //create
  @PostMapping("/addroom")
  public Rooms creatRoom(@RequestBody Rooms room){
    return roomsrepository.save(room);
  }

 //retriving the infos
 @GetMapping("/room/{id}")
 public ResponseEntity<Rooms> getRoomById(@PathVariable long id) {
   Rooms room = roomsrepository.findById(id).
                       orElseThrow(() -> new ResourceNotFoundException("Room not existedd for id:"+id));
   return ResponseEntity.ok(room);
 }


 //update the infos
 @PutMapping("/updateroom/{roomNumber}")
 public ResponseEntity<Rooms> updateRoom(@PathVariable long roomNumber,@RequestBody Rooms roomdetails) {
   Rooms room = roomsrepository.findById(roomNumber).
                       orElseThrow(() -> new ResourceNotFoundException("Room not existedd for id:"+roomNumber));
   
   room.setCategory(roomdetails.getCategory());
   room.setRoomType(roomdetails.getRoomType());
   room.setArrivalDate(roomdetails.getArrivalDate());
   room.setDepartDate(roomdetails.getDepartDate());
   room.setNoOfGuests(roomdetails.getNoOfGuests());
   room.setPrice(roomdetails.getPrice());
   room.setAvailability(roomdetails.getAvailability());

   Rooms updatedroom = roomsrepository.save(room);
   return ResponseEntity.ok(updatedroom);
 }


 //delete  the employee infos
 @DeleteMapping("/room/{roomNumber}")
 public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long roomNumber){
 
   Rooms room = roomsrepository.findById(roomNumber).
   orElseThrow(() -> new ResourceNotFoundException("Room not existedd for id:"+roomNumber));

   roomsrepository.delete(room);
   Map<String,Boolean> response = new HashMap<>();
   response.put("deleted",Boolean.TRUE);
   return ResponseEntity.ok(response);
 }


 //update the bookedroom availability
 @PostMapping("/bookedroom/{roomNumber}")
 public ResponseEntity<Rooms> bookedRoom(@PathVariable long roomNumber,@RequestBody int newavailability) {
   Rooms room = roomsrepository.findById(roomNumber).
                       orElseThrow(() -> new ResourceNotFoundException("Room not existedd for id:"+roomNumber));
   room.setAvailability(newavailability);
   Rooms updatedroom = roomsrepository.save(room);
   return ResponseEntity.ok(updatedroom);
 }
}

