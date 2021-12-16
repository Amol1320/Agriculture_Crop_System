package com.dealer.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dealer.module.CropDetails;

@RestController
public class DealerAnotherController {
	
	
	// it is used to connect two ms
	/*@Autowired
	RestTemplate restTemplate;
	
	//  this method connect two microservices its give croplist which is present in crop details ms
	@GetMapping("/allcropdata")
	public List<CropDetails> getCropList(){
		
		CropDetails[] list = restTemplate.getForObject("http://localhost:8081/findallcrop",CropDetails[].class);
		return Arrays.asList(list);
	}*/
	
	

}
