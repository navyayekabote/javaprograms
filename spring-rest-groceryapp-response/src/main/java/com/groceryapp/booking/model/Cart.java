package com.groceryapp.booking.model;

public class Cart {
	private int groceryId;
	private String groceryName;
	private String brand;
	private String category;
	private double price;
	private String size;
	private int cartId;
	private String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
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
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Cart(int groceryId, String groceryName, String brand, String category, double price, String size,
			int cartId,String userId) {
		super();
		this.groceryId = groceryId;
		this.groceryName = groceryName;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.size = size;
		this.cartId = cartId;
		this.userId=userId;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cart [groceryId=" + groceryId + ", groceryName=" + groceryName + ", brand=" + brand + ", category="
				+ category + ", price=" + price + ", size=" + size + ", cartId=" + cartId + ", userId=" + userId + "]";
	}
	
	
}
