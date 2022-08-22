package com.example.outbox.user.dto;

import lombok.Data;

import javax.validation.constraints.Email;

@Data
public class UpdateEmailDTO {
	@Email(message = "Invalid email format")
	private String email;
}