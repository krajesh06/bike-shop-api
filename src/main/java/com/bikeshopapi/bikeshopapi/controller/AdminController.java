package com.bikeshopapi.bikeshopapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikeshopapi.bikeshopapi.dao.AdminRepository;
import com.bikeshopapi.bikeshopapi.model.Admin;

@RestController
@RequestMapping("Admin")
public class AdminController {

	
	
		@Autowired
		AdminRepository adminRepository;
		
		@PostMapping("register")
		public void admin(@RequestBody Admin admin) {
		adminRepository.save(admin);
			
		}
		}
