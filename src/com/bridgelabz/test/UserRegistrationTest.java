package com.bridgelabz.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.program.UserRegistration;

public class UserRegistrationTest {
	UserRegistration userRegistration;

	public void setUp() {
		userRegistration = new UserRegistration();
	}

	// testCases for first name

	@Test
	public void givenName_WhenFirstNameValid_ShouldReturnTrue() {

		boolean actual = userRegistration.validateFirstName("Anil");
		Assert.assertTrue(actual);
	}

	// test-Cases for Last Name

	@Test
	public void givenName_WhenLastNameValid_ShouldReturnTrue() {

		boolean actual = userRegistration.validateLastName("Bali");
		Assert.assertTrue(actual);
	}

	// test-Cases for Email
	@Test
	public void givenEmail_WhenEmailValid_ShouldReturnTrue() {

		boolean actual = userRegistration.validateEmail("bali39959@gmail.com");
		Assert.assertTrue(actual);

	}

	// Test-Cases for PhoneNumber

	@Test
	public void givenPhoneNumber_WhenPhoneNumberValid_ShouldReturnTrue() {

		boolean actual = userRegistration.validatePhoneNumber("91 8217451010");
		Assert.assertTrue(actual);

	}

	// Check Password

	@Test
	public void givenpassword_WhenPassword_is_Valid_ShouldReturnTrue() {
		boolean actual = userRegistration.validatePassWord("Anil@2727");
		Assert.assertTrue(actual);
	}

}