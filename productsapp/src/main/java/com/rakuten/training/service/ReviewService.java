package com.rakuten.training.service;

import java.util.List;

import com.rakuten.training.domain.Product;
import com.rakuten.training.domain.Review;

public interface ReviewService {

	Review addReviewToProduct(Review r, int productId);
	public List<Review> findByProduct_Id(int pid);
	public Product findById(int id);
}