package com.dollarsBank.model;

public class CheckingAccount 
{
	public int id;
	public int userId;
	public double amount;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
		
	}
	public int getUserId() 
	{
		return userId;
	}
	public void setUserId(int userId) 
	{
		this.userId = userId;
	}
	public double getAmount() 
	{
		return amount;
	}
	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
}
