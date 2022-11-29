package com.dollarsBank.util;

public class ConsolePrinterUtility {

	ColorsUtility c = new ColorsUtility();
	
	public void println(String toPrint)
	{
		System.out.println(toPrint);
	}
	
	public void printlnWhite(String toPrint)
	{
		System.out.println(c.white(toPrint));
	}
	
	public void printlnBlack(String toPrint)
	{
		System.out.println(c.black(toPrint));
	}
	
	public void printlnRed(String toPrint)
	{
		System.out.println(c.red(toPrint));
	}
	public void printlnGreen(String toPrint)
	{
		System.out.println(c.green(toPrint));
	}
	public void printlnYellow(String toPrint)
	{
		System.out.println(c.yellow(toPrint));
	}
	public void printlnBlue(String toPrint)
	{
		System.out.println(c.blue(toPrint));
	}
	public void printlnPurple(String toPrint)
	{
		System.out.println(c.purple(toPrint));
	}
	public void printlnCyan(String toPrint)
	{
		System.out.println(c.cyan(toPrint));
	}

	
}
