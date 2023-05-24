package com.bookapp.service;

import java.util.List;
import java.util.Optional;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {
	void addBook(Book book);
	List<Book> getByAuthor(String author)throws BookNotFoundException;
	Book getById(int id)throws BookNotFoundException;
	
	

}
