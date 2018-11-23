package com.selenium.framework;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {

    @Override
    public void onStart(ITestContext testContext) {
        super.onStart(testContext);
        System.out.println("******************* started");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("** in onTestFailure method");
        String methodName = result.getName().trim();
        takeScreenShot(methodName);
    }

    public void takeScreenShot(String methodName) {
        String filePath = "D:\\SeleniumProject\\Temp\\";
        File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File(filePath + methodName + ".png"));
            System.out.println("***Placed screen shot in " + filePath + " ***");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
