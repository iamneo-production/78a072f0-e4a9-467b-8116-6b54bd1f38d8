package com.examly.springapp.model;

import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;
    private double amount;
    private LocalDateTime paymentDateTime;
    private String paymentStatus;

    // Constructors (default and parameterized)

    public Payment(int paymentId, double amount, LocalDateTime paymentDateTime, String paymentStatus) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDateTime = paymentDateTime;
        this.paymentStatus = paymentStatus;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getPaymentDateTime() {
        return paymentDateTime;
    }

    public void setPaymentDateTime(LocalDateTime paymentDateTime) {
        this.paymentDateTime = paymentDateTime;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


}
