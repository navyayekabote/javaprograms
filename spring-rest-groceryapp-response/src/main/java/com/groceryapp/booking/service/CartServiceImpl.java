package com.groceryapp.booking.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groceryapp.booking.model.Cart;
import com.groceryapp.booking.model.CartConverter;
import com.groceryapp.booking.model.CartDTO;
import com.groceryapp.booking.repository.ICartRepository;
@Service
public class CartServiceImpl implements ICartService{

	@Autowired
	private ICartRepository cartRepository;
	@Autowired
	private CartConverter cartConverter;
	@Override
	public void addCart(Cart cart) {
		cartRepository.addCart(cart);
		
	}

	@Override
	public List<CartDTO> getAll() {
		
		List<Cart> carts=cartRepository.getAll();
		return carts.stream().map((cart)->cartConverter.toDTO(cart)).collect(Collectors.toList());
	}

}
