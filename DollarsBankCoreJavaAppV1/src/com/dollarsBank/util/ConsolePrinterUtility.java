package com.dollarsBank.util;

public class ConsolePrinterUtility {

	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public void println(String toPrint)
	{
		System.out.println(ANSI_YELLOW + toPrint + ANSI_RESET);
	}
}
