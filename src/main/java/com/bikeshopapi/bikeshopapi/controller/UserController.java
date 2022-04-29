package com.bikeshopapi.bikeshopapi.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikeshopapi.bikeshopapi.dao.UserRepository;
import com.bikeshopapi.bikeshopapi.model.User;


@RestController
public class UserController {

	
	
		@Autowired
		UserRepository userRepository;
		
		@PostMapping("User/register")
		public void user(@RequestBody User user) {
		userRepository.save(user);
			
		}
		
		

		}

