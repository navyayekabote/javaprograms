package com.groceryapp.controllers;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groceryapp.model.Grocery;
import com.groceryapp.service.IGroceryService;

@RestController
@RequestMapping("/grocery-api")
public class GroceryControllers {

	private IGroceryService groceryService;

	public GroceryControllers(IGroceryService groceryService) {
		super();
		this.groceryService = groceryService;
	}
	@PostMapping("/groceries")
	ResponseEntity<Void> addGrocery(@RequestBody Grocery grocery){
		groceryService.addGrocery(grocery);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","adding one book ");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
	}
	@PatchMapping("/groceries/groceryId/{id}/price/{price}")
	ResponseEntity<Void> updateGrocery(@PathVariable("groceryId")int groceryId,@PathVariable("price")double price){
		groceryService.updateGrocery(groceryId, price);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","updating the book details");
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(httpHeaders).build();
	}
	@DeleteMapping("/groceries/groceryId/{id}")
	ResponseEntity<Void> deleteGrocery(@PathVariable("groceryId") int groceryId)
	{
		groceryService.deleteGrocery(groceryId);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","deleting the book details");
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(httpHeaders).build();
	}
	@GetMapping("/groceries")
	ResponseEntity<List<Grocery>> getAll(){
		List<Grocery> groceries=groceryService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(groceries);
	}
	@GetMapping("/groceries/id/{groceryId}")
	ResponseEntity<Grocery> getById(@PathVariable("groceryId")int id){
		Grocery grocery=groceryService.getById(id);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info"," book details by id");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(grocery);
	}
	@GetMapping("/groceries/name/{name}")
	ResponseEntity<List<Grocery>> getByName(@PathVariable("name")String name){
		List<Grocery> groceries=groceryService.getByName(name);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info"," book details by name");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(groceries);
	}
	@GetMapping("/groceries/brand/{brand}")
	ResponseEntity<List<Grocery>> getByBrand(@PathVariable("brand") String brand){
		List<Grocery> groceries=groceryService.getByBrand(brand);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info"," book details by brand");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(groceries);
	}
	@GetMapping("/groceries/category/{category}")
	ResponseEntity<List<Grocery>> getByNameBrand(@PathVariable("category")String category){
		List<Grocery> groceries=groceryService.getByCategory(category);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info"," book details by category");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(groceries);
	}
	@GetMapping("/groceries/name/{name}/brand/{brand}")
	ResponseEntity<List<Grocery>> getByNameBrand(@PathVariable("name")String name,@PathVariable("brand") String brand){
		List<Grocery> groceries=groceryService.getByNameBrand(name, brand);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info"," book details by name and brand");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(groceries);
	}
	@GetMapping("/groceries/name/{name}/price/{price}")
	ResponseEntity<List<Grocery>> getByNamePrice(@PathVariable("name")String name,@PathVariable("price")double price ){
		List<Grocery> groceries=groceryService.getByNameAndPriceLessthan(name, price);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info"," book details by name and price");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(groceries);
	}
	@GetMapping("/groceries/name/{name}/brand/{brand}/size/{size}")
	ResponseEntity<List<Grocery>> getByNameBrandsize(@PathVariable("name")String name,@PathVariable("brand") String brand,@PathVariable("size")String size){
		List<Grocery> groceries=groceryService.getByNameBrandSize(name, brand, size);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info"," book details by name,brand,size");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(groceries);
	}
	
	
}
