package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.framework.DriverFactory;

import static org.testng.Assert.assertEquals;

public class Login {

	private WebDriver driver = DriverFactory.getDriver();

	@BeforeClass
	public void setup() {
		driver.manage().timeouts().pageLoadTimeout(190, TimeUnit.SECONDS);
		String appUrl = "https://launch.synverglobal.com/login";
		driver.get(appUrl);
		// maximize the browser window
		driver.manage().window().maximize();
	}

	@Test
	public void verfiyLoginFailure() {
		// compare the expected title of the page with the actual title of the page and
		assertEquals("Carengrow", driver.getTitle());
		// enter a valid username in the email textbox
		WebElement username = driver.findElement(By.xpath("//input[@type='text'][@placeholder='Username/ Email']"));
		username.sendKeys("admin@synver.com");
		// enter a valid password in the password textbox
		WebElement password = driver.findElement(By.xpath("//input[@type='password'][@placeholder='Password']"));
		password.sendKeys("qwerty");
		// click on the Sign in button
		WebElement SignInButton = driver.findElement(By.xpath("//button[text()='Login']"));
		SignInButton.click();
		username.clear();
		password.clear();
		assertEquals("Login failed- Username/Password is Invalid.", driver.findElement(By.xpath("//span[text()='Login failed- Username/Password is Invalid.']")).getText());
	}

	@Test
	public void verfiyLoginSuccess() {
		// compare the expected title of the page with the actual title of the page and
		assertEquals("Carengrow", driver.getTitle());
		// enter a valid username in the email textbox
		WebElement username1 = driver.findElement(By.xpath("//input[@type='text'][@placeholder='Username/ Email']"));
		System.out.println("Able to choose the usename field" + username1.getSize());
		//username1.clear();
		username1.sendKeys("admin@carengrow.com");
		// enter a valid password in the password textbox
		WebElement password = driver.findElement(By.xpath("//input[@type='password'][@placeholder='Password']"));
		//password.clear();
		password.sendKeys("qwerty");
		// click on the Sign in button
		WebElement SignInButton = driver.findElement(By.xpath("//button[text()='Login']"));
		SignInButton.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		assertEquals("Welcome firstName", driver.findElement(By.xpath("//span[text()='Welcome firstName']")).getText());

	}

	@AfterClass
	public void tearDown() {
		// close the web browser
		System.out.println("Test script executed successfully.");
		driver.close();
	}
}
