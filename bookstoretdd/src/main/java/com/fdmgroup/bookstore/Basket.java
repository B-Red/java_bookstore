package com.fdmgroup.bookstore;

import java.util.ArrayList;

public class Basket {

	private ArrayList<Book> books;  
	
	public Basket() {
		books = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public ArrayList<Book> getBooksList() {
		return books;
	}
	
	public int getBooksInBasket() {
		return books.size();
	}

}
