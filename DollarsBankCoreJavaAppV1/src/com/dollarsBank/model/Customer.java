package com.dollarsBank.model;


import java.util.Date;
import java.util.List;

public class Customer 
{
	private int userAccountNumber;
	private String password;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private String[] lastTransactions = new String[5];
 	
	public Customer(int cxNumber, String first, String last, String phone, String address, String password) 
	{
		this.setUserAccountNumber(cxNumber);
		this.setFirstName(first);
		this.setLastName(last);
		this.setPhone(phone);
		this.setAddress(address);
		this.setPassword(password);
	}
	public Customer(int cxNumber) 
	{
		this.setUserAccountNumber(cxNumber);
		this.setFirstName("Name");
		this.setLastName("last");
		this.setPhone("123456789");
		this.setAddress("united states");
		this.setPassword("password");
	}
	public int getUserAccountNumber() 
	{
		return userAccountNumber;
	}
	private void setUserAccountNumber(int cxNumber) 
	{
		this.userAccountNumber = cxNumber;
	}
	
	public String getPassword() {
		return password;
	}
	private void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	private void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	public void setTransactons(String in)
	{
		for (int i = 4; i > 0; i--)
		{
			lastTransactions[i] = lastTransactions[i-1];
		}
		lastTransactions[0] = in;
	}
	
	public String[] getLastTransactons()
	{
		return lastTransactions;
	}
	
}
