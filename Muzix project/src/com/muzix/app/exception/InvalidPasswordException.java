package com.muzix.app.exception;

public class InvalidPasswordException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public InvalidPasswordException()
	{
		
	}
	public InvalidPasswordException(String message)
	{
		super(message);
	}

}
