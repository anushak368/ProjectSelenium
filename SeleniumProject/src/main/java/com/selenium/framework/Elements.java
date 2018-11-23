package com.selenium.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
	public static WebDriver webDriver = DriverFactory.getDriver();

	public static WebElement userName() {
		return find(Selectors.userNameElement());
	}

	public static WebElement password() {
		return find(Selectors.passwordElement());
	}

	public static WebElement loginButton() {
		return find(Selectors.loginButtonElement());
	}

	public static WebElement find(By xPathExpression) {
		return webDriver.findElement(xPathExpression);
	}

	public static WebElement logoutOption() {
		return find(Selectors.logoutOptionElement());
	}

	public static WebElement logoutButton() {
		return find(Selectors.logoutButtonElement());
	}

	public static WebElement dashboardText() {
		return find(Selectors.dashboardTextElement());
	}

	public static WebElement dashboardTotalSchoolsText() {
		return find(Selectors.dashboardTotalSchoolsTextElement());
	}

	public static WebElement dashboardTotalCoordinatorsText() {
		return find(Selectors.dashboardTotalCoordinatorsTextElement());
	}

	public static WebElement dashboardTotalStudentsText() {
		return find(Selectors.dashboardTotalStudentsTextElement());
	}

	public static WebElement dashboardTotalTeachersText() {
		return find(Selectors.dashboardTotalTeachersTextElement());
	}

	public static WebElement dashboardTotalAssessmentsText() {
		return find(Selectors.dashboardTotalAssessmentsTextElement());
	}

	public static WebElement dashboardTotalReportsGeneratedText() {
		return find(Selectors.dashboardTotalReportsGeneratedTextElement());
	}

	public static WebElement dashboardTotalCareNGrowUsersText() {
		return find(Selectors.dashboardTotalCareNGrowUsersTextElement());
	}

	public static WebElement dashboardTotalTabletsText() {
		return find(Selectors.dashboardTotalTabletsTextElement());
	}

	public static WebElement onboardingSchoolTab() {
		return find(Selectors.onboardingSchoolTabElement());
	}

	public static WebElement onboardingSchool() {
		return find(Selectors.onboardingSchoolElement());
	}
	
	public static WebElement onboardingTotalActiveSchools() {
		return find(Selectors.onboardingTotalActiveSchoolsElement());
	}
	
	public static WebElement onboardingTotalInActiveSchools() {
		return find(Selectors.onboardingTotalInActiveSchoolsElement());
	}
	
	public static WebElement onboardingNoOfSchoolsProgramRunning() {
		return find(Selectors.onboardingNoOfSchoolsProgramRunningElement());
	}	
	
	public static WebElement onboardingNoOfSchoolsProgramYetStart() {
		return find(Selectors.onboardingNoOfSchoolsProgramYetStart());
	}	
	
	public static WebElement uploadXLSXFileButton() {
		return find(Selectors.uploadXLSXFileButtonElement());
	}
	
	public static WebElement popupTitleOfUploadXLSXFileText() {
		return find(Selectors.popupTitleOfUploadXLSXFileTextElement());
	}
	
	public static WebElement uploadButton() {
		return find(Selectors.uploadButtonElement());
	}
	
	public static WebElement OnboardingSchoolSearch() {
		return find(Selectors.OnboardingSchoolSearchElement());
	}
	
}
