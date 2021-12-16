package com.order.repository;

import java.util.Optional;

import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.order.module.OrderDetails;

public interface OrderDetailsRepository extends MongoRepository<OrderDetails, String> {
	



	public Optional<OrderDetails> findBydealername(String dealername);
	
	
}
