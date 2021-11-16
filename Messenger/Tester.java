package com.xworkz.messenger;

public class Tester {

	public static void main(String[] args) {
		WhatsApp whatsapp=new WhatsApp();
		whatsapp.changeDp("img_11011");
		whatsapp.sendMsg(1234567890L);
		whatsapp.createGroup(9988776655L, 1234567890L, 9446523100L);
	}

}
