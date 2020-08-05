package com.bank.clientservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bank.clientservice.exceptions.CustomException;
import com.bank.clientservice.model.UserError;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<UserError> mappedException(CustomException ex)
	{
		UserError error=new UserError(HttpStatus.INTERNAL_SERVER_ERROR.value(),ex.getMessage());
		return new ResponseEntity<UserError>(error,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
