package com.groceryapp.booking.model;

public class CartDTO {
	private String groceryName;
	private String brand;
	private double price;
	private String size;
	private int cartId;
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
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public CartDTO(String groceryName, String brand, double price, String size, int cartId) {
		super();
		this.groceryName = groceryName;
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.cartId = cartId;
	}
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CartDTO [groceryName=" + groceryName + ", brand=" + brand + ", price=" + price + ", size=" + size
				+ ", cartId=" + cartId + "]";
	}
	
}
