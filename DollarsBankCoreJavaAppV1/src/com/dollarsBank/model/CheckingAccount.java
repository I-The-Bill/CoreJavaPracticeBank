package com.dollarsBank.model;

public class CheckingAccount 
{
	public int id;
	public int userId;
	public double amount;
	
	public CheckingAccount() 
	{
		this.setId(-1);
		this.setUserId(-1);
		this.setAmount(-1);
	}
	public CheckingAccount(int id, int userId, double amount) 
	{
		this.setId(id);
		this.setUserId(userId);
		this.setAmount(amount);
	}
	public int getId()
	{
		return id;
	}
	private void setId(int id) 
	{
		this.id = id;
	}
	public int getUserId() 
	{
		return userId;
	}
	private void setUserId(int userId) 
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
