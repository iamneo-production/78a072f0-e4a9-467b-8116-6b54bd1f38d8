package com.customer.Customer.repository;

import com.customer.Customer.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Roomrepository extends JpaRepository<Room,Long>{
}