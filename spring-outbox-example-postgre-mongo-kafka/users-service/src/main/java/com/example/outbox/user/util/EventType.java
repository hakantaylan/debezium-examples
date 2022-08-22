package com.example.outbox.user.util;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum EventType {

	INSERT("I"),
	UPDATE("U"),
	DELETE("D"),
	SOFT_DELETE("S");

	private String type;
}