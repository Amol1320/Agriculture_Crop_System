package com.farmer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.farmer.module.FarmerData;
import com.farmer.module.JwtRequest;
import com.farmer.module.JwtResponse;
import com.farmer.module.User;
import com.farmer.repository.CropDetailsRepository;
import com.farmer.repository.FarmerDataRepository;
import com.farmer.repository.UserRepository;
import com.farmer.utility.JWTUtility;



@RestController
@RequestMapping("/farmer")
public class FarmerDataController {
	
	
	
	@Autowired
	private FarmerDataRepository farmerDataRepository;
	
	@Autowired
	private CropDetailsRepository cropDetailsrepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JWTUtility jwtUtility;
	
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	
	
	@PostMapping("/authenticate")
	public JwtResponse  authenticate(@RequestBody JwtRequest jwtRequest ) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							jwtRequest.getUsername(),
							jwtRequest.getPassword()
							)
					);
		} catch (BadCredentialsException e) {
			throw new Exception("Invalid Credentials",e);
		}
		
		final UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getUsername());
		final String token = jwtUtility.generateToken(userDetails);
		return new JwtResponse(token);
	}
	
	
	@PostMapping("/signup")
	public String addUser(@RequestBody User user) {
		
		userRepository.save(user);
		
		return"USer Added Succesfully:"+user.getUsername();
	}
	
	
	@GetMapping("/findallfarmer")
	public List<FarmerData>getFarmerAllData(){
		
		return farmerDataRepository.findAll();
	}
	
	@PostMapping("/savefarmerdata")
	public String addFarmerData(@RequestBody  FarmerData farmerData) {
		farmerDataRepository.save(farmerData);
		return "Successfully Add Farmer Data ";
		
	}
	

	@GetMapping("/findallfarmer/{id}")
	public Optional<FarmerData> getFarmerById(@PathVariable("id") int id){
		return farmerDataRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeletefarmerDatebyId(@PathVariable ("id") int id ) {
		farmerDataRepository.deleteById(id);
		return "Delete Farmer Data Successfully";
		
	}
	
	
	

}
