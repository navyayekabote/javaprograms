package com.groceryapp.booking.service;

import java.util.List;

import com.groceryapp.booking.model.Order;
import com.groceryapp.booking.model.OrderDTO;

public interface IOrderService {
	void addOrder(Order order);
	void deleteOrder(int orderId);
	List<OrderDTO> getAll(String userId);
}
