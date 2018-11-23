package com.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEWebDriver implements Driver {

    @Override
    public WebDriver driver() {
        System.out.println("Running in IE");
        return new InternetExplorerDriver();
    }
}
