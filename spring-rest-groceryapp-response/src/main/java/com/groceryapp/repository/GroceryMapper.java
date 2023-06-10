package com.groceryapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.groceryapp.model.Grocery;

public class GroceryMapper implements RowMapper<Grocery>{

	@Override
	public Grocery mapRow(ResultSet rs, int rowNum) throws SQLException {
		Grocery grocery=new Grocery();
		grocery.setGroceryId(rs.getInt("groceryId"));
		grocery.setGroceryName(rs.getString("name"));
		grocery.setCategory(rs.getString("category"));
		grocery.setBrand(rs.getString("brand"));
		grocery.setPrice(rs.getDouble("price"));
		grocery.setSize(rs.getString("gsize"));
		return grocery;
	}

}
