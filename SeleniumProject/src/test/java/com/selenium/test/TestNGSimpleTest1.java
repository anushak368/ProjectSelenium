package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.framework.DriverFactory;

public class TestNGSimpleTest1 {

    @BeforeClass
    public void setup() {
        System.out.println("I am in Setup");
    }

    @Test
    public void testAdd() {
        WebDriver webDriver = DriverFactory.getDriver();
        webDriver.manage().timeouts().pageLoadTimeout(190, TimeUnit.SECONDS);
        webDriver.get("http://www.google.com");
        webDriver.findElement(By.name("q")).sendKeys("selenium webdriver");
        webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        System.out.println("Page title is - " + webDriver.getTitle());
        webDriver.close();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("I am in tearDown");
    }
}
