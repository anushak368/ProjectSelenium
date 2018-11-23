package com.selenium.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selectors {

	private static WebDriver webDriver = DriverFactory.getDriver();

	public static void open(String url) {
		webDriver.get(url);
	}

	public static By userNameElement() {
		return By.xpath("//input[@type='text'][@placeholder='Username/ Email']");
	}

	public static By loginButtonElement() {
		return By.xpath("//button[text()='Login']");
	}

	public static String loggedInUserName() {
		return Elements.find(By.xpath("//span[text()='Welcome firstName']")).getText();
	}

	public static String loginFailedValidationMessage() {
		return Elements.find(By.xpath("//span[text()='Login failed- Username/Password is Invalid.']")).getText();
	}

	public static By passwordElement() {
		return By.xpath("//input[@type='password'][@placeholder='Password']");
	}

	public static By logoutOptionElement() {
		return By.xpath("//span[@class='glyphicon glyphicon-triangle-bottom']");
	}

	public static By logoutButtonElement() {
		return By.xpath("//a[text()='Logout']");
	}

	public static By dashboardTextElement() {
		return By.xpath("//strong[text()='Dashboard']");
	}

	public static By dashboardTotalSchoolsTextElement() {
		return By.xpath("//strong[text()='Total Schools']");

	}

	public static By dashboardTotalCoordinatorsTextElement() {
		return By.xpath("//text()[.='Total Coordinators']/ancestor::div[1]");
	}
	
	public static By dashboardTotalStudentsTextElement() {
		return By.xpath("//strong[text()='Total Students']");
		
	}
	
	public static By dashboardTotalTeachersTextElement() {
		return By.xpath("//strong[text()='Total Teachers']");
		
	}
	
	public static By dashboardTotalAssessmentsTextElement() {
		return By.xpath("//strong[text()='Total Assessments']");
		
	}
	public static By dashboardTotalReportsGeneratedTextElement() {
		return By.xpath("//strong[text()='Total Reports Generated']");
		
	}
	
	public static By dashboardTotalCareNGrowUsersTextElement() {
		return By.xpath("//strong[text()='Total Care N Grow Users']");
		
	}
	
	public static By dashboardTotalTabletsTextElement() {
		return By.xpath("//strong[text()='Total Tablets']");
		
	}
	
	public static By onboardingSchoolTabElement() {
		return By.xpath("//strong[text()='Onboarding']");
	}
	
	public static By onboardingSchoolElement() {
		return By.xpath("//li[text()='School']");
	}
	
	public static By onboardingTotalActiveSchoolsElement() {
		return By.xpath("//div[text()='Total Active Schools']");
	}
	
	public static By onboardingTotalInActiveSchoolsElement() {
		return By.xpath("//div[text()='Total In-Active Schools']");
	}
	
	public static By onboardingNoOfSchoolsProgramRunningElement() {
		return By.xpath("//div[text()='No of schools program running']");
	}
	
	public static By onboardingNoOfSchoolsProgramYetStart() {
		return By.xpath("//div[text()='No of schools program Yet start']");
	}
	
	public static By uploadXLSXFileButtonElement() {
		return By.xpath("//button[text()='Upload XLSX File']");
	}
	
	public static By popupTitleOfUploadXLSXFileTextElement() {
		return By.xpath("//h4[contains(text(),'Upload XLSX File')]");
	}
	
	public static By uploadButtonElement() {
		return By.className("input-group-addon fileUpload upload-btn-mainDiv");
	}
	
	public static By OnboardingSchoolSearchElement() {
		return By.className("//input[@type='text'][@placeholder='Search for']");
	}
}
