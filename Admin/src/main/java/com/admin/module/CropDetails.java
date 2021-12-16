package com.admin.module;

/*import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
*/
//@Document(collection="Crop")
public class CropDetails {
	
	//@Id
	private int id;
	private String farmerName;
	private String cropType;
	private String cropName;
	private int quantity;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public CropDetails(int id, String farmerName, String cropType, String cropName, int quantity, String location) {
		super();
		this.id = id;
		this.farmerName = farmerName;
		this.cropType = cropType;
		this.cropName = cropName;
		this.quantity = quantity;
		this.location = location;
	}
	public CropDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CropDetails [id=" + id + ", farmerName=" + farmerName + ", cropType=" + cropType + ", cropName="
				+ cropName + ", quantity=" + quantity + ", location=" + location + "]";
	}
	
	
	
	

	
	
}
