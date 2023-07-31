<<<<<<< HEAD
package main.java.com.examly.springapp.model;

<<<<<<< HEAD
=======
//import jakarta.persistence.*;

import javax.persistence.Column;
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
<<<<<<< HEAD
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String name;
    private String email;
    private String phone;
    @OneToMany(mappedBy="customer")
    private List<Booking> bookings;

    public Customer() {
        // Default constructor
=======
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
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
    }

    public Customer(int customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getCustomerId() {
<<<<<<< HEAD
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
=======
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
=======

package com.customer.Customer.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

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

package com.examly.springapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hari")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	
	private int customerId;
	
	@Column(name="name")
	private String name;
	

	
	@Column(length = 255)
	private String email;
	

	
	@Column(length = 12)
	private int phone;

	

	public Customer(){
		super();
	}
	

	public  Customer( int customerId, String name,String email,
			int phone ) {
	    super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phone = phone;

	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return this.phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}	
}

>>>>>>> 6120d8a7af0dfc6e0ba75df0003c7fe594d06190
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
