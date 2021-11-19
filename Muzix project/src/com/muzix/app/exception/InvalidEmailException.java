package com.muzix.app.exception;

public class InvalidEmailException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public InvalidEmailException() {
			
		}
		
		public InvalidEmailException(String message) {
			super(message);
		}
}
