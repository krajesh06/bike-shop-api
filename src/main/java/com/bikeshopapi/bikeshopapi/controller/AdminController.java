package com.bikeshopapi.bikeshopapi.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikeshopapi.bikeshopapi.dao.AdminRepository;
import com.bikeshopapi.bikeshopapi.model.Admin;

@RestController

public class AdminController {

	
	
		@Autowired
		AdminRepository adminRepository;
		
		@PostMapping("Admin/register")
		public void admin(@RequestBody Admin admin) {
		adminRepository.save(admin);
			
		}
		@PostMapping("Admin/login")
		public Admin login(@RequestBody Admin admin) {
			Optional<Admin> adminObj = adminRepository.findByNameAndPassword(admin.getName(), admin.getPassword());
			return adminObj.get();

		}
		}
