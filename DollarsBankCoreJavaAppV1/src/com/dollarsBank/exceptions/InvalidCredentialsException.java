package com.dollarsBank.exceptions;

public class InvalidCredentialsException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public InvalidCredentialsException()
	{
		super();
	}

	public InvalidCredentialsException(String e)
	{
		super(e);
	}
}
