package com.groceryapp.booking.repository;

import java.util.List;

import com.groceryapp.booking.model.Order;

public interface IOrderRepository {
	void addOrder(Order order);
	void deleteOrder(int orderId);
	List<Order> getAll(String userId);
}
