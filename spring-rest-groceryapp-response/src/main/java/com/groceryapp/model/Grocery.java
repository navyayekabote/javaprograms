package com.groceryapp.model;

public class Grocery {
	private int groceryId;
	private String groceryName;
	private String brand;
	private String category;
	private double price;
	private String size;

	public int getGroceryId() {
		return groceryId;
	}

	public void setGroceryId(int groceryId) {
		this.groceryId = groceryId;
	}

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public Grocery(int groceryId, String groceryName, String brand, String category, double price, String size) {
		super();
		this.groceryId = groceryId;
		this.groceryName = groceryName;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.size = size;
	}

	public Grocery() {
		super();

	}

	@Override
	public String toString() {
		return "Grocery [groceryId=" + groceryId + ", groceryName=" + groceryName + ", brand=" + brand + ", category="
				+ category + ", price=" + price + ", size=" + size + "]";
	}

}
