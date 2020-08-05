package com.bank.clientservice.serviceImpl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.clientservice.dao.UserRegistrationDao;
import com.bank.clientservice.exceptions.CustomException;
import com.bank.clientservice.model.UserRegistration;
import com.bank.clientservice.services.UserRegistrationService;
import com.bank.clientservice.utils.ApplicationUtils;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
	@Autowired
	UserRegistrationDao userregistrationDao;

	public UserRegistration save(UserRegistration userRegistration) throws CustomException {
		UserRegistration result = null;
			if (Objects.nonNull(userRegistration) && Objects.nonNull(userRegistration.getUseraddr())
					&& Objects.nonNull(userRegistration.getBankType())) {
				try {
					 result=userregistrationDao.save(userRegistration);
				}
				catch(Exception e)
				{
					throw new CustomException(ApplicationUtils.CUSTOM_EXCEPTION);
				}
			
		}
			return result;
	}
}
