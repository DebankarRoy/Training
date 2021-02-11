package com.rakuten.training.ui;

import java.util.Scanner;

import com.rakuten.training.domain.Product;
import com.rakuten.training.service.ProductService;
import com.rakuten.training.service.ProductServiceImpl;

public class ProductConsoleUI {

	ProductService service=new ProductServiceImpl();
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
