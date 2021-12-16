package com.farmer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmer.module.CropDetails;
import com.farmer.repository.CropDetailsRepository;

@Service
@RestController
@RequestMapping("/farmer")
public class FarmerService {
	
	
	@Autowired 
	private CropDetailsRepository cropDetailsrepository;
	
	@PostMapping("/savecrop")
	public String addCrop(@RequestBody CropDetails cropsDetails ) {
		cropDetailsrepository.save(cropsDetails);
		 return "Crop Details Add Successfully";
	}
	
	@DeleteMapping("deletecrop/{id}")
	public String deleteCrop(@PathVariable ("id") int id) {
		
		cropDetailsrepository.deleteById(id);
		return"Crop Deleted Successfully";
	}


}
