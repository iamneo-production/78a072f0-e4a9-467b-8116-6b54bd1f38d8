package main.java.com.examly.springapp.model;
import main.java.com.springapp.model.Admin;
import com.examly.springapp.controller.AdminServiceController;
import com.examly.springapp.repository.AdminRepo;
import com.examly.springapp.service.AdminService;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table()
public class Admin {
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	int id;
	@Column()
	String username;
	@Column()
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
	public Admin(int id, String username, String password,String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email= email;
	}
	public Admin() {
		super();
	}
	
}
