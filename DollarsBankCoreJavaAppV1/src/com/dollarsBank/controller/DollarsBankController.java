package com.dollarsBank.controller;

import java.sql.Date;
import java.util.Scanner;

import com.dollarsBank.exceptions.InvalidCredentialsException;
import com.dollarsBank.exceptions.TransactionNotPossibleException;
import com.dollarsBank.exceptions.UserNotFoundException;
import com.dollarsBank.model.CheckingAccount;
import com.dollarsBank.model.Customer;
import com.dollarsBank.model.SavingsAccount;
import com.dollarsBank.util.ConsolePrinterUtility;
import com.dollarsBank.util.StorageUtility;

public class DollarsBankController 
{
	ConsolePrinterUtility p = new ConsolePrinterUtility();
	StorageUtility daBank = new StorageUtility();
	Scanner input = new Scanner(System.in);
	public void createUserAccount()
	{
		p.printlnGreen(p.inABox("Thank you for opening an account with DollarsBank"));
		p.printlnWhite("Please enter your first name");
		String first = input.nextLine();
		p.printlnWhite("Please enter your last name");
		String last = input.nextLine();
		p.printlnWhite("Please enter your phone number");
		String phone = input.nextLine();
		p.printlnWhite("Please enter your address");
		String address = input.nextLine();
		p.printlnWhite("Please enter a secure password");
		String password = input.nextLine();
		Customer newCx = new Customer(daBank.getCxList().size(),first,last,phone,address,password);
		daBank.addCx(newCx);
		p.println("Your User Id number is " + daBank.getCx(newCx.getUserAccountNumber()).getUserAccountNumber());
	}
	
	public Customer login()
	{
		p.printlnGreen(p.inABox("Please Enter the following"));
		try
		{		
			p.printlnWhite("User ID number:");
			int userId = Integer.parseInt(input.nextLine());
			p.printlnWhite("Password:");
			String password = input.nextLine();
			Customer x = daBank.getCx(userId);
			if (x.getPassword().equals(password))
			{
				return x;
			}
			else
			{
				throw new UserNotFoundException("Invalid Password or user Id");
			}
		}
		catch (UserNotFoundException e)
		{
			p.error(e.getMessage());
		}
		catch (IndexOutOfBoundsException e)
		{
			p.error("No Users Found");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void createCheckingAccount(Customer in) throws TransactionNotPossibleException
	{
		p.printlnGreen(p.inABox("Inital Deposit amount"));
		Double depo = input.nextDouble();
		if (depo < 0)
		{
			throw new TransactionNotPossibleException("You cannot deposit negative funds");
		}
		CheckingAccount newCa = new CheckingAccount(daBank.getCaList().size(),in.getUserAccountNumber(),depo);
		daBank.addCaList(newCa);
		daBank.getCx(in.getUserAccountNumber()).setTransactons("Inital deposit of $" + depo + " in checking account " + newCa.getId());
	}

	public void createSavingsAccount(Customer in) throws TransactionNotPossibleException 
	{
		p.printlnGreen(p.inABox("Inital Deposit amount"));
		Double depo = input.nextDouble();
		if (depo < 0)
		{
			throw new TransactionNotPossibleException("You cannot deposit negative funds");
		}
		SavingsAccount newSa = new SavingsAccount(daBank.getSaList().size(),in.getUserAccountNumber(),depo);
		daBank.addSaList(newSa);
		daBank.getCx(in.getUserAccountNumber()).setTransactons("Inital deposit of $" + depo + " in savings account " + newSa.getId());
		
	}

	public void depositMoney(Customer in)
	{
		p.println("Savings account or Checking account?"
				+ "\n1. Checkings "
				+ "\n2. Savings");
		int choice = input.nextInt();//Integer.parseInt(input.nextLine());
		switch(choice)
		{
			case 1:
				p.println("Enter Account id");
				int caId = input.nextInt();//Integer.parseInt(input.nextLine());
				p.println("Enter Amount to deposit");
				double ammountToAdd = input.nextDouble();
				daBank.getCaList(caId).setAmount(ammountToAdd+daBank.getCaList(caId).getAmount());
				daBank.getCx(in.getUserAccountNumber()).setTransactons("Deposited of $" + ammountToAdd + " in checking account " + caId);
				break;
			case 2:
				p.println("Enter Account id");
				int saId = input.nextInt();//Integer.parseInt(input.nextLine());
				p.println("Enter Amount to deposit");
				double amountToAdd = input.nextInt();//input.nextDouble();
				daBank.getCaList(saId).setAmount(amountToAdd+daBank.getCaList(saId).getAmount());
				daBank.getCx(in.getUserAccountNumber()).setTransactons("Deposited of $" + amountToAdd + " in savings account " + saId);
				break;
			default:
				break;
		}
		
	}

	public void withdrawMoney(Customer in) 
	{
		p.println("Savings account or Checking account?"
				+ "\n1. Savings"
				+ "\n2. Checkings");
		int choice = Integer.parseInt(input.nextLine());
		switch(choice)
		{
			case 1:
				p.println("Enter Account id");
				int caId = input.nextInt();//Integer.parseInt(input.nextLine());
				p.println("Enter Amount to deposit");
				double ammountToWithdraw = input.nextDouble();
				daBank.getCaList(caId).setAmount(daBank.getCaList(caId).getAmount()-ammountToWithdraw);
				daBank.getCx(in.getUserAccountNumber()).setTransactons("Withdrew $" + ammountToWithdraw + " from checking account " + caId);
				break;
			case 2:
				p.println("Enter Account id");
				int saId = input.nextInt();//Integer.parseInt(input.nextLine());
				p.println("Enter Amount to deposit");
				double amountToWithdraw = input.nextDouble();
				daBank.getCaList(saId).setAmount(daBank.getCaList(saId).getAmount()-amountToWithdraw);
				daBank.getCx(in.getUserAccountNumber()).setTransactons("Withdrew of $" + amountToWithdraw + " from savings account " + saId);
				break;
			default:
				break;
		}
		
	}

	public void transferMoney(Customer in) 
	{
		
		
	}

	public void getCxInfo(Customer in) 
	{
		p.println("\nAccount Number: " + in.getUserAccountNumber()
				 +"\nFirst Name: " + in.getFirstName()
				 +"\nLast Name: " + in.getLastName()
				 +"\nAddress: " + in.getAddress()
				 +"\nPhone: " + in.getPhone());
	}

	public void getLastTransactions(Customer in) 
	{
		p.println(p.inABox("Last 5 Transactions"));
		for (int i = 0; i < in.getLastTransactons().length;i++)
		{
			p.println((i+1) + ". " + in.getLastTransactons()[i]);
		}
		
	}
	

}
