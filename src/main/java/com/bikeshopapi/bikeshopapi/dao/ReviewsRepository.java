package com.bikeshopapi.bikeshopapi.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikeshopapi.bikeshopapi.model.Reviews;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Integer> {

	static Optional<Reviews> findByname(String name) {
		
		return null;
	}



}

