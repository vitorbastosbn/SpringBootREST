package com.spring.boot.rest.exception;

public class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3162972942619218614L;

	public BusinessException(String message) {
        super(message);
    }
	
}
