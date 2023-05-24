package com.bookapp.main;


import java.util.List;
import java.util.Scanner;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args)throws BookNotFoundException {
		try {
		IBookService  ibookservice = new BookServiceImpl();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=2;i++)
		{
			System.out.println("Enter an title");
			String title=sc.next();
			System.out.println("Enter an author");
			String author=sc.next();
			System.out.println("Enter an id");
			int id=sc.nextInt();
			System.out.println("Enter an price");
			double price=sc.nextInt();
			ibookservice.addBook(new Book(title,author,id,price));
		}
		List<Book> bookbyauthor;
		Book bookbyid;
		
		System.out.println("-----------");
		System.out.println("book details by author");
		
		bookbyauthor=ibookservice.getByAuthor("kathy");
		for(Book book:bookbyauthor)
			System.out.println(book);
		System.out.println("-----------");
		System.out.println("book details by id");
		bookbyid=ibookservice.getById(5);
		System.out.println(bookbyid);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
			
	}

}
