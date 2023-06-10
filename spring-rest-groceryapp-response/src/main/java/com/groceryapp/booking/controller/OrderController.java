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
	@PostMapping("/orders")
	ResponseEntity<Void> addOrder(@RequestBody Order order){
		orderService.addOrder(order);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","ordering the item");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
	}
	@GetMapping("/orders")
	ResponseEntity<List<OrderDTO>> getAll(){
		List<OrderDTO> orderDto=orderService.getAll();
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info"," cart details by id");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(orderDto);
	}
	@DeleteMapping("/orders/orderId/{orderId}")
	ResponseEntity<Void> cancelOrder(@PathVariable("orderId") int orderId)
	{
		orderService.deleteOrder(orderId);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","cancelling the order");
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(httpHeaders).build();
	}
}
