package com.dollarsBank.exceptions;

public class TranscationNotPossibleException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public TranscationNotPossibleException()
	{
		super();
	}

	public TranscationNotPossibleException(String e)
	{
		super(e);
	}
}
