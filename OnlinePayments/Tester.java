package com.xworkz.onlinePayment;

public class Tester {

	public static void main(String[] args) {
		
		Paytm paytm=new Paytm();
		
		paytm.rechargeMobile(9988776655L, "Airtel");
		paytm.rechargeDTH(123456789L, "Airtel", 500);
		paytm.transferMoney(9988665544L, 15000);

	}

}
