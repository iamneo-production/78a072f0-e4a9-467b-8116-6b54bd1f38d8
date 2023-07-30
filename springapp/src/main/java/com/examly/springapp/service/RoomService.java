package com.examly.springapp.service;

import com.examly.springapp.exception.ResourceNotFoundException;
import com.examly.springapp.model.Room;
import com.examly.springapp.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    public Room getRoomById(long roomId) {
        return roomRepository.findById(roomId)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found for id: " + roomId));
    }

    public Room updateRoom(long roomId, Room roomDetails) {
        Room room = roomRepository.findById(roomId)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found for id: " + roomId));

        room.setCategory(roomDetails.getCategory());
        room.setRoomType(roomDetails.getRoomType());
        room.setCapacity(roomDetails.getCapacity());
        room.setPricePerNight(roomDetails.getPricePerNight());
        room.setAvailability(roomDetails.getAvailability());

        return roomRepository.save(room);
    }

    public void deleteRoom(Long roomId) {
        Room room = roomRepository.findById(roomId)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found for id: " + roomId));
        roomRepository.delete(room);
    }

    public Room bookedRoom(long roomId, int newAvailability) {
        Room room = roomRepository.findById(roomId)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found for id: " + roomId));

        room.setAvailability(newAvailability);

        return roomRepository.save(room);
    }
}
