package com.groceryapp.booking.model;

import org.springframework.stereotype.Component;

@Component
public class OrderConverter {
	public OrderDTO toDTO(Order order) {
		OrderDTO orderDto=new OrderDTO();
		orderDto.setGroceryName(order.getGroceryName());
		orderDto.setBrand(order.getBrand());
		orderDto.setPrice(order.getPrice());
		orderDto.setOrderId(order.getOrderId());
		orderDto.setSize(order.getSize());
		return orderDto;
	}
}
