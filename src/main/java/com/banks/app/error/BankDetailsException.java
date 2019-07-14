package com.banks.app.error;

public class BankDetailsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2705433195878423415L;

	public BankDetailsException(String param) {
		super("The value sent for parameter '"+param+"' is not valid");
		// TODO Auto-generated constructor stub
	}

	
}
