package main.java.com.examly.springapp.model;

import java.util.Date;


import jakarta.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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