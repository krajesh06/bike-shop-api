package com.bikeshopapi.bikeshopapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikeshopapi.bikeshopapi.dao.ReviewsRepository;
import com.bikeshopapi.bikeshopapi.model.Reviews;

@RestController
public class ReviewsController {

	@Autowired
	ReviewsRepository reviewRepository;
	
	@PostMapping("User/reviews")
	public void user(@RequestBody Reviews review) {
	reviewRepository.save(review);
		
	}
	
}
