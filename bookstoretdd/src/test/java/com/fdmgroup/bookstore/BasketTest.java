package com.fdmgroup.bookstore;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasketTest {



	
	// GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded
	@Test
	public void test_getBooksInBasket() {
		// Arrange
		Basket bk = new Basket();
		
		// Act
		int numBooks = bk.getBooksInBasket();
		
		// Assert
		assertEquals(0, numBooks);
		
	}
	
	// GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook()
		@Test
		public void test_getBooksInBasket_OneBook() {
			// Arrange
			
			Basket basket2 = new Basket();
			Book book2 = new Book();
			
			// Act
			basket2.addBook(book2);
			
			// Assert
			assertEquals(1, basket2.getBooksInBasket());
			
		}

		// GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook()
		@Test
		public void test_getBooksInBasket_TwoBooks() {
			// Arrange
			
			Basket basket2 = new Basket();
			Book book2 = new Book();
			
			// Act
			basket2.addBook(book2);
			basket2.addBook(book2);
			
			// Assert
			assertEquals(2, basket2.getBooksInBasket());
			
		}


}
