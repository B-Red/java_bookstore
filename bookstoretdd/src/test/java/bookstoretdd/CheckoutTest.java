package bookstoretdd;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.print.Book;

import org.junit.jupiter.api.Test;

class CheckoutTest {

	@Test
	void test_calculatePrice_returnsDoubleZeroPointZero_whenPassedAnEmptyBasket() {
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		
		Double total = checkout.calculatePrice(basket);

		assertEquals(0.0, total);

	}
	
	@Test
	void test_calculatePrice_returnsPriceOfBookInBasket_whenPassedBasketWithOneBook() {
		Basket basket = new Basket();
		Book book = new Book();
		Checkout checkout = new Checkout();
		
		basket.addBook(book);
		
		Double total = checkout.calculatePrice(basket);
		
		assertEquals(25.99, total);
	}
	
	@Test
	void test_calculatePrice_returnsPriceOfBookInBasket_whenPassedBasketWithTwoBooks() {
		Basket basket = new Basket();
		Book book = new Book();
		Checkout checkout = new Checkout();
		
		basket.addBook(book);
		basket.addBook(book);
		
		Double total = checkout.calculatePrice(basket);
		
		assertEquals(51.98, total);
		
	}
	

}
