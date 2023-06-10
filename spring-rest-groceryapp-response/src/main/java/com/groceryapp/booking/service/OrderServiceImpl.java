package com.groceryapp.booking.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groceryapp.booking.model.Order;
import com.groceryapp.booking.model.OrderConverter;
import com.groceryapp.booking.model.OrderDTO;
import com.groceryapp.booking.repository.IOrderRepository;
@Service
public class OrderServiceImpl implements IOrderService{
	@Autowired
	private IOrderRepository orderRepository;
	@Autowired
	private OrderConverter orderConverter;
	@Override
	public void addOrder(Order order) {
		orderRepository.addOrder(order);
		
	}

	@Override
	public void deleteOrder(int orderId) {
		orderRepository.deleteOrder(orderId);
		
	}

	@Override
	public List<OrderDTO> getAll() {
		List<Order> orders=orderRepository.getAll();
		return orders.stream().map((order)->orderConverter.toDTO(order)).collect(Collectors.toList());
	}

}
