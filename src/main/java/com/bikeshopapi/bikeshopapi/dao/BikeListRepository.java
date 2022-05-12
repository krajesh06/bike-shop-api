package com.bikeshopapi.bikeshopapi.dao;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikeshopapi.bikeshopapi.model.ListOfBikes;



	public interface BikeListRepository extends JpaRepository<ListOfBikes, Integer> {

		public Optional<ListOfBikes> findBymodel(String model);

	

		//public ListOfBikes findBymodelAndfindBycolor(String model, String color);

		

	

	}

