package com.bikeshopapi.bikeshopapi.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bikeshopapi.bikeshopapi.model.User;



	@Repository
	public interface UserRepository extends JpaRepository<User, Integer> {

	
//		User save(User user);

		Optional<User> findByNameAndPassword(String name, String password);

		Optional<User> findByname(String name);
		@Transactional
		@Modifying
		
		void deleteByName(String name);
         
		@Query("select u from com.bikeshopapi.bikeshopapi.model.User u where u.name=:name")
		User findByNameAndPassword(@Param("name") String name);
	
		

	}
