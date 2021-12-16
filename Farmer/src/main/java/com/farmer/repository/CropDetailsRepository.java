package com.farmer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.farmer.module.CropDetails;

public interface CropDetailsRepository extends MongoRepository<CropDetails, Integer>{

}
