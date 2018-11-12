package com.selenium.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSampleApplication {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");

        System.setProperty("webdriver.chrome.driver", "/home/pmrushi/sw/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("http://www.google.com");
        webDriver.findElement(By.name("q")).sendKeys("selenium webdriver");
        webDriver.findElement(By.name("     q")).sendKeys(Keys.ENTER);

        System.out.println("Page title is - " + webDriver.getTitle());

        System.out.println("This is test **********************");
    }

}
