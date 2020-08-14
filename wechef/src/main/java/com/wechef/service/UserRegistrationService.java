package com.wechef.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wechef.model.UserRegistration;

@Service
public interface UserRegistrationService {

	public void saveOrUpdateUser(UserRegistration userRegistration);

	public Optional<UserRegistration> findById(int id);

	/*
	 * * public void deleteUser(int useriD);
	 * 
	 * 
	 * public List<UserRegistration> findAll();
	 **/
}
