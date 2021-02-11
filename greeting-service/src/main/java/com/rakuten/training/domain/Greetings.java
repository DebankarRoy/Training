package com.rakuten.training.domain;

public class Greetings {

	String timeOfDay;
	String message;
	public Greetings()
	{
		
	}
	
	public Greetings(String timeOfDay, String message) {
		this.timeOfDay = timeOfDay;
		this.message = message;
	}
	public String getTimeOfDay() {
		return timeOfDay;
	}
	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}

