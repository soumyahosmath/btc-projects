package com.muzix.app.exception;

public class DuplicateDataException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DuplicateDataException() 
	{
			
		
	}
		
		public DuplicateDataException(String message) 
		{
			super(message);
	}

}
