package com.examly.springapp.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

@Entity
@Table(name = "customer")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","FieldHandler"})
public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
        @Column(name = "name")
    private String name;
    @Column(name = "checkIn")
    private String checkIn;
    @Column(name = "checkOut")
    private String checkOut;
    @Column(name = "email")
    private String email;
    @Column(name = "phoneNumber")
    private String phoneNumber;

    public  Customer(){

    }
    public Customer(long id, String name, String checkIn, String checkOut, String email, String phoneNumber) {
        super();
        this.id = id;
        this.name = name;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
