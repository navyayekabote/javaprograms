package com.groceryapp.repository;

import java.util.List;
import java.util.Optional;

import com.groceryapp.model.Grocery;

public interface IGroceryRepository {
	void addGrocery(Grocery grocery);
	void updateGrocery(int id,double price);
	void deleteGrocery(int id);
	List<Grocery> findAll();
	Optional<Grocery> findById(int id);
	List<Grocery> findByCategory(String category);
	List<Grocery> findByName(String name);
	List<Grocery> findByBrand(String brand);
	List<Grocery> findByNameBrand(String name,String brand);
	List<Grocery> findByNameAndPriceLessthan(String name,Double price);
	List<Grocery> findByNameBrandSize(String name,String brand,String size);
}
