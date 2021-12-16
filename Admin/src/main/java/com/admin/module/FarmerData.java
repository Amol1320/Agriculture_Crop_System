package com.admin.module;
/*
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;*/

//@Document(collection="farmerData")
public class FarmerData {
	
	//@Id
	private int farmerid;
	private String name;
	private String location;
	private int age;
	private String phone;
	
	public int getId() {
		return farmerid;
	}
	public void setId(int id) {
		this.farmerid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public FarmerData(int id, String name, String location, int age, String phone) {
		super();
		this.farmerid = id;
		this.name = name;
		this.location = location;
		this.age = age;
		this.phone = phone;
	}
	public FarmerData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FarmerData [id=" + farmerid + ", name=" + name + ", location=" + location + ", age=" + age + ", phone="
				+ phone + "]";
	}
	
	
	
	
	
	
	


}
