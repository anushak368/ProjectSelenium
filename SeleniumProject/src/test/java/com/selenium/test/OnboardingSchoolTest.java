package com.selenium.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;
import com.selenium.framework.DriverFactory;
import com.selenium.framework.Elements;

public class OnboardingSchoolTest {

	@Test(priority = 1)
	public void verifyToClickOnOnboardingSchool() {
		// Login with valid user credentials
		Login.login();
		// Verify Dashboard title text.
		assertEquals("Dashboard", Elements.dashboardText().getText());
		DriverFactory.wait(30);
		// Click on Onboarding-School tab.
		OnboardingSchool.clickOnOnboardingSchool();
		// Verify Onboarding-School dashboard.
		OnboardingSchool.verifyOnboardingSchoolDashboard();

	}

	@Test(priority = 3)
	public void verifyOnboardingSchoolSearchFunctionality() {
		//Click on Search.
		Elements.OnboardingSchoolSearch().sendKeys("pragathi");
		
		
	}
		
	@Test(priority = 3)
	public void verifyClickingOfUploadXLSXFile() throws IOException {

		// Click on UploadXLSX File.
		OnboardingSchool.ClickOnUploadXLSXFile();
		// Verify title of the upload pop up.
		assertEquals("gfgdf", Elements.popupTitleOfUploadXLSXFileText().getText());
		System.out.println("Executed Upload XLSX File title of the pop up");
		DriverFactory.wait(120);
		
		//Click on upload button from upload XLSX pop up.
		OnboardingSchool.ClickOnUploadButton();
		
	}
	
	

}