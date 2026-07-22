package com.qa.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class LoginPage extends SeleniumBase {

    public LoginPage enterUsername(String username) {
        reportStep("User name entered", "pass");
        clearAndType(Locators.ID, "User", username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        reportStep("Password Entered", "pass");
        clearAndType(Locators.ID, "Password", password);
        return this;
    }

    public HomePage clickSignIn() {
        reportStep("Sign in clicked", "pass");
        click(Locators.XPATH,
                "//button[normalize-space()='Sign In' or normalize-space()='Sign in'] | //input[@value='Sign In']");
        return new HomePage();
    }
    
}
