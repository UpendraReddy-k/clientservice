package com.bank.clientservice.model;

public class UserError {

	private int errorCode;
	private String errorMessage;
	
	public UserError() {
	}

	public UserError(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
}
