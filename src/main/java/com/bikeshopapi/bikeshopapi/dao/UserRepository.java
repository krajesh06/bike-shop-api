package com.bikeshopapi.bikeshopapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.bikeshopapi.bikeshopapi.model.User;



	@Repository
	public interface UserRepository extends JpaRepository<User, Integer> {
//		User save(User user);
	

	}

