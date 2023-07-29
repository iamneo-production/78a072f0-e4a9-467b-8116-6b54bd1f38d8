package com.examly.springapp.controller;

import com.examly.springapp.model.Admin;
import com.examly.springapp.repository.AdminRepo;
import com.examly.springapp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(value="*")
@RequestMapping("/")

public class AdminServiceController implements AdminService {
	@Autowired
	private AdminRepo b;

	@PostMapping(value="/adminregister",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String register(@RequestBody Admin a) {
		// TODO Auto-generated method stub
		System.out.println(a.getUsername());
		Admin c = b.save(a);
		
		if(c==null)
			return "NotCreated";
		return "Created";
	}

	@PostMapping(value="/adminlogin",consumes=MediaType.APPLICATION_JSON_VALUE)
	public Admin Login(@RequestBody ExistingAdmin a) {
		System.out.println(a);
		System.out.println(a.username+" "+a.password);
		//User a = new User();
		Admin c = b.findByUsername(a.username);
		if(c==null)
			return null;
		if(c.password.equals(a.password))
			return c;
		return null;
	}
	

}


