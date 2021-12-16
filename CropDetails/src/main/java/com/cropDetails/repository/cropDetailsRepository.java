package com.cropDetails.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cropDetails.module.CropDetails;


// created Repository which is extende with MongoRepository
public interface cropDetailsRepository extends MongoRepository<CropDetails, Integer>{

}
