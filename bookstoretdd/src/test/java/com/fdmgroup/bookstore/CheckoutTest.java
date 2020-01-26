package com.fdmgroup.bookstore;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.bookstore.Basket;
import com.fdmgroup.bookstore.Book;

public class CheckoutTest {

	// test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket
	@Test
	public void test_CalculatePrice() {
		// Arrange
		Basket bk = new Basket();
		Checkout ck = new Checkout();
		
		// Act
		double price = ck.calculatePrice(bk);
		
		// Assert
		assertEquals(0.0, price);
		
	}
	
	// test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook
	@Test
	public void test_CalculatePrice_OneBook() {
		// Arrange
		Basket basket2 = new Basket();
		Checkout checkout2 = new Checkout();
		Book book2 = new Book();
		
		// Act
		basket2.addBook(book2);
		
		// Assert
		assertEquals(5.0, checkout2.calculatePrice(basket2));
		
	}
		
	/* test_CalculatePrice_ReturnsPriceOfBookInBasket_
	/* WhenPassedBasketWithTwoBooks
	*/
	@Test
	public void test_CalculatePrice_TwoBooks() {
		// Arrange
		Basket basket2 = new Basket();
		Checkout checkout2 = new Checkout();
		Book book2 = new Book();
		
		// Act
		basket2.addBook(book2);
		basket2.addBook(book2);
		
		// Assert
		assertEquals(10.0, checkout2.calculatePrice(basket2));
		
	}
	
	/* test_CalculatePrice_ReturnsPriceOfBookInBasket_
	 * WhenPassedBasketWithThreeBooks 
	 */
	@Test
	public void test_CalculatePrice_ThreeBooks() {
		// Arrange
		Basket basket2 = new Basket();
		Checkout checkout2 = new Checkout();
		Book book2 = new Book();
		
		// Act
		basket2.addBook(book2);
		basket2.addBook(book2);
		basket2.addBook(book2);
		
		// Assert
		assertEquals(14.85, checkout2.calculatePrice(basket2));
		
	}
	
	/* test_CalculatePrice_ReturnsPriceOfBookInBasket_
	 * WhenPassedBasketWithSevenBooks 
	 */
	@Test
	public void test_CalculatePrice_SevenBooks() {
		// Arrange
		Basket basket2 = new Basket();
		Checkout checkout2 = new Checkout();
		Book book2 = new Book();
		int test = 7;
		
		// Act
		for (int i=0; i < test; i++) {
			basket2.addBook(book2);
			
		}
		
		// Assert
		assertEquals(34.3, checkout2.calculatePrice(basket2));
		
	}
	
	/* test_CalculatePrice_ReturnsPriceOfBookInBasket_
	 * WhenPassedBasketWithTenBooks 
	 */
	@Test
	public void test_CalculatePrice_TenBooks() {
		// Arrange
		Basket basket2 = new Basket();
		Checkout checkout2 = new Checkout();
		Book book2 = new Book();
		int test = 10;
		
		// Act
		for (int i=0; i < test; i++) {
			basket2.addBook(book2);
			
		}
		
		// Assert
		assertEquals(43.5, checkout2.calculatePrice(basket2));
		
	}
}
