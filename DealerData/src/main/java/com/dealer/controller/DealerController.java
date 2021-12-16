package com.dealer.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dealer.module.CropDetails;
import com.dealer.module.DealerData;
import com.dealer.repository.DealerDataRepository;



@RestController
@RequestMapping("/dealer")
public class DealerController {
	
	
	@Autowired
	private DealerDataRepository dealerDataRepository;
	
	// it is used to connect two ms
	@Autowired
	RestTemplate restTemplate;
	
	
	//its gives all dealer data which is present in th mongodb 
	@GetMapping("/finddealerdata")
	public List<DealerData> getAllData(){
		
		return dealerDataRepository.findAll();
	}
	
	//this method add the data into the database
	@PostMapping("/savedealerdata")
	public String SaveDealarData(@RequestBody DealerData dealerData) {
		
		dealerDataRepository.save(dealerData);
		return "Add Dealer Data Successfully";
	}
	
	// this method delete data which is available in the database 
	@DeleteMapping("/deletedealerdata/{dealerid}")
	public String deletDatabyId(@PathVariable ("dealerid") String dealerid) {
		dealerDataRepository.deleteById(dealerid);
		return "Dealer data deleted Successfully";
		
	}
	
	// this method is usedto find dealer data using dealer id
	@GetMapping("/findalldealer/{dealerid}")
	public Optional<DealerData> getdealerbyId(@PathVariable ("dealerid") String dealerid){
		return dealerDataRepository.findById(dealerid); 
	}
	
	
	//------------------------------- This method for connecting two Microservices-------------------------------------
	
	//  this method connect two microservices its give croplist which is present in crop details ms
	@GetMapping("/allcropdata")
	public List<CropDetails> getCropList(){
		
		CropDetails[] list = restTemplate.getForObject("http://localhost:8081/findallcrop",CropDetails[].class);
		return Arrays.asList(list);
	}
	
	
	
	
	
	
}
	

