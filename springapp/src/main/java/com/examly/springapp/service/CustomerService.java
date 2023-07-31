package com.examly.springapp.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.examly.springapp.exceptions.NotFoundException;
import com.examly.springapp.model.Customer;
import com.examly.springapp.repository.BookingRepository;
import com.examly.springapp.repository.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final BookingRepository bookingRepository;


    public CustomerService(CustomerRepository customerRepository, BookingRepository bookingRepository) {
        this.customerRepository = customerRepository;
        this.bookingRepository = bookingRepository;
    }

}

