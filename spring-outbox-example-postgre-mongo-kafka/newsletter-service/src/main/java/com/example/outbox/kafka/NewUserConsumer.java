package com.example.outbox.kafka;

import com.example.outbox.mongo.service.NewsLetterSubscriptionService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

import java.util.function.Consumer;

//@Component("newUserConsumer")
@RequiredArgsConstructor
@Slf4j
public class NewUserConsumer implements Consumer<String> {

	private final NewsLetterSubscriptionService newsLetterSubscriptionService;

	@SneakyThrows
	@Override
	public void accept(String data) {
		log.info("Received Message from new_user topic --->" + data);
		newsLetterSubscriptionService.createNewUserSubscriptions(data);
	}
}