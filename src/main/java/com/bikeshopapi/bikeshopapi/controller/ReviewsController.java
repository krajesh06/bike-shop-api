package com.bikeshopapi.bikeshopapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("Admin/Reviewslist")
	public List<Reviews> findAll() {
		List<Reviews> r = reviewRepository.findAll();
		return r;
}
	@GetMapping("Admin/Reviewslist/{username}")
	public Optional<Reviews> review(@PathVariable("name") String name){
		Optional<Reviews> reviewList=null;
		
		try
		{
			reviewList=ReviewsRepository.findByname(name);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return reviewList;
		
	}
}
