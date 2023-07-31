<<<<<<< HEAD
package com.examly.springapp.model;

import java.time.LocalDate;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "room")
public class Room {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roomId;
	@Column(name = "category")
	private String category;
	@Column(name = "roomType")
	private String roomType;
	@Column(name = "capacity")
	private int capacity;
	@Column(name = "pricePerNight")
	private double pricePerNight;
	@Column(name = "availability")
	private int availability;

	public Room() {
	}

	public Room(long roomId, String category, String roomType, int capacity, double pricePerNight, int availability) {
		this.roomId = roomId;
		this.category = category;
		this.roomType = roomType;
		this.capacity = capacity;
		this.pricePerNight = pricePerNight;
		this.availability = availability;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}
}
=======
package com.customer.Customer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "roominfo")
public class Room {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roomNumber;
    @Column(name = "category")
    private String category;
    @Column(name = "roomType")
    private String roomType;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "arrivalDate")
    private LocalDate arrivalDate;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "departDate")
    private LocalDate departDate;
    @Column(name = "noOfGuests")
    private int noOfGuests;
    @Column(name = "price")
    private double price;
    @Column(name = "availability")
    private int availability;



    public Room() {
        this.roomNumber = roomNumber;
        this.category = category;
        this.roomType = roomType;
        this.arrivalDate = arrivalDate;
        this.departDate = departDate;
        this.noOfGuests = noOfGuests;
        this.price = price;
        this.availability = availability;
    }


    public long getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public LocalDate getArrivalDate() {
        return this.arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartDate() {
        return this.departDate;
    }

    public void setDepartDate(LocalDate departDate) {
        this.departDate = departDate;
    }

    public int getNoOfGuests() {
        return this.noOfGuests;
    }

    public void setNoOfGuests(int noOfGuests) {
        this.noOfGuests = noOfGuests;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailability() {
        return this.availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

}
>>>>>>> 6120d8a7af0dfc6e0ba75df0003c7fe594d06190
