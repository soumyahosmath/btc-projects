package com.muzix.app.exception;

public class InvalidSongIdException extends RuntimeException{
	public InvalidSongIdException()
	{
		
	}

	public InvalidSongIdException(String message) 
	{
		super(message);
}

}
