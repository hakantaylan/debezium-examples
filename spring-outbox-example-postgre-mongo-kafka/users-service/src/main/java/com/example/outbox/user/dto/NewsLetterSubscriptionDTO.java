package com.example.outbox.user.dto;

import com.example.outbox.user.util.NewsLetter;
import com.example.outbox.user.util.NewsLetterFrequencies;
import com.example.outbox.user.validators.EnumValueValidator;
import lombok.Data;

@Data
public class NewsLetterSubscriptionDTO {
	@EnumValueValidator(enumClass = NewsLetterFrequencies.class, message = "Frequency Is Invalid")
	private String frequency;
	@EnumValueValidator(enumClass = NewsLetter.class, message = "News Letter Is Invalid")
	private String newsLetter;
}