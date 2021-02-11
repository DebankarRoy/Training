package com.rakuten.training.web;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.training.domain.User;
import com.rakuten.training.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	
	@GetMapping("/user")
	public List<User> showAllUser()
	{
		return service.showAll();
	}
	
	@PostMapping("/user/registration")
	public ResponseEntity addNewUser(@RequestBody User toBeAdded)
	{
		try
		{
			int id = service.createUser(toBeAdded);
			HttpHeaders headers=new HttpHeaders();
			headers.setLocation(URI.create("/user/"+id));
			return new ResponseEntity<User>(toBeAdded,headers,HttpStatus.CREATED);
		}
		catch(IllegalArgumentException e)
		{
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
}
