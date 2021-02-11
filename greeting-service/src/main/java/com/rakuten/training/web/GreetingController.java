package com.rakuten.training.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.training.domain.Greetings;

@RestController
public class GreetingController {

	List<Greetings> allGreetings = new ArrayList<>();
	
	@PostConstruct
	public void init()
	{
		allGreetings.add(new Greetings("Morning","Good Morning"));
		allGreetings.add(new Greetings("noon","Good noon"));
	}
	
	@RequestMapping(method= RequestMethod.GET,value="/greetings")
	public List<Greetings> getAllGreetings()
	{
		//return "Good Afternoon, Good Evening and if I don't see you again, Good Night";
		return allGreetings;
	}
	
	@PostMapping("/greetings")
	public Greetings addGreeting(@RequestBody Greetings toBeAdded)
	{
		allGreetings.add(toBeAdded);
		return toBeAdded;
	}
	
	
}
