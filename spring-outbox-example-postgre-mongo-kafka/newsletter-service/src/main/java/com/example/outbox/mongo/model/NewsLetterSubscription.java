package com.example.outbox.mongo.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Document(collection = "newsLetterSubscription")
@Data
@Builder
public class NewsLetterSubscription {

	@Id
	private String id;
	private String userId;
	private String newsLetter;
	private String frequency;
	private String email;
	private LocalDateTime createdOn;
}