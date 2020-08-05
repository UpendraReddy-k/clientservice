package com.bank.clientservice.services;

import com.bank.clientservice.exceptions.CustomException;
import com.bank.clientservice.model.UserRegistration;

public interface UserRegistrationService {

	public UserRegistration save(UserRegistration userregistration) throws CustomException;
}
