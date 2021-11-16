package com.xworkz.onlinePayment;

public class Phonepe implements OnlinePayment {

	public void rechargeMobile(long mobNo, String operator) {
		System.out.println("Mobile recharge successful...!!");			
	}

	public void rechargeDTH(long Id, String operator, int amount) {
		System.out.println("DTH recharge successful...!!");		
	}

	public void transferMoney(long num, int amount) {
		System.out.println("Money transfer successful...!!");			
	}
	
}
