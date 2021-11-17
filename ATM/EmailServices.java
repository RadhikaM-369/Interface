package com.xworkz.emailService.DAO;

public interface EmailServices {

	
	public void register(String userId, String password);
	public void logIn(String id, String pass);
	public void sendEmails(String address);
	public void recieveEmails(String address);
	public void storage(int size);
	public void spam(String address);
}
