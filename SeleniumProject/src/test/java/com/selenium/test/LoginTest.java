package com.selenium.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.selenium.framework.Selectors;

public class LoginTest {

	@Test
	public void verfiyLoginFailure() {
		Login.invalidLogin();
		assertEquals("Login failed- Username/Password is Invalid.", Selectors.loginFailedValidationMessage());
	}

	@Test
	public void verfiyLoginSuccess() {
		Login.login();
		assertEquals("Welcome firstName", Selectors.loggedInUserName());

	}

}
