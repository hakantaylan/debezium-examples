package com.example.outbox.user.controller;

import com.example.outbox.user.dto.CreateNewsLetterSubscriptionDTO;
import com.example.outbox.user.dto.CreateUserDTO;
import com.example.outbox.user.dto.UpdateEmailDTO;
import com.example.outbox.user.dto.UserDTO;
import com.example.outbox.user.service.UsersService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UsersController {

	private final UsersService usersService;

	@PostMapping("/user")
	public ResponseEntity<UserDTO> createUser(@RequestBody CreateUserDTO request) {
		return ResponseEntity.ok(usersService.createUser(request));
	}

	@PutMapping("/user/subscribe")
	public ResponseEntity<Object> subscribeToNewsLetters(@Valid @RequestBody CreateNewsLetterSubscriptionDTO request) {
		usersService.createNewsLetterSubscriptions(request);
		return ResponseEntity.ok("success");
	}

	@PutMapping("/user/email/{id}")
	public ResponseEntity<UserDTO> updateEmail(@Valid @RequestBody UpdateEmailDTO request, @PathVariable String id) {
		return ResponseEntity.ok(usersService.updateUserEmail(request, id));
	}
}
