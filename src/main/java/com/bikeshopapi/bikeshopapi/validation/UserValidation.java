 package com.bikeshopapi.bikeshopapi.validation;

import com.bikeshopapi.bikeshopapi.model.User;

public class UserValidation {
	public static void validate(User user) throws Exception {
		if (user.getName().isBlank() || user.getName().isEmpty()) {
			throw new Exception("Enter a valid NAME");
		} else if (user.getMobilenumber().length() == 10) {
			char[] mobile = user.getMobilenumber().toCharArray();
			@SuppressWarnings("unused")
			int count = 0;
			if (mobile.length > 10 || mobile.length < 10) {
				throw new Exception("Mobile Number Must Be 10 Digits Long");
			} else {
				count++;
			}
			for (char i : mobile) {
				if (Character.isAlphabetic(i)) {
					throw new Exception("Enter only Numeric values");
				} else {
					count++;
				}
			}
		} else if (!user.getMail_id().contains("@")) {
			throw new Exception("Enter Valid EmailId");
		} else if (user.getPassword().isBlank() || user.getPassword().isEmpty() || user.getPassword().length() > 8) {
			throw new Exception("Enter a Valid Password");
		}
		if (user.getRole() != null ) {
		} else {
			throw new Exception("The role cannot be empty");
		}
		System.out.println("You have registerd successfully");

	
}
	public static void loginvalidate(User user) throws Exception {
		if (user.getName() == null || user.getName().trim().equals("")) {
			throw new Exception("Invalid name. name cannot be empty/blank");
		}
		if (user.getPassword() == null || user.getPassword().length() < 8) {
			throw new Exception("password must be in 8 characters");
		}
		System.out.println("You have logged successfully");
	}
}
