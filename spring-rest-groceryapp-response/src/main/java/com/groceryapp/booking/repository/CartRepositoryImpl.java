package com.groceryapp.booking.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.groceryapp.booking.model.Cart;
@Repository
public class CartRepositoryImpl implements ICartRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate; 
	@Override
	public void addCart(Cart cart) {
		String sql="insert into cart (groceryId,userId,cartId) values(?,?,cartseq.nextval)";
		jdbcTemplate.update(sql,cart.getGroceryId(),cart.getUserId());
		
	}
	@Override
	public List<Cart> getAll(String userId) {
		String sql="select name,brand,price,gsize,cartId from grocery,cart where grocery.groceryId=cart.groceryId and cart.userId=?";
		return jdbcTemplate.query(sql,new CartMapper(),userId);
	}
	@Override
	public void deleteCart(int cartId) {
		String sql="delete from cart where cartId=?";
		jdbcTemplate.update(sql, cartId);
		
	}

}
