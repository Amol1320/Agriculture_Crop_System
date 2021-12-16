package com.admin.module;

/*import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;*/

//@Document(collection = "OrderDetails")
public class OrderDetails {
	
	//@Id
	private String orderId;
	private int id;    // crop id
	private String name;   //farmer name
	private String dealername;
	//private int id;       // crop id
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDealername() {
		return dealername;
	}
	public void setDealername(String dealername) {
		this.dealername = dealername;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public OrderDetails(String orderId, String name, String dealername, int id) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.dealername = dealername;
		this.id = id;
	}
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", name=" + name + ", dealername=" + dealername + ", id=" + id
				+ "]";
	}
	
	
	
	
	
	
	

}
