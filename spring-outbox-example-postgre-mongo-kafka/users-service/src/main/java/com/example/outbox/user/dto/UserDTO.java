package com.example.outbox.user.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class UserDTO {
	private String id;
	private String fullName;
	private String email;
	private String mobileNumber;
	private String gender;
	private LocalDateTime createdAt;
}