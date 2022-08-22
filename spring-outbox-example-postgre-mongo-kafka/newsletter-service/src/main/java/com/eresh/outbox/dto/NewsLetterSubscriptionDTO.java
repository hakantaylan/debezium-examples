package com.eresh.outbox.dto;

import lombok.Data;

@Data
public class NewsLetterSubscriptionDTO {
	private String frequency;
	private String newsLetter;
}