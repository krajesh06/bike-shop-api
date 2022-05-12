package com.bikeshopapi.bikeshopapi.controller;

import java.util.List;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikeshopapi.bikeshopapi.dao.UserRepository;
import com.bikeshopapi.bikeshopapi.dto.MessageDTO;
import com.bikeshopapi.bikeshopapi.model.User;
import com.bikeshopapi.bikeshopapi.service.UserService;


@RestController

public class UserController {

	
	
		@Autowired
		UserRepository userRepository;
		
		@Autowired
		UserService userservice;
		
		@SuppressWarnings("unused")
		@PostMapping("User/register")
		//public void user(@RequestBody User user) {
			public ResponseEntity<?> register(@RequestBody User user) {

				try {
					
					userservice.register(user);
					MessageDTO message=new MessageDTO("success");
					return new ResponseEntity<>("sucess",HttpStatus.OK);
					
				} catch (Exception e) {
					
					MessageDTO message=new MessageDTO(e.getMessage());
					return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
				}
			}
			
		
		@PostMapping("User/login")
		public ResponseEntity<?> login(@RequestBody User user) {
			try {
				User users=userRepository.findByNameAndPassword(user.getName());
				if(users==null)
				{
					MessageDTO message=new MessageDTO("no records found");
					return new ResponseEntity<>(message,HttpStatus.BAD_REQUEST);
				}
				else if(users.getPassword().equals(user.getPassword()))
				{
					return new ResponseEntity<>(users,HttpStatus.OK);
				}
				else
				{
					MessageDTO message=new MessageDTO("invalid password");
					return new ResponseEntity<>(message,HttpStatus.BAD_REQUEST);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				MessageDTO message = new MessageDTO(e.getMessage());
				e.printStackTrace();
				return new ResponseEntity<>(message,HttpStatus.BAD_REQUEST);
			}

		}
		
//		@PostMapping("User/login")
//		//public User login(@RequestBody User user) {
//			public ResponseEntity<?> login(@RequestBody User user){
//				try {
//					userservice.login(user);
//					MessageDTO message=new MessageDTO("success");
//					return new ResponseEntity<>(message,HttpStatus.OK);
//				}catch(Exception e) {
//					@SuppressWarnings("unused")
//					MessageDTO message=new MessageDTO(e.getMessage());
//					return new ResponseEntity<> (e.getMessage(),HttpStatus.BAD_REQUEST);
//				}
//			}
		
		@GetMapping("Admin/listUser")
		public List<User> findAll() {
			List<User> User = userRepository.findAll();
			return User;
	}
		
		@GetMapping("Admin/listUser/{username}")
		public Optional<User> user(@PathVariable("name") String name){
			Optional<User> userList=null;
			
			try
			{
				userList=userRepository.findByname(name);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return userList;
			
		}
	
		

		@DeleteMapping("Admin/listUser/{name}")
		public void delete(@PathVariable("name") String name) {
			userRepository.deleteByname(name);

		}
		}
		

		
