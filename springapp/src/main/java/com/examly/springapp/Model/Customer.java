package com.examly.springapp.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@Column(name = "CustomerId")
	private String customerId;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "PhoneNumber")
	private int phoneNumber;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Address")
	private String address;
	
	
	@Column(name = "Pincode")
	private String pincode;
	
	
	@Column(name = "State")
	private String state;
	
	
	@Column(name = "PaymentMethod")
	private String paymentMethod;
	
	
	@Column(name = "CardNumber")
	private String cardNumber;
	
	@Column(name = "CardHolderName")
	private String cardHolderName;
	
	@Column(name = "ExpiryDate")
	private String expiryDate;
	
	@Column(name = "cvv")
	private String cvv;

	public Customer(){
		
	}
	

	public  Customer( String customerId, String firstName, String lastName, String email, String password,
			int phoneNumber, String gender, String address, String state, String pincode, String paymentMethod,
			String cardNumber, String cardHolderName, String expiryDate, String cvv ) {
	
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.address = address;
		this.state = state;
		this. pincode = pincode;
		this. paymentMethod = paymentMethod;
		this. cardNumber = cardNumber;
		this. cardHolderName = cardHolderName;
		this. expiryDate = expiryDate;
		this. cvv= cvv;
	}





	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
	
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return this.cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getcvv() {
		return this.cvv;
	}

	public void setcvv(String cvv) {
		this.cvv = cvv;
	}





}

