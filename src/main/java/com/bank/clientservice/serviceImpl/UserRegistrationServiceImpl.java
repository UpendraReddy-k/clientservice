package com.bank.clientservice.serviceImpl;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.clientservice.dao.UserRegistrationDao;
import com.bank.clientservice.model.UserRegistration;

@Service
public class UserRegistrationServiceImpl {
	@Autowired
	UserRegistrationDao userregistrationDao;

	public void save(UserRegistration userRegistration) throws NullPointerException  {
		
		
		try {

		if (Objects.nonNull(userRegistration) && Objects.nonNull(userRegistration.getUseraddr())
				&& Objects.nonNull(userRegistration.getBankType())) {
			userregistrationDao.save(userRegistration);
		} else {
			System.out.println("User data in service  " + userRegistration.getId() + " " + userRegistration.getFname()
					+ " " + userRegistration.getLname() + " " + userRegistration.getSurname() + " "
					+ userRegistration.getPan_no() + " " + userRegistration.getAadhar_no() + " "
					+ userRegistration.getUseraddr() + " " + userRegistration.getBankType());
		}
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
		}
	}
}
