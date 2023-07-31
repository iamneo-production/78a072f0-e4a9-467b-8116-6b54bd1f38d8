package com.examly.springapp.controller;

import com.examly.springapp.exception.ResourceNotFoundException;
import com.examly.springapp.model.Room;
import com.examly.springapp.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "https://8081-fdedbdfabffebceaeaadbdbabf.project.examly.io")
@RequestMapping("/api/v1")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/getrooms")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    @PostMapping("/addroom")
    public Room createRoom(@RequestBody Room room) {
        return roomService.createRoom(room);
    }

    @GetMapping("/room/{roomId}")
    public ResponseEntity<Room> getRoomById(@PathVariable long roomId) {
        Room room = roomService.getRoomById(roomId);
        return ResponseEntity.ok(room);
    }

    @PutMapping("/updateroom/{roomId}")
    public ResponseEntity<Room> updateRoom(@PathVariable long roomId, @RequestBody Room roomDetails) {
        Room updatedRoom = roomService.updateRoom(roomId, roomDetails);
        return ResponseEntity.ok(updatedRoom);
    }

    @DeleteMapping("/room/{roomId}")
    public ResponseEntity<Map<String, Boolean>> deleteRoom(@PathVariable Long roomId) {
        roomService.deleteRoom(roomId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/bookedroom/{roomId}")
    public ResponseEntity<Room> bookedRoom(@PathVariable long roomId, @RequestBody int newAvailability) {
        Room updatedRoom = roomService.bookedRoom(roomId, newAvailability);
        return ResponseEntity.ok(updatedRoom);
    }
}