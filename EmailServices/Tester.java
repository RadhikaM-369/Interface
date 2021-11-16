package com.xworkz.emailService.DAO;

public class Tester {

	public static void main(String[] args) {
		Gmail gmail=new Gmail();
		gmail.register("Radhika", "rm123456");
		gmail.logIn("Radhika", "rm123456");
		gmail.sendEmails("xworkzODC@gmail.com");
		gmail.recieveEmails("xworkzODC@gmail.com");
		gmail.storage(970);
		gmail.spam("unknown@gmail.com");

	}

}
