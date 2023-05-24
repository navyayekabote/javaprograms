package com.mobileapp.model;

public class Mobile {
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", price=" + price + ", brand=" + brand + ", mobileId=" + mobileId + "]";
	}
	String model;
	double price;
	String brand;
	int mobileId;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public Mobile(int mobileId,String model,String brand, double price) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
		this.mobileId = mobileId;
	}
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
}
