package com.examly.springapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    // Add the variables, constructors, getters, and setters for the Customer class
    @Id
    private int customerId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column (name = "phone")
    private String phone;
    
    public Customer() {
    }

    public Customer(int customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int id) {
        this.customerId = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String customerName) {
        this.name = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String customerEmail) {
        this.email = customerEmail;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String customerPhone) {
        this.phone = customerPhone;
    }

    @Override
    public String toString() {
        return "{" +
            " customerId='" + getCustomerId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone='" + getPhone() + "'" +
            "}";
    }
}
