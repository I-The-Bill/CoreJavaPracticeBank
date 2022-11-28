package com.dollarsBank.exceptions;

public class UserNotFoundException extends Exception
{
	private static final long serialVersionUID = 2L;
	
	public UserNotFoundException()
	{
		super();
	}

	public UserNotFoundException(String e)
	{
		super(e);
	}
}

