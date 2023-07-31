<<<<<<< HEAD
package com.examly.springapp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date checkInDate;
    private Date checkOutDate;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToMany(mappedBy = "booking",cascade = CascadeType.ALL)
    private List<Payment> payments;
    @OneToMany(mappedBy = "booking",cascade = CascadeType.ALL)
    private List<Cancellation> cancellations;

    public Booking() {
        // Default constructor
    }

    public Booking(int id, Date checkInDate, Date checkOutDate, Room room, Customer customer,
                   List<Payment> payments, List<Cancellation> cancellations) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.room = room;
        this.customer = customer;
        this.payments = payments;
        this.cancellations = cancellations;
=======
package main.java.com.examly.springapp.model;

import java.util.Date;


//import jakarta.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookingdb")   

public class Booking {

    @Id
    private int id;
    @Column(name = "check_in_date")
    private Date checkInDate;
    @Column(name = "check_out_date")
    private Date checkOutDate;
    @Column(name = "room_type")
    private String roomType;
    @Column(name = "guests")
    private int guests;
    @Column(name = "preferences")
    private String preferences;
    @ManyToOne
    private Customer customer;

    // Constructor
    public Booking() {
    }

    // Getters and Setters
    public Booking(int id, Date checkInDate, Date checkOutDate, String roomType, int guests, String preferences, Customer customer) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomType = roomType;
        this.guests = guests;
        this.preferences = preferences;
        this.customer = customer;
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

<<<<<<< HEAD
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

=======
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

<<<<<<< HEAD
    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Cancellation> getCancellations() {
        return cancellations;
    }

    public void setCancellations(List<Cancellation> cancellations) {
        this.cancellations = cancellations;
    }
=======
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }


>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
}