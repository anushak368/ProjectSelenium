package com.selenium.framework;

import org.openqa.selenium.WebDriver;

import static com.selenium.framework.DriverFactory.Browser.valueOf;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public enum Browser {
        Chrome, Firefox, IE
    }

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = getWebDriver();
        }
        return driver;
    }

    public static void wait(int seconds) {
		getDriver().manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);    	
    }
    
    private static WebDriver getWebDriver() {
        String browser = "Chrome";
        //String browser = "Firefox";
        Driver driver;
        switch (valueOf(browser)) {
            case Chrome:
                driver = new ChromeWebDriver();
                break;
            case Firefox:
                driver = new FirefoxWebDriver();
                break;
            case IE:
                driver = new IEWebDriver();
                break;
            default:
                driver = new ChromeWebDriver();
                break;
        }
        if (driver == null) {
            throw new IllegalArgumentException("Invalid browser");
        }
        return driver.driver();
    }
}
