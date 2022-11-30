package com.dollarsBank.application;
import java.util.Scanner;
import com.dollarsBank.controller.DollarsBankController;
import com.dollarsBank.model.Customer;
import com.dollarsBank.util.ConsolePrinterUtility;

public class DollarsBankDriver 
{
	
	public static void main(String args[])
	{
		ConsolePrinterUtility p = new ConsolePrinterUtility();
		DollarsBankController toRun = new DollarsBankController();
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		p.printlnYellow(p.inABox("Welcome to the Dollars Bank"));
		boolean active = true;
		
		while (active == true)
		{
			p.printlnWhite("\n1. Create a New User Account"
						  +"\n2. Login"
						  +"\n0. Exit"
						  + "\nPlease enter the number for the action you'd like to do");
			
			boolean selecting = true;
			int attmepts = 0; 
			int cxChoice = -1;
			for(;attmepts < 3 && selecting == true; attmepts++)
			{
				try
				{
					cxChoice = Integer.parseInt(input.nextLine());
					
					if(cxChoice != 0 
					&& cxChoice !=  1 
					&& cxChoice != 2)
					{
						throw new NumberFormatException();
					}
					selecting = false;
				}
				catch(NumberFormatException e)
				{
					p.printlnRed("\n+--That is not a valid choice--+\n");
					
					p.printlnWhite("\n1. Create a New Account"
								  +"\n2. Login"
								  +"\n0. Exit"
								  + "\nPlease enter choice");
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
				switch (cxChoice)
				{
					case 1:
						
						toRun.createUserAccount();
						break;
					case 2:
						boolean loggedIn = true;
						Customer in = toRun.login();
						while(loggedIn == true)
						{
							if (in != null)
							{
								p.printlnWhite("\n1. Open a New checking Account"
										      +"\n2. Open a New Savings Account"
									      	  +"\n3. Deposit"
									      	  +"\n4. Withdraw"
									      	  +"\n5. Funds Transfer"
									      	  +"\n6. Display your information"
									      	  +"\n7. Display most Recent Transactions"
										      +"\n0. Sign out"
										     + "\nPlease enter choice");
								int cxSecondChoice = Integer.parseInt(input.nextLine());
								try
								{
									switch (cxSecondChoice)
									{
										case 1:
											toRun.createCheckingAccount(in);
											break;
										case 2:
											toRun.createSavingsAccount(in);
											break;
										case 3:
											toRun.depositMoney(in);
											break;
										case 4:
											toRun.withdrawMoney(in);
											break;
										case 5:
											toRun.transferMoney(in);
											break;
										case 6:
											toRun.getCxInfo(in);
											break;
										case 7:
											toRun.getLastTransactions(in);
											break;	
										case 0:
											p.printlnYellow(p.inABox("Returning to main menu"));
											loggedIn = false;
											break;
										default:
											break;
									}	
									
							}
							catch(Exception E)
							{
									
							}
						}
					}		
						break;
					case 0:
						p.printlnYellow(p.inABox("Thank you for using Dollar Bank services."));
						System.exit(0);
						break;
					default:
						break;
				}
			
		}
	input.close();	
	}
}
