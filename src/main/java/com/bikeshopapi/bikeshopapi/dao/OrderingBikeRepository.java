package com.bikeshopapi.bikeshopapi.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bikeshopapi.bikeshopapi.model.OrderingBike;


	
	@Repository
	public interface OrderingBikeRepository extends JpaRepository<OrderingBike, Integer> {

		
		static Optional<OrderingBike> findByname(String name) {
			
			return null;
		}

		
	

	}


