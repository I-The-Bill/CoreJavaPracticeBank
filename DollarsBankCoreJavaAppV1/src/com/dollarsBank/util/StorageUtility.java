package com.dollarsBank.util;

import java.util.ArrayList;

import com.dollarsBank.model.CheckingAccount;
import com.dollarsBank.model.Customer;
import com.dollarsBank.model.SavingsAccount;

public class StorageUtility 
{
	private ArrayList<Customer> CxList = new ArrayList<>();
	private ArrayList<CheckingAccount> CaList = new ArrayList<>();
	private ArrayList<SavingsAccount> SaList = new ArrayList<>();

	public ArrayList<Customer> getCxList() 
	{
		return CxList;
	}
	public void addCx(Customer cx) 
	{
		CxList.add(cx);
	}
	public Customer getCx(int UserId) 
	{
		return CxList.get(UserId);
	}
	
	public ArrayList<CheckingAccount> getCaList() 
	{
		return CaList;
	}
	public void addCaList(CheckingAccount caList)
	{
		CaList.add(caList);
	}
	public CheckingAccount getCaList(int id)
	{
		return CaList.get(id);
	}
	public ArrayList<SavingsAccount> getSaList() 
	{
		return SaList;
	}
	public void addSaList(SavingsAccount saList) 
	{
		SaList.add(saList);
	}
	public SavingsAccount saList(int id)
	{
		return SaList.get(id);
	}
	
}
