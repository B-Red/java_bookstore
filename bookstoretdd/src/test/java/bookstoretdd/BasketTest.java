package bookstoretdd;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.print.Book;

import org.junit.jupiter.api.Test;

class BasketTest {

	@Test
	void test_getBooksInBasket_returnsEmptyBookList_ifNoBooksHaveBeenAdded() {

		Basket basket = new Basket();

		Integer noBookBasket = basket.getBooksInBasket();

		assertEquals(0, noBookBasket);
	}

	@Test
	void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		Basket basket = new Basket();
		Book book = new Book();

		basket.addBook(book);

		Integer oneBookBasket = basket.getBooksInBasket();

		assertEquals(1, oneBookBasket);
	}

	@Test
	void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithTwoBooks() {
		Basket basket = new Basket();
		Book book = new Book();

		basket.addBook(book);
		basket.addBook(book);

		Integer twoBookBasket = basket.getBooksInBasket();

		assertEquals(2, twoBookBasket);
	}

}
