package com.dollarsBank.util;

import java.util.ArrayList;

import com.dollarsBank.model.CheckingAccount;
import com.dollarsBank.model.Customer;
import com.dollarsBank.model.SavingsAccount;

public class StorageUtility 
{
	private ArrayList<Customer> Cx = new ArrayList<>();
	private ArrayList<CheckingAccount> CaList = new ArrayList<>();
	private ArrayList<SavingsAccount> SaList = new ArrayList<>();

	public ArrayList<Customer> getCx() {
		return Cx;
	}
	public void addCx(Customer cx) 
	{
		Cx.add(cx);
	}
	
	public ArrayList<CheckingAccount> getCaList() 
	{
		return CaList;
	}
	public void addCaList(CheckingAccount caList)
	{
		CaList.add(caList);
	}
	
	public ArrayList<SavingsAccount> getSaList() 
	{
		return SaList;
	}
	public void addSaList(SavingsAccount saList) 
	{
		SaList.add(saList);
	}

	
}
