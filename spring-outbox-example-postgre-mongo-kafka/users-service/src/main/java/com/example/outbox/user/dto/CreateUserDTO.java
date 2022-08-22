package com.example.outbox.user.dto;

import lombok.Data;

@Data
public class CreateUserDTO {
	private String fullName;
	private String email;
	private String mobileNumber;
	private String gender;
}