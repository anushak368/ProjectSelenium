package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.selenium.framework.DriverFactory;

import static org.testng.Assert.assertEquals;

public class LogoutTest {

	private WebDriver driver = DriverFactory.getDriver();

	@Test
	public void verifyLogoutSuccess() {
		// compare the expected title of the page with the actual title of the page and
		assertEquals("Carengrow", driver.getTitle());
		// Login the user and press logout button
		Logout.SuccessLogout();
		assertEquals("Carengrow", driver.getTitle());

	}

}
