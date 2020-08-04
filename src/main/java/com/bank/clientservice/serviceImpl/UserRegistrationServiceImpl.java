package com.bank.clientservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.clientservice.dao.UserRegistrationDao;
import com.bank.clientservice.model.UserRegistration;

@Service
public class UserRegistrationServiceImpl {
	@Autowired
	UserRegistrationDao userregistrationDao;

	public void save(UserRegistration userRegistration) {
		try {
			if ((userRegistration != null) && (userRegistration.getBankType().getId() != null)
					&& userRegistration.getUseraddr().getId() != null) {
				userregistrationDao.save(userRegistration);
			}
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception");
		} finally {

			System.out.println("User data in service  "+userRegistration.getId() + " " + userRegistration.getFname() + " "
					+ userRegistration.getLname() + " " + userRegistration.getSurname() + " "
					+ userRegistration.getPan_no() + " " + userRegistration.getAadhar_no() + " "
					+ userRegistration.getUseraddr() + " " + userRegistration.getBankType());

		}
	}
}
