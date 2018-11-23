package com.selenium.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.selenium.framework.DriverFactory;
import com.selenium.framework.Elements;
import com.selenium.framework.Selectors;

public class Login {

	private static void openCareNGrowSite() {
		String appUrl = "https://launch.synverglobal.com/login";
		Selectors.open(appUrl);
	}

	@Test(priority = 1)
	public static void invalidLogin() {
		openCareNGrowSite();
		Elements.userName().sendKeys("admin1@carengrow.com");
		Elements.password().sendKeys("qwerty");
		Elements.loginButton().click();
		DriverFactory.wait(30);
		Elements.userName().clear();
		Elements.password().clear();
	}

	@Test(priority = 2)
	public static void login() {
		openCareNGrowSite();
		// compare the expected title of the page with the actual title of the page and
		assertEquals("Carengrow", DriverFactory.driver.getTitle());
		Elements.userName().sendKeys("admin@carengrow.com");
		Elements.password().sendKeys("qwerty");
		Elements.loginButton().click();
		DriverFactory.wait(30);
	}

}
