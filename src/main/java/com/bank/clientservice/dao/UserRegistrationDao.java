package com.bank.clientservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.clientservice.model.UserRegistration;


@Repository
public interface UserRegistrationDao extends CrudRepository<UserRegistration, Long> {

}
