package com.bank.clientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.clientservice.exceptions.CustomException;
import com.bank.clientservice.model.UserRegistration;
import com.bank.clientservice.serviceImpl.UserRegistrationServiceImpl;
import com.bank.clientservice.utils.ApplicationUtils;

@RestController
@RequestMapping(value = "/userregistration")
public class UserRegistrationController {

	@Autowired
	private UserRegistrationServiceImpl userRegistrationServiceImpl;

	@RequestMapping(value="/user")
	@PostMapping
	public @ResponseBody ResponseEntity<UserRegistration> save(@RequestBody UserRegistration userRegistration) throws CustomException {
		/*
		 * System.out.println("user data in controller "+userRegistration.getId() + " "
		 * + userRegistration.getFname() + " " + userRegistration.getLname() + " " +
		 * userRegistration.getSurname() + " " + userRegistration.getPan_no() + " " +
		 * userRegistration.getAadhar_no()+" " + userRegistration.getUseraddr()+" "+
		 * userRegistration.getBankType());
		 */
		UserRegistration result=userRegistrationServiceImpl.save(userRegistration);
		return new ResponseEntity<UserRegistration>(result, HttpStatus.CREATED);

	}

}
