package com.example.outbox.mongo.repository;

import com.example.outbox.mongo.model.NewsLetterSubscription;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsLetterSubscriptionRepository extends MongoRepository<NewsLetterSubscription, String> {
	List<NewsLetterSubscription> findByUserId(String userId);
}