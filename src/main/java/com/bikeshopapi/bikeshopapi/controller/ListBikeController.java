package com.bikeshopapi.bikeshopapi.controller;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikeshopapi.bikeshopapi.dao.BikeListRepository;
import com.bikeshopapi.bikeshopapi.model.ListOfBikes;
 
@RestController
public class ListBikeController {

	@Autowired
	BikeListRepository bikelistRepository;

	@GetMapping("User/Bikelist")
	public List<ListOfBikes> findAll() {
		List<ListOfBikes> bike = bikelistRepository.findAll();
		return bike;
}
	@GetMapping("User/Bikelist/{model}")
	public ListOfBikes findBymodel(@PathVariable("model") String model) {
		Optional<ListOfBikes> b = bikelistRepository.findBymodel(model);
		if (b.isPresent()) {
			ListOfBikes bikeObj = b.get();
			return bikeObj;
		} else {
			return null;
		}
	}

	@PostMapping("Admin/Bikelist")
	public void ListOfBikes(@RequestBody ListOfBikes b) {
		bikelistRepository.save(b);

	}

	@PutMapping("Admin/Bikelist/{color}")
	public void update(@PathVariable("color") String color, @RequestBody ListOfBikes m) {
		ListOfBikes listOfBikes = new ListOfBikes();
		listOfBikes.setColor(color);
		bikelistRepository.save(m);
	}

//	@PatchMapping("Admin/Bikelist/{model}")
//	public void updatePartially(@PathVariable("model") String model, @RequestBody ListOfBikes l) {
//		ListOfBikes bikeobj = listRepository.findBymodelAndfindBycolor(l.getModel(), l.getColor());
//		bikeobj.setModel(l.getModel());
//		listRepository.save(bikeobj);
//
//	}
}
