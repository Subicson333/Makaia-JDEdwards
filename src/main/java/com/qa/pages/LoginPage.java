package com.qa.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends SeleniumBase {

    public LoginPage enterUsername(String username) {
        clearAndType(locateElement("User"), username);
        reportStep("User name entered", "pass");
        return this;
    }

    public LoginPage enterPassword(String password) {
        clearAndType(locateElement("Password"), password);
        reportStep("Password Entered", "pass");
        return this;
    }

    public HomePage clickSignIn() {
        click(locateElement(Locators.XPATH,
                "//button[normalize-space()='Sign In' or normalize-space()='Sign in'] | //input[@value='Sign In']"));
        reportStep("Sign in clicked", "pass");
        return new HomePage();
    }
    
}
