package com.examly.springapp.model;

import javax.persistence.*;

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
