package com.xworkz.onlineShopping;

public class Amazon implements OnlineShopping {

	public void searchProduct(String category) {
		System.out.println("Search successful...");			
	}

	public void wishlist(String product) {
		System.out.println("add to wishlist successful...");			
	}

	public void buy(String product, int amount) {
		System.out.println("Transaction successful...");	
	}

	
	
}
