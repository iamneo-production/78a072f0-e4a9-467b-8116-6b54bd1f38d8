package main.java.com.examly.springapp.controller;

import java.util.Optional;  


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.model.Admin;
import com.examly.springapp.repository.AdminRepo;





@RestController
@CrossOrigin(value="*")
@RequestMapping("/")

public class AdminServiceController implements AdminService {
	@Autowired
	private AdminRepo b; 

	@PostMapping(value="/adminregister",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String register(@RequestBody Admin a) {
		system.out.println(a.getUsername());
		Admin c = b.save(a);
		
		if(c==null)
			return "NotCreated";
		return "Created";
	}

	@PostMapping(value="/adminlogin",consumes=MediaType.APPLICATION_JSON_VALUE)
	public Admin Login(@RequestBody ExistingAdmin a) {
		system.out.println(a);
		system.out.println(a.username+" "+a.password);
		Admin c = b.findByUsername(a.username);
		if(c==null)
			return null;
		if(c.password.equals(a.password))
			return c;
		return null;
	}
	

}


