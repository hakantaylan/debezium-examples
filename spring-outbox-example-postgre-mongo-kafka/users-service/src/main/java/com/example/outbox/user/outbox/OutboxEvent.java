package com.example.outbox.user.outbox;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OutboxEvent {
	private String aggregateName;
	private String aggregateId;
	private String eventType;
	private String eventName;
	private JsonNode payload;
}