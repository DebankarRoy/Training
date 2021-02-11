package com.rakuten.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
	
	String name="Random";
	int id=1;
	@Autowired
	Heart heart;
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public boolean isAlive()
	{
		if(heart.isPumping())
			return true;
		return false;
	}
	
}
