package com.example.outbox.dto;

import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class SubscriptionsEventDTO {
	private String userId;
	private String email;
	private List<NewsLetterSubscriptionDTO> subscriptions = Collections.emptyList();
}