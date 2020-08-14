package com.wechef.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wechef.model.UserRegistration;
import com.wechef.service.UserRegistrationService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRegistrationService service;

	/**
	 * @param user
	 * @return
	 */
	@PostMapping(path = "/saveUser")
	public ResponseEntity<?> save(@RequestBody UserRegistration user) {
		service.saveOrUpdateUser(user);
		return new ResponseEntity("User created successfully with id", HttpStatus.OK);
	}

	@GetMapping(value = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<UserRegistration> retrieveByUserId(@PathVariable("userId") int userId) {
		return service.findById(userId);
	}
	/*
	 * @GetMapping(value = "/findAllUsers", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public List<UserRegistration>
	 * findAllUsers() { return service.findAll(); }
	 * 
	 * @DeleteMapping("/delete/{userId}") public void delete(@PathVariable("userId")
	 * int userId) { service.deleteById(userId); }
	 */

}
