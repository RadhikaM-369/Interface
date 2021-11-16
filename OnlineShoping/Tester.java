package com.xworkz.onlineShopping;

public class Tester {

	public static void main(String[] args) {
		
		Amazon amazon=new Amazon();
		amazon.searchProduct("women_category");
		amazon.wishlist("books");
		amazon.buy("watch", 600);

	}

}
