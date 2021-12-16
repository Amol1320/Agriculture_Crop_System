package com.dealer.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dealer.module.DealerData;


public interface DealerDataRepository extends MongoRepository<DealerData, String>{

}
