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
import com.examly.springapp.model.User;


@RestController
@CrossOrigin(value="*")
@RequestMapping("/")

public class LoginServiceController implements LoginService {
	@Autowired
	private UserRepo b; 

	@PostMapping(value="/register",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String register(@RequestBody User a) {
		system.out.println(a.getUsername());
		User c = b.save(a);
		
		if(c==null)
			return "NotCreated";
		return "Created";
	}

	@PostMapping(value="/login",consumes=MediaType.APPLICATION_JSON_VALUE)
	public User Login(@RequestBody ExistingUser a) {
		system.out.println(a);
		system.out.println(a.username+" "+a.password);
		
		User c = b.findByUsername(a.username);
		if(c==null)
			return null;
		if(c.password.equals(a.password))
			return c;
		return null;
	}
	

}


