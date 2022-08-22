package com.example.outbox.kafka;

import com.example.outbox.mongo.service.NewsLetterSubscriptionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class CloudStreamConsumers {

    private final NewsLetterSubscriptionService newsLetterSubscriptionService;

    @Bean
    Consumer<String> consumeNewUserEvent() {
        return data -> {
            try {
                log.info("Received Message from new_user topic --->" + data);
                newsLetterSubscriptionService.createNewUserSubscriptions(data);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    @Bean
    Consumer<String> consumeEmailUpdatedEvent() {
        return data -> {
            try {
                log.info("Received Message from email_changed topic --->" + data);
                newsLetterSubscriptionService.updateEmailForUser(data);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    @Bean
    Consumer<String> consumeNewsLetterSubscriptionsEvent() {
        return data -> {
            try {
                log.info("Received Message from news_letter_subscription topic --->" + data);
                newsLetterSubscriptionService.createNewsLetterSubscriptions(data);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}