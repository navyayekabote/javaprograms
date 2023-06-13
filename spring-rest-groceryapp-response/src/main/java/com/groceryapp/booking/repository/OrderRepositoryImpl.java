package com.groceryapp.booking.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.groceryapp.booking.model.Order;
@Repository
public class OrderRepositoryImpl implements IOrderRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void addOrder(Order order) {
		String sql="insert into orders (groceryId,userId,orderId) values(?,?,orderseq.nextval)";
		jdbcTemplate.update(sql,order.getGroceryId(),order.getUserId());
		
	}

	@Override
	public void deleteOrder(int orderId) {
		String sql="delete from orders where orderId=? ";
		jdbcTemplate.update(sql, orderId);
		
	}

	@Override
	public List<Order> getAll(String userId) {
		String sql="select name,brand,price,gsize,orderId from grocery,orders where grocery.groceryId=orders.groceryId and orders.userId=?";
		return jdbcTemplate.query(sql, new OrderMapper(),userId);
	}

}
