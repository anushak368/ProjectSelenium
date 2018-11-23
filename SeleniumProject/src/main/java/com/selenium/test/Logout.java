package com.selenium.test;

import static org.testng.Assert.assertEquals;
import com.selenium.framework.Elements;
import com.selenium.framework.Selectors;

public class Logout {

	public static void SuccessLogout() {

		Login.login();
		assertEquals("Welcome firstName", Selectors.loggedInUserName());
		// Click on the Logout button.
		Elements.logoutOption().click();
		Elements.logoutButton().click();

	}
}