package com.groceryapp.service;

import java.util.List;
import java.util.Optional;

import com.groceryapp.exceptions.GroceryNotfoundException;
import com.groceryapp.model.Grocery;

public interface IGroceryService {
	void addGrocery(Grocery grocery);
	void updateGrocery(int id,double price);
	void deleteGrocery(int id);
	List<Grocery> getAll();
	Grocery getById(int id) throws GroceryNotfoundException;
	List<Grocery> getByCategory(String category)throws GroceryNotfoundException;
	List<Grocery> getByName(String name)throws GroceryNotfoundException;
	List<Grocery> getByBrand(String brand)throws GroceryNotfoundException;
	List<Grocery> getByNameBrand(String name,String brand)throws GroceryNotfoundException;
	List<Grocery> getByNameAndPriceLessthan(String name,Double price)throws GroceryNotfoundException;
	List<Grocery> getByNameBrandSize(String name,String brand,String size)throws GroceryNotfoundException;
	
}
