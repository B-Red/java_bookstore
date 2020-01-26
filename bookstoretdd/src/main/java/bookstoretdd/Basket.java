package bookstoretdd;

import java.awt.print.Book;
import java.util.ArrayList;

public class Basket {

	ArrayList<Book> books = new ArrayList<Book>();

	public int getBooksInBasket() {
		return books.size();
	}

	public void addBook(Book book) {
		books.add(book);
	}

}
