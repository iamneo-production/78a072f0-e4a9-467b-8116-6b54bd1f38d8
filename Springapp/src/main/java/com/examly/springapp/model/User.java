package com.examly.springapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table()
public class User {
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	int id;
	@Column()
	String username;
	@Column()
	public
	String password;
	@Column()
	String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int id, String username, String password,String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email= email;
	}
	public User() {
		super();
	}
	
}