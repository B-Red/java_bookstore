package com.fdmgroup.bookstore;

public class Checkout {

	public Checkout() {
		
	}
	
	public double calculatePrice(Basket bk) {
		double total;
		double prices = 5.0;
		double discount = 0.0;
		
		double num = bk.getBooksInBasket();
		
		discount = calculateDiscount(num);
		
		total = num * prices * (1.0 - discount);
		
		return total;
	}
	
	public double calculateDiscount(double numBooks) {
		double discount = 0;
		double bookSale = 3; 
	
		// 3 books => .01
		// 6 books => .02
		
		if ( numBooks >= 3) {
			discount = Math.floor(numBooks / bookSale);
			discount /= 100;
		}
		if ( numBooks >= 10) {
			discount += 0.1;
		}
		
		return discount;
	}

}
