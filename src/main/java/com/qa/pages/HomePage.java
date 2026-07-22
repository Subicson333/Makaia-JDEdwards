package com.qa.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

/**
 * Sample Page Object for the products/inventory screen of the demo application
 * (https://www.saucedemo.com/) shown after a successful login.
 *
 * Demonstrates verification and read style helpers from the reusable layer.
 */
public class HomePage extends ProjectSpecificMethods {

    public HomePage verifyLogin() {
        reportStep("Title verified", "pass");
        verifyTitle("JD Edwards EnterpriseOne");
        return this;
    }

    public HomePage clickNavigator() {
        reportStep("Navigator clicked", "pass");
        click(Locators.ID, "drop_mainmenuParent");
        return this;
    }

    public HomePage clickEnterpriseOneMenus() {
        reportStep("Enterprise one clicked", "pass");
        click(Locators.XPATH, "//span[text()='EnterpriseOne Menus']");
        return this;
    }

    public HomePage clickLogisticsManagement() {
        pause(2000);
        reportStep("Logistics Management Clicked", "pass");
        click(Locators.XPATH, "//span[text()='Logistics Management']");
        return this;
    }

    public HomePage clickInventoryManagement() {
        reportStep("Clicked Inventory Management", "pass");
        click(Locators.XPATH, "//span[text()='Inventory Management']");
        return this;
    }

    public HomePage clickDailyProcessing() {
        reportStep("Clicked Daily Processing", "pass");
        click(Locators.XPATH, "//span[text()='Daily Processing']");
        return this;
    }

    public HomePage clickInquiries() {
        reportStep("Clicked Inquiries", "pass");
        click(Locators.XPATH, "//span[text()='Inventory Inquiries']");
        return this;
    }

    public InquiriesPage clickSummary() {
        reportStep("Clicked summary", "pass");
        click(Locators.XPATH, "//a[text()='Summary Availability']");
        return new InquiriesPage();
    }
}
