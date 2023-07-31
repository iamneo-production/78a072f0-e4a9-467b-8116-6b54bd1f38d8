package com.examly.springapp.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cancellation")
public class Cancellation {

   @Id
   @Column(name = "cancellation_id")
   private int cancellationId;

   @OneToOne
   @JoinColumn(name = "booking_id")
   private Booking booking;

   @Column(name = "date_cancelled")
   private Date dateCancelled;

   @Column(name = "reason")
   private String reason;

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

public Cancellation() {

}
}

