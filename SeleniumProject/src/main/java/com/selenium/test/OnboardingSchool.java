package com.selenium.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.framework.DriverFactory;
import com.selenium.framework.Elements;

public class OnboardingSchool {

	public static void clickOnOnboardingSchool() {

		// Click on Onboarding-School tab.
		Elements.onboardingSchoolTab().click();
		Elements.onboardingSchool().click();
	}

	public static void verifyOnboardingSchoolDashboard() {

		// Verify Onboarding-'Total Active Schools' text and numbers.
		assertEquals("Total Active Schools", Elements.onboardingTotalActiveSchools().getText());
		// Verify Onboarding-'Total In-Active Schools' text and numbers.
		assertEquals("Total In-Active Schools", Elements.onboardingTotalInActiveSchools().getText());
		// Verify Onboarding-'No of schools program running' text and numbers.
		assertEquals("No of schools program running", Elements.onboardingNoOfSchoolsProgramRunning().getText());
		System.out.println("Executed No of schools program running text.");
		// Verify Onboarding-'No of schools program Yet start' text and numbers.
		assertEquals("No of schools program Yet start", Elements.onboardingNoOfSchoolsProgramYetStart().getText());
		System.out.println("Executed No of schools program Yet start text.");

	}

	public static void ClickOnUploadXLSXFile() {

		DriverFactory.wait(60);
		// Click on UploadXLSX File.
		Elements.uploadXLSXFileButton().click();
	}

	public static void ClickOnUploadButton() throws IOException {
		Elements.uploadButton().click();
		// Get File upload from AutoIT.
		Runtime.getRuntime().exec("C:\\Users\\aduser\\Desktop\\AutoIt\\Fileupload.exe"+" "+"C:\\Users\\aduser\\Downloads\\chaitanya school data (24).xlsx");

		/*
		 * if (uploadWindow.winWaitActive("File Upload", "", 5)) { if
		 * (uploadWindow.winExists("File Upload")) { uploadWindow.sleep(100);
		 * uploadWindow.send(filepath); uploadWindow.controlClick("File Upload", "",
		 * "&Open");
		 */

	}

}
