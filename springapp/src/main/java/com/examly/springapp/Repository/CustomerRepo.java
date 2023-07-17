package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
}