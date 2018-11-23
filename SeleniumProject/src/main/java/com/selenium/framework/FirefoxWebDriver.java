package com.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebDriver implements Driver {

    @Override
    public WebDriver driver() {
        System.out.println("Running in Firefox");
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        return new FirefoxDriver();
    }
}
