package com.cg.OFS.Exception;

@SuppressWarnings("serial")
public class UserAlreadyExistsException extends RuntimeException{
	
	public UserAlreadyExistsException(String msg) {
		super(msg);
	}
	
}
