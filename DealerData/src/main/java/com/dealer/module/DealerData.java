package com.dealer.module;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "DealerData")
public class DealerData {
	
	
	@Id
	private String dealerid;
	private String dealername;
	private String location;
	private int age;
	private String phoneNumber;
	
	public String getDealerid() {
		return dealerid;
	}
	
	public void setDealerid(String dealerid) {
		this.dealerid = dealerid;
	}
	
	public String getDealername() {
		return dealername;
	}
	
	public void setDealername(String dealername) {
		this.dealername = dealername;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public DealerData(String dealerid, String dealername, String location, int age, String phoneNumber) {
		super();
		this.dealerid = dealerid;
		this.dealername = dealername;
		this.location = location;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public DealerData() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DealerData [dealerid=" + dealerid + ", dealername=" + dealername + ", location=" + location + ", age="
				+ age + ", phoneNumber=" + phoneNumber + "]";
	}	
		
	
	
	
	
	
	
	
	
	
	

}
