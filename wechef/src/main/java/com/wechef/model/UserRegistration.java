package com.wechef.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import groovy.transform.ToString;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ToString

@Document(collection = "user_registration")
public class UserRegistration {

	@Id
	private int userId;

	private String username;

	private String password;

	private String phoneNumber;

	private String emailAddress;

}
