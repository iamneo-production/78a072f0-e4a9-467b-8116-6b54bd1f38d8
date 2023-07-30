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


