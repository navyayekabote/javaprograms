package com.groceryapp.booking.model;

import org.springframework.stereotype.Component;

@Component
public class CartConverter {
	public CartDTO toDTO(Cart cart) {
		CartDTO cartDto=new CartDTO();
		cartDto.setGroceryName(cart.getGroceryName());
		cartDto.setBrand(cart.getBrand());
		cartDto.setPrice(cart.getPrice());
		cartDto.setCartId(cart.getCartId());
		cartDto.setSize(cart.getSize());
		return cartDto;
	}
}
