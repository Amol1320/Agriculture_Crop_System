package com.cropDetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropDetails.module.CropDetails;
import com.cropDetails.repository.cropDetailsRepository;

@RestController
@RequestMapping("/crop")
public class cropDetailsController {
	
	
	@Autowired
	private cropDetailsRepository cropdetailsRepository;
	
	// show all The Data Which is Present in the MongoDb
	@GetMapping("/findallcrop")
	public List<CropDetails> getAllCrop(){
		return cropdetailsRepository.findAll();
	}
	
	// Save the Data into Database whichis created into MongoDb
	@PostMapping("/savecrop")
	public String addCrop(@RequestBody CropDetails cropsDetails ) {
		 cropdetailsRepository.save(cropsDetails);
		 return "Crop Details Add Successfully";
	}
	
	// This method is used to find crop data using their Id
	@GetMapping("/findallcrop/{id}")
	public Optional<CropDetails> getCropbyId(@PathVariable ("id") int id){
		return cropdetailsRepository.findById(id); 
	}
	
	//this method is used to delete data using id
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable ("id") int id) {
		cropdetailsRepository.deleteById(id);
		return "Crop Deleted Successfully ";
	}
	
	

}
