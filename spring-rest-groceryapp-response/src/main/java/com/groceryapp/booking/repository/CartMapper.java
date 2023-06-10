package com.groceryapp.booking.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.groceryapp.booking.model.Cart;

public class CartMapper implements RowMapper<Cart> {

	@Override
	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cart cart=new Cart();
		cart.setGroceryName(rs.getString("name"));
		cart.setBrand(rs.getString("brand"));
		cart.setPrice(rs.getDouble("price"));
		cart.setSize(rs.getString("size"));
		cart.setCartId(rs.getInt("cartId"));
		return cart;
	}

	

}
