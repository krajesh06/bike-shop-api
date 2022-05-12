package com.bikeshopapi.bikeshopapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikeshopapi.bikeshopapi.dao.OrderingBikeRepository;

import com.bikeshopapi.bikeshopapi.model.OrderingBike;


@RestController
public class OrderingBikeController {
	
	@Autowired
	OrderingBikeRepository orderRepository;
	
	@PostMapping("User/order")
	public void user(@RequestBody OrderingBike orderingbike) {
	orderRepository.save(orderingbike);

}
	@GetMapping("Admin/Orderslist")
	public List<OrderingBike> findAll() {
		List<OrderingBike> o = orderRepository.findAll();
		return o;
}
	@GetMapping("Admin/Orderslist/{username}")
	public Optional<OrderingBike> review(@PathVariable("name") String name){
		Optional<OrderingBike> orderList=null;
		
		try
		{
			orderList=OrderingBikeRepository.findByname(name);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return orderList;
		
	}
}
