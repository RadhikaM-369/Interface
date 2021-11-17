package com.xworkz.emailService.DAO;

public class Yahoo implements EmailServices{

	public void register(String userId, String password) {
	    System.out.println("Registered successfuly");			
	}

	public void logIn(String id, String pass) {
		System.out.println("logIn successfuly");			
	}

	public void sendEmails(String address) {
		System.out.println("Email sent...!!");	
	}

	public void recieveEmails(String address) {
		System.out.println("Email recieved...!!");			
	}

	public void storage(int size) {
		System.out.println("Data stored...!!");		
	}

	public void spam(String address) {
		System.out.println("Spam & blocked...!!");	
	}

}
