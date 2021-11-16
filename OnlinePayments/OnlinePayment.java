package com.xworkz.onlinePayment;

public interface OnlinePayment {

	
		public void rechargeMobile(long mobNo, String operator);
		public void rechargeDTH(long Id, String operator, int amount);
		public void transferMoney(long num, int amount);
		
}
