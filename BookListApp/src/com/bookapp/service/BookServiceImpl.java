package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;


public class BookServiceImpl implements IBookService {

	ArrayList<Book> booklist=new ArrayList<>();

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		
		List<Book> bookbyauthor=booklist.stream()
						.filter(book->book.getAuthor().equals(author))
						.collect(Collectors.toList());
		if(bookbyauthor.isEmpty()) {
			
			throw new BookNotFoundException("Book not found with that author");
			}
		return bookbyauthor;
	}

	@Override
	public void addBook(Book book) {
		booklist.add(book);
	}

	@Override
	public Book getById(int id) throws BookNotFoundException {
		
		int count=0;
		for(Book book:booklist)
		{
			if(book.getBookId()==id)
			{
				count++;
				return book;
			}break;
		}
		if(count==0)
		{
			throw new BookNotFoundException("book not found with that id");
		}
	     
		return null;
	}

	

}