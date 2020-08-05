package com.bank.clientservice.exceptions;

public class CustomException extends Exception {

	private static final long serialVersionUID = 530323306948574511L;

	public CustomException(String message) {
		super(message);
	}
}
