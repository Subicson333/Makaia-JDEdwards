package com.qa.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends SeleniumBase {

    public LoginPage enterUsername(String username) {
        reportStep("User name entered", "pass");
        clearAndType(locateElement("User"), username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        reportStep("Password Entered", "pass");
        clearAndType(locateElement("Password"), password);
        return this;
    }

    public HomePage clickSignIn() {
        reportStep("Sign in clicked", "pass");
        click(locateElement(Locators.XPATH,
                "//button[normalize-space()='Sign In' or normalize-space()='Sign in'] | //input[@value='Sign In']"));
        return new HomePage();
    }
    
}
