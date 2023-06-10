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
		String sql="insert into cart (groceryId,cartId) values(?,cartseq.nextval)";
		jdbcTemplate.update(sql,cart.getGroceryId());
		
	}

	@Override
	public List<Cart> getAll() {
		String sql="select g.groceryName,g.brand,g.price,g.size,c.cartId from grocery g inner join cart c on g.groceryId=g.cartId";
		return jdbcTemplate.query(sql,new CartMapper());
	}

}
