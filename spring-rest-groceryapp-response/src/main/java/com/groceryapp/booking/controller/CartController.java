package com.groceryapp.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groceryapp.booking.model.Cart;
import com.groceryapp.booking.model.CartConverter;
import com.groceryapp.booking.model.CartDTO;
import com.groceryapp.booking.service.ICartService;


@RestController
@RequestMapping("/cart-api")
public class CartController {
	@Autowired
	private ICartService cartService;
	
	@PostMapping("/carts")
	ResponseEntity<Void> addCart(@RequestBody Cart cart){
		cartService.addCart(cart);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","adding one item to cart");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
	}
	@GetMapping("/carts")
	ResponseEntity<List<CartDTO>> getAll(){
		List<CartDTO> cartsDto=cartService.getAll();
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info"," cart details by id");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(cartsDto);
	}
}
