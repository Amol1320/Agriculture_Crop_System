package com.admin.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.admin.module.CropDetails;
import com.admin.module.DealerData;
import com.admin.module.FarmerData;
import com.admin.module.OrderDetails;



@RestController
public class AdminController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	// This method is used to connect cropdetails ms geting the data from cropdetails  
	@GetMapping("/allcropdata")
	public List<CropDetails> getCropList(){
		
		CropDetails[] list = restTemplate.getForObject("http://localhost:8081/findallcrop",CropDetails[].class);
		return Arrays.asList(list);
	}
	
	@GetMapping("/allorderdata")
	public List<OrderDetails> getOrderList(){
		
		String url ="http://localhost:8086//findallorder";
		OrderDetails[] list = restTemplate.getForObject(url, OrderDetails[].class);
		return Arrays.asList(list);
	}
	
	@GetMapping("/alldelerdata")
	public List<DealerData> getDealerList(){
		
		String url ="http://localhost:8083/finddealerdata";
		DealerData[] list = restTemplate.getForObject(url, DealerData[].class);
		return Arrays.asList(list);
	}
	
	@GetMapping("/allfarmerdata")
	public List<FarmerData> getFarmerList(){
		String url ="http://localhost:8082/findallfarmer";
		FarmerData[] list = restTemplate.getForObject(url, FarmerData[].class);
		return Arrays.asList(list);
	}
	 

}
