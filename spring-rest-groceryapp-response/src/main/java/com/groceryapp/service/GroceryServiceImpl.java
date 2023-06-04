package com.groceryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.groceryapp.exceptions.GroceryNotfoundException;
import com.groceryapp.model.Grocery;
import com.groceryapp.repository.IGroceryRepository;
@Service
public class GroceryServiceImpl implements IGroceryService{
	
	IGroceryRepository groceryrepository;
	
	public GroceryServiceImpl(IGroceryRepository groceryrepository) {
		super();
		this.groceryrepository = groceryrepository;
	}

	@Override
	public void addGrocery(Grocery grocery) {
		groceryrepository.addGrocery(grocery);
		
	}

	@Override
	public void updateGrocery(int id, double price) {
		groceryrepository.updateGrocery(id, price);
		
	}

	@Override
	public void deleteGrocery(int id) {
		groceryrepository.deleteGrocery(id);
		
	}

	@Override
	public List<Grocery> getAll() {
	List<Grocery> groceries=groceryrepository.findAll();
		return groceries;
	}

	@Override
	public Grocery getById(int id) throws GroceryNotfoundException{
		return 	groceryrepository.findById(id)
				.orElseThrow(()-> new GroceryNotfoundException("invalid id"));
		
	}

	@Override
	public List<Grocery> getByCategory(String category) throws GroceryNotfoundException{
		List<Grocery> groceries=groceryrepository.findByCategory(category);
		if(groceries.isEmpty())
			throw new GroceryNotfoundException("Invalid category");
		return groceries;
	}

	@Override
	public List<Grocery> getByName(String name) throws GroceryNotfoundException{
		List<Grocery> groceries=groceryrepository.findByName(name);
		if(groceries.isEmpty())
			throw new GroceryNotfoundException("Invalid category");
		return groceries;
	}

	@Override
	public List<Grocery> getByBrand(String brand) throws GroceryNotfoundException{
		List<Grocery> groceries=groceryrepository.findByBrand(brand);
		if(groceries.isEmpty())
			throw new GroceryNotfoundException("Invalid category");
		return groceries;
	}

	@Override
	public List<Grocery> getByNameBrand(String name, String brand) throws GroceryNotfoundException{
		List<Grocery> groceries=groceryrepository.findByNameBrand(name, brand);
		if(groceries.isEmpty())
			throw new GroceryNotfoundException("Invalid category");
		return groceries;
	}

	@Override
	public List<Grocery> getByNameAndPriceLessthan(String name, Double price) throws GroceryNotfoundException{
		List<Grocery> groceries=groceryrepository.findByNameAndPriceLessthan(name, price);
		if(groceries.isEmpty())
			throw new GroceryNotfoundException("Invalid category");
		return groceries;
	}

	@Override
	public List<Grocery> getByNameBrandSize(String name, String brand, String size) throws GroceryNotfoundException{
		List<Grocery> groceries=groceryrepository.findByNameBrandSize(name, brand, size);
		if(groceries.isEmpty())
			throw new GroceryNotfoundException("Invalid category");
		return groceries;
	}

}
