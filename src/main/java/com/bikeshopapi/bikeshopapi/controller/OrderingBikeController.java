package com.bikeshopapi.bikeshopapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikeshopapi.bikeshopapi.dao.OrderingBikeRepositroy;

import com.bikeshopapi.bikeshopapi.model.OrderingBike;

@RestController
public class OrderingBikeController {
	
	@Autowired
	OrderingBikeRepositroy orderRepository;
	
	@PostMapping("User/order")
	public void user(@RequestBody OrderingBike orderingbike) {
	orderRepository.save(orderingbike);

}
}
