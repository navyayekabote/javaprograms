package com.groceryapp.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groceryapp.booking.model.Cart;
import com.groceryapp.booking.model.CartDTO;
import com.groceryapp.booking.service.ICartService;

@RestController
@RequestMapping("/cart-api")
public class CartController {
	@Autowired
	private ICartService cartService;

	// adding items to the cart using userid and groceryid
	// http://localhost:8080/cart-api/carts
	@PostMapping("/carts")
	ResponseEntity<Void> addCart(@RequestBody Cart cart) {
		cartService.addCart(cart);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "adding one item to cart");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
	}

	// getting all details of cart using userid
	// http://localhost:8080/cart-api/carts/userId/
	@GetMapping("/carts/userId/{userId}")
	ResponseEntity<List<CartDTO>> getAll(@PathVariable("userId") String userId) {
		List<CartDTO> cartsDto = cartService.getAll(userId);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", " cart details by id");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(cartsDto);
	}

	// delete the cart item using cartId
	// http://localhost:8080/cart-api/carts/cartId/
	@DeleteMapping("/carts/cartId/{cartId}")
	ResponseEntity<Void> deleteCart(@PathVariable("cartId") int cartId) {
		cartService.deleteCart(cartId);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", " deleting cart items");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).build();
	}

}
