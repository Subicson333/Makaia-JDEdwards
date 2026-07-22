package com.qa.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class InquiriesPage extends ProjectSpecificMethods {

	public InquiriesPage verifyLogin() {
	 	reportStep("Title verified", "pass");
		verifyTitle("Summary Availability - Work With Item Availability");
        return this;
    }
}
