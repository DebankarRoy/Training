package com.rakuten.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductHeartApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(ProductHeartApplication.class, args);
		Human hu=context.getBean(Human.class);
		System.out.println(hu.isAlive());
		
	}

}
