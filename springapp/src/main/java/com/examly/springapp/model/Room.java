<<<<<<< HEAD
package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomId;
    private String roomType;
    private int capacity;
    private boolean isAvailable;
    private double pricePerNight;
    @OneToMany(mappedBy="customer")
    private List<Booking> bookings;


    public Room() {
        // Default constructor
    }

    public Room(int roomId, String roomType, int capacity, boolean isAvailable, double pricePerNight) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.capacity = capacity;
        this.isAvailable = isAvailable;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}
=======
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
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
