package com.rakuten.training.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.domain.Product;

@Service
public class SomeSpecialCaseService {
	
	@Autowired
	@Qualifier("productDAOInMemImpl")
	ProductDAO dao;
	
	@PostConstruct
	public void playwithDAO()
	{
		System.out.println("{{{{type of dao: "+dao.getClass().getName()+"}}}");
	}
}
