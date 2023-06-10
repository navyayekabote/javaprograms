package com.groceryapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.groceryapp.exceptions.GroceryNotfoundException;
import com.groceryapp.model.Grocery;
@Repository
public class GroceryRepositoryImpl implements IGroceryRepository{

	@Autowired
	private JdbcTemplate jdbcTempate;
	@Override
	public void addGrocery(Grocery grocery) {
		String sql="insert into grocery (groceryId,name,brand,category,price,gsize)values(groceryseq.nextval,?,?,?,?,?)";
		Object groceryAry[]= {grocery.getGroceryName(),grocery.getBrand(),grocery.getCategory(),grocery.getPrice(),grocery.getSize()};
		jdbcTempate.update(sql, groceryAry);
	}

	@Override
	public void updateGrocery(int id, double price) {
		String sql="update grocery set price=? where groceryId=?";
		jdbcTempate.update(sql, price,id);
		
	}

	@Override
	public void deleteGrocery(int id) {
		String sql="delete from grocery where groceryId=?";
		jdbcTempate.update(sql, id);
		
	}

	@Override
	public List<Grocery> findAll() {
		String sql="select * from grocery";
		return jdbcTempate.query(sql, new GroceryMapper());
		
	}

	@Override
	public Optional<Grocery> findById(int id) {
		String sql="select * from grocery where groceryId=?";
		Grocery ngrocery;
		try {
			ngrocery=jdbcTempate.queryForObject(sql, new GroceryMapper(),id);
		}catch(DataAccessException e) {
			throw new GroceryNotfoundException("invalid id");
		}Optional<Grocery> grocery=Optional.of(ngrocery);
		return grocery;
		
	}

	@Override
	public List<Grocery> findByCategory(String category) {
		String sql="select * from grocery where category=?";
		return jdbcTempate.query(sql, new GroceryMapper(),category);
	}

	@Override
	public List<Grocery> findByName(String name) {
		String sql="select * from grocery where name=?";
		return jdbcTempate.query(sql, new GroceryMapper(),name);
	}

	@Override
	public List<Grocery> findByBrand(String brand) {
		String sql="select * from grocery where brand=?";
		return jdbcTempate.query(sql, new GroceryMapper(),brand);
	}

	@Override
	public List<Grocery> findByNameBrand(String name, String brand) {
		String sql="select * from grocery where name=? and brand=?";
		return jdbcTempate.query(sql, new GroceryMapper(),name,brand);
	}

	@Override
	public List<Grocery> findByNameAndPriceLessthan(String name, Double price) {
		String sql="select * from grocery where name=? and price<?";
		return jdbcTempate.query(sql, new GroceryMapper(),name,price);
	}

	@Override
	public List<Grocery> findByNameBrandSize(String name, String brand, String size) {
		String sql="select * from grocery where name=? and brand=? and gsize=?";
		return jdbcTempate.query(sql, new GroceryMapper(),name,brand,size);
	}

}
