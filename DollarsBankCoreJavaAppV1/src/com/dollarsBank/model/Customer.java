package com.dollarsBank.model;


import java.util.Date;

public class Customer 
{
	private int userAccountNumber;
	private String password;
	private String firstName;
	private String lastName;
	private Date dob;
	private String pin;
	
	public int getUserAccountNumber() {
		return userAccountNumber;
	}
	public void setUserAccountNumber(int userAccountNumber) {
		this.userAccountNumber = userAccountNumber;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "Customer [userAccountNumber=" + userAccountNumber + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", dob=" + dob + ", pin=" + pin + "]";
	}
	
	
}
