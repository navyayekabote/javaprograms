package com.groceryapp.booking.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.groceryapp.booking.model.Cart;
import com.groceryapp.booking.model.Order;

public class OrderMapper implements RowMapper<Order> {
	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order=new Order();
		order.setGroceryName(rs.getString("name"));
		order.setBrand(rs.getString("brand"));
		order.setPrice(rs.getDouble("price"));
		order.setSize(rs.getString("size"));
		order.setOrderId(rs.getInt("orderId"));
		return order;
	}
}
