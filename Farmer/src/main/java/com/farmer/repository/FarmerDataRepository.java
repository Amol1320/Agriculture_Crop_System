package com.farmer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

//import com.farmer.module.CropDetails;
import com.farmer.module.FarmerData;

public interface FarmerDataRepository extends MongoRepository<FarmerData, Integer>{

}

