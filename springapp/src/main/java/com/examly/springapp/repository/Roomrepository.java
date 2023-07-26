package com.examly.springapp.repository;

import com.examly.springapp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Roomrepository extends JpaRepository<Room,Long>{
}