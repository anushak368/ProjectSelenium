package com.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWebDriver implements Driver {

    @Override
    public WebDriver driver() {
    	System.out.println("Running in Chrome");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        options.addArguments("--no-sandbox");
        return new ChromeDriver(options);
    }
    
}
