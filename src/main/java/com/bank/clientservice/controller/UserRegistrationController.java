package com.bank.clientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.clientservice.model.UserRegistration;
import com.bank.clientservice.serviceImpl.UserRegistrationServiceImpl;

@RestController
@RequestMapping(value = "/userregistration")
public class UserRegistrationController {

	@Autowired
	private UserRegistrationServiceImpl userRegistrationServiceImpl;

	@RequestMapping
	@PostMapping
	public ResponseEntity<String> save(@RequestBody UserRegistration userRegistration) {
		System.out.println("user data in controller "+userRegistration.getId() + " " + userRegistration.getFname() + " "
				+ userRegistration.getLname() + " " + userRegistration.getSurname() + " "
				+ userRegistration.getPan_no() + " " + userRegistration.getAadhar_no()+" "
				+ userRegistration.getUseraddr()+" "+ userRegistration.getBankType());

		userRegistrationServiceImpl.save(userRegistration);
		return new ResponseEntity<String>("inserted Successfully", HttpStatus.CREATED);

	}

}
