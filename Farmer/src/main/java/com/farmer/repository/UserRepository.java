package com.farmer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.farmer.module.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	User findByUsername(String username);

}
