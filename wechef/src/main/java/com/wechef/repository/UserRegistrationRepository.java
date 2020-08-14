package com.wechef.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wechef.model.UserRegistration;

public interface UserRegistrationRepository extends MongoRepository<UserRegistration, Integer> {

	// public void save(UserRegistration userRegistration);
	/**
	 * public void deleteUser(int userId);
	 * 
	 * List<UserRegistration> findAll();
	 * 
	 * List<UserRegistration> findByUser(int userId);
	 */

}
