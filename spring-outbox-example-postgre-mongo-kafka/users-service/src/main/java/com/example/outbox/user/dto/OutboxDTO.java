package com.example.outbox.user.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class OutboxDTO {
	private String id;
	private String aggregateId;
	private String eventType;
	private String payload;
	private LocalDateTime createdOn;
}