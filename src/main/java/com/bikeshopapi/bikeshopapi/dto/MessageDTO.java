package com.bikeshopapi.bikeshopapi.dto;

import lombok.Data;

@Data

public class MessageDTO {
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MessageDTO(String message) {
		super();
		this.message = message;
	}

}