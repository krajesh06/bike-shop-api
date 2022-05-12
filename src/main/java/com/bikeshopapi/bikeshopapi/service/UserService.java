package com.bikeshopapi.bikeshopapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.bikeshopapi.bikeshopapi.dao.UserRepository;
import com.bikeshopapi.bikeshopapi.model.User;
import com.bikeshopapi.bikeshopapi.validation.UserValidation;
@Service
public class UserService {
@Autowired
UserRepository userRepository;
	

	public void register (User user)throws Exception
	{
		UserValidation.validate(user);
		userRepository.save(user);
	}
	public String login(@RequestBody User user) {
		Optional<User> userObj=userRepository.findByNameAndPassword(user.getName(),user.getPassword());
		if(userObj.isPresent()) {
			return "success";
		}else {
		return "unsuccess";
		}
}
}

