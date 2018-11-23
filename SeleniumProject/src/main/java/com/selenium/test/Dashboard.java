package com.selenium.test;

import static org.testng.Assert.assertEquals;
import com.selenium.framework.Elements;
import com.selenium.framework.Selectors;

public class Dashboard {

	public static void dashboard() {
		Login.login();
		assertEquals("Welcome firstName", Selectors.loggedInUserName());
		// Verify Dashboard title text.
		assertEquals("Dashboard", Elements.dashboardText().getText());
		// Verify Dashboard-Total Schools text and numbers.
		assertEquals("Total Schools", Elements.dashboardTotalSchoolsText().getText());
		// Verify Dashboard-Total Coordinators text and numbers.
		assertEquals("Total Coordinators", Elements.dashboardTotalCoordinatorsText().getText());
		// Verify Dashboard-Total Students text and numbers.
		assertEquals("Total Students", Elements.dashboardTotalStudentsText().getText());

		// Verify Dashboard-Total Teachers text and numbers.
		assertEquals("Total Teachers", Elements.dashboardTotalTeachersText().getText());
		// Verify Dashboard-Total Assessments text and numbers.
		assertEquals("Total Assessments", Elements.dashboardTotalAssessmentsText().getText());
		// Verify Dashboard-Total Reports Generated text and numbers.
		assertEquals("Total Reports Generated", Elements.dashboardTotalReportsGeneratedText().getText());
		// Verify Dashboard-Total Care N Grow Users text and numbers.
		assertEquals("Total Care N Grow Users", Elements.dashboardTotalCareNGrowUsersText().getText());
		// Verify Dashboard-Total Tablets and numbers.
		assertEquals("Total Tablets", Elements.dashboardTotalTabletsText().getText());
	}
}
