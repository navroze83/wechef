package com.wechef.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wechef.model.UserRegistration;
import com.wechef.repository.UserRegistrationRepository;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
	@Autowired
	private UserRegistrationRepository userRegistrationRepository;

	@Autowired
	public UserRegistrationServiceImpl(UserRegistrationRepository userRegistrationRepository) {
		this.userRegistrationRepository = userRegistrationRepository;
	}
	/*
	 * @Override public void deleteUser(int userId) {
	 * userRegistrationRepository.deleteUser(userId); }
	 * 
	 * @Override public List<UserRegistration> findAll() { return
	 * userRegistrationRepository.findAll(); }
	 * 
	 * @Override public List<UserRegistration> findById(int id) { return
	 * userRegistrationRepository.findByUser(id); }
	 **/

	@Override
	public void saveOrUpdateUser(UserRegistration user) {
		userRegistrationRepository.save(user);

	}

	@Override
	public Optional<UserRegistration> findById(int id) {
		return userRegistrationRepository.findById(id);
	}

}
