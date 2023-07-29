package com.examly.springapp.repository;

import com.examly.springapp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
		Admin findByUsername(String username);
}
