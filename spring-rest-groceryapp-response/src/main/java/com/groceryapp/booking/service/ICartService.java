package com.groceryapp.booking.service;

import java.util.List;

import com.groceryapp.booking.model.Cart;
import com.groceryapp.booking.model.CartDTO;

public interface ICartService {
	void addCart(Cart cart);
	List<CartDTO> getAll();
}
