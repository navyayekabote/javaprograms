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
		String sql="insert into order (groceryId,userId,orderId) values(?,?,orderseq.nextval)";
		jdbcTemplate.update(sql,order.getGroceryId(),order.getUserId());
		
	}

	@Override
	public void deleteOrder(int orderId) {
		String sql="delete from order where orderId=? ";
		jdbcTemplate.update(sql, orderId);
		
	}

	@Override
	public List<Order> getAll() {
		String sql="select g.groceryName,g.brand,g.price,g.size,c.cartId from grocery g inner join order d on g.groceryId=o.groceryId";
		return jdbcTemplate.query(sql, new OrderMapper());
	}

}
