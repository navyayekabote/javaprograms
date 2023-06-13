package com.groceryapp.booking.repository;

import java.util.List;

import com.groceryapp.booking.model.Cart;

public interface ICartRepository {
	void addCart(Cart cart);
	List<Cart> getAll(String userId);
	void deleteCart(int cartId);
	
}
