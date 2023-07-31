package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.springapp.model.Customers;


//@Repository
public interface Customersrepository extends JpaRepository<Customers,Long>{

  // @Query("from customerinfo cus where cus.userName=?1")
     Customers findByuserName(String userName);
}
