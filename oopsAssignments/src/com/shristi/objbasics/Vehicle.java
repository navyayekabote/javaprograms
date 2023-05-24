package com.shristi.objbasics;

public class Vehicle {
	String model;
	double price;
	String brand;
	public Vehicle(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	void getDetails()
	{
		System.out.println("model is: "+model);
		System.out.println("price is :"+price);
		System.out.println("Brand is :"+brand);
		if(price>500000)
			System.out.println("premium vehicle");
		else
			System.out.println("Standard vehicle");
	}
}
