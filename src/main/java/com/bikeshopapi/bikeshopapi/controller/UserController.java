package com.bikeshopapi.bikeshopapi.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikeshopapi.bikeshopapi.dao.UserRepository;
import com.bikeshopapi.bikeshopapi.model.User;


@RestController
@RequestMapping("User")
public class UserController {

	
	
		@Autowired
		UserRepository userRepository;
		
		@PostMapping("register")
		public void user(@RequestBody User user) {
		userRepository.save(user);
			
		}
		
		@PostMapping("login")
		public User login(@RequestBody User user) {
			Optional<User> userObj = userRepository.findByNameAndPassword(user.getName(), user.getPassword());
			return userObj.get();

		}
		}
		

		
