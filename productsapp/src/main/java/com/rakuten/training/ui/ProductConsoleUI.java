package com.rakuten.training.ui;

import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rakuten.training.domain.Product;
import com.rakuten.training.service.ProductService;
//import com.rakuten.training.service.ProductServiceImpl;

@Component
public class ProductConsoleUI {

	ProductService service;//=new ProductServiceImpl();
	
	//it will run after the default constructor
	@PostConstruct
	public void init()
	{
		System.out.println("<<<<<<<<<init called>>>>>>>>>>>>");
	}
	@Autowired
	public void setService(ProductService service) {
		this.service = service;
	}
	public void createProductWithUI()
	{
		try(Scanner kb = new Scanner(System.in);)
		{
			System.out.println("Enter a name\n");
			String name=kb.nextLine();
			System.out.println("enter a price\n");
			float price=Float.parseFloat(kb.nextLine());
			System.out.println("enter the quantity\n");
			int qoh=Integer.parseInt(kb.nextLine());
			
			Product toBeCreated = new Product(name,price,qoh);
			int id =service.createNewProduct(toBeCreated);
			System.out.println("Product Created with id "+id+"\n");
		}
	}
}
