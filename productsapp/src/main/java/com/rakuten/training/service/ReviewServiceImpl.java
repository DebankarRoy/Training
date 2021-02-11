package com.rakuten.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.dal.ReviewDAO;
import com.rakuten.training.domain.Product;
import com.rakuten.training.domain.Review;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewDAO reviewDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Override
	public Review addReviewToProduct(Review r,int productId)
	{
		Product p = productDAO.findById(productId);
		r.setProduct(p);
		return reviewDAO.save(r);
	}

	public List<Review> findByProduct_Id(int pid) {
		return reviewDAO.findByProduct_Id(pid);
	}

	public Product findById(int id) {
		return productDAO.findById(id);
	}
}
