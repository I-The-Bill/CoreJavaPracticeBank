package com.dollarsBank.exceptions;

public class TransactionNotPossibleException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public TransactionNotPossibleException()
	{
		super();
	}

	public TransactionNotPossibleException(String e)
	{
		super(e);
	}
}
