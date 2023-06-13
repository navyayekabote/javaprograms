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

import com.groceryapp.booking.model.Order;
import com.groceryapp.booking.model.OrderDTO;
import com.groceryapp.booking.service.IOrderService;

@RestController
@RequestMapping("/order-api")
public class OrderController {
	@Autowired
	private IOrderService orderService;

	// ordering the items by using userId ,groceryId
	// http://localhost:8080/order-api/orders
	@PostMapping("/orders")
	ResponseEntity<Void> addOrder(@RequestBody Order order) {
		orderService.addOrder(order);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "ordering the item");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
	}

	// getting all the orders of that particular user using userId
	// http://localhost:8080/order-api/orders/userId/
	@GetMapping("/orders/userId/{userId}")
	ResponseEntity<List<OrderDTO>> getAll(@PathVariable("userId") String userId) {
		List<OrderDTO> orderDto = orderService.getAll(userId);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", " cart details by id");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(orderDto);
	}

	// cancelling the order using orderId
	// http://localhost:8080/order-api/orders/orderId/
	@DeleteMapping("/orders/orderId/{orderId}")
	ResponseEntity<Void> cancelOrder(@PathVariable("orderId") int orderId) {
		orderService.deleteOrder(orderId);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "cancelling the order");
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(httpHeaders).build();
	}
}
