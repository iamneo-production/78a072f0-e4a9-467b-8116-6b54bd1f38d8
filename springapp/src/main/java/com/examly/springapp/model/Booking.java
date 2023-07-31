package com.examly.springapp.model;

import java.util.Date;

// import java.time.LocalDate;
import javax.persistence.*;
// import org.springframework.format.annotation.DateTimeFormat;


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
    private Customer1 customer1;

    // Constructor
    public Booking() {
    }

    // Getters and Setters
    public Booking(int id, Date checkInDate, Date checkOutDate, String roomType, int guests, String preferences, Customer1 customer1) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomType = roomType;
        this.guests = guests;
        this.preferences = preferences;
        this.customer1 = customer1;
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

    public Customer1 getCustomer1() {
        return customer1;
    }

    public void setCustomer1(Customer1 customer1) {
        this.customer1 = customer1;
    }

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


}