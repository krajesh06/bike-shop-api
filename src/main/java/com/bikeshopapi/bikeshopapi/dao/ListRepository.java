package com.bikeshopapi.bikeshopapi.dao;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikeshopapi.bikeshopapi.model.ListOfBikes;



	public interface ListRepository extends JpaRepository<ListOfBikes, Integer> {

	

	

		public Optional<ListOfBikes> findBybikename(String bikename);

		

	

	}

