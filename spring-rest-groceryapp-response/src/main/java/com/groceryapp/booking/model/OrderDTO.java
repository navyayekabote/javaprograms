package com.groceryapp.booking.model;

public class OrderDTO {
	private String groceryName;
	private String brand;
	private double price;
	private String size;
	private int orderId;
	public String getGroceryName() {
		return groceryName;
	}
	public void setGroceryName(String groceryName) {
		this.groceryName = groceryName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public OrderDTO(String groceryName, String brand, double price, String size, int orderId) {
		super();
		this.groceryName = groceryName;
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.orderId = orderId;
	}
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CartDTO [groceryName=" + groceryName + ", brand=" + brand + ", price=" + price + ", size=" + size
				+ ", orderId=" + orderId + "]";
	}
	
}
