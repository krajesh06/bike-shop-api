package com.bikeshopapi.bikeshopapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bikeshopapi.bikeshopapi.model.OrderingBike;


	
	@Repository
	public interface OrderingBikeRepositroy extends JpaRepository<OrderingBike, Integer> {

	

	}


