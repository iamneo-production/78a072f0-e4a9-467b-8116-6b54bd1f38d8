package com.examly.springapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Cancellations")
public class Cancellation {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int cancellationId;

	   @OneToOne
	   private Booking booking;
	   
    @Column(name="dateCancelled")
	   private Date dateCancelled;

    @Column(name="reason")
	   private String reason;
    
    public Cancellation() {
    	
    }

	public Cancellation(Booking booking, Date dateCancelled, String reason) {
		super();
		this.booking = booking;
		this.dateCancelled = dateCancelled;
		this.reason = reason;
	}

	public int getCancellationId() {
		return cancellationId;
	}

	public void setCancellationId(int cancellationId) {
		this.cancellationId = cancellationId;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Date getDateCancelled() {
		return dateCancelled;
	}

	public void setDateCancelled(Date dateCancelled) {
		this.dateCancelled = dateCancelled;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}