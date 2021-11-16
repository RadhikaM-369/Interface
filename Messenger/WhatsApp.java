package com.xworkz.messenger;

public class WhatsApp implements Messengers{

	public void changeDp(String imagName) {
	System.out.println("DP changed");			
	}

	public void sendMsg(long number) {
		System.out.println("Message sent");				
	}

	public void createGroup(long num1, long num2, long num3) {
		System.out.println("Group created");				
	}

}
