package bookstoretdd;

public class Checkout {

	public Double calculatePrice(Basket basket) {
		if(basket.getBooksInBasket() > 0) {
			Double bookTotal = 0.0;
			
			for(int i = 1; i <= basket.getBooksInBasket(); i++) {
				bookTotal += 25.99;
			}
			
		return bookTotal;
		} 
		
		return 0.0;
	}

}
