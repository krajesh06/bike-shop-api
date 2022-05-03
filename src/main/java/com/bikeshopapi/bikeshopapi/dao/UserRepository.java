package com.bikeshopapi.bikeshopapi.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.bikeshopapi.bikeshopapi.model.User;



	@Repository
	public interface UserRepository extends JpaRepository<User, Integer> {

	
//		User save(User user);

		Optional<User> findByNameAndPassword(String name, String password);
	

	}
