package com.bikeshopapi.bikeshopapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bikeshopapi.bikeshopapi.dao.ListRepository;
import com.bikeshopapi.bikeshopapi.model.ListOfBikes;

@RestController
public class BikeListController {

	
	@Autowired
	ListRepository listRepository;
	
	
	@GetMapping("User/listBike")
	public List<ListOfBikes> findAll() {
		List<ListOfBikes> ListOfBikes = listRepository.findAll();
		return ListOfBikes;
}
	@GetMapping("User/{bikename}")
	public ListOfBikes findBybikename(@PathVariable("bikename") String bikename) {
		Optional<ListOfBikes> bike = listRepository.findBybikename(bikename);
		if (bike.isPresent()) {
			ListOfBikes bikeObj = bike.get();
			return bikeObj;
		} else {
			return null;
		}
}
}
