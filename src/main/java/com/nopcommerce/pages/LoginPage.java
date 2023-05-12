package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welComeMsg;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement logInButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement unsuccessfulLoginError;

    public void enterEmail(String email) {
        Reporter.log("Enter email" + emailField.toString());
        CustomListeners.test.log(Status.PASS, "Enter email" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password" + passwordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter password" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginBtn() {
        Reporter.log("Click on login" + logInButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on login" + logInButton.toString());
        clickOnElement(logInButton);
    }

    public String getWelcomeMessage() {
        Reporter.log("Get welcome message" + welComeMsg.toString());
        CustomListeners.test.log(Status.PASS, "Get welcome message" + welComeMsg.toString());
        return getTextFromElement(welComeMsg);
    }

    public String getUnsuccessfulErrorMessage() {
        Reporter.log("Get error message" + unsuccessfulLoginError.toString());
        CustomListeners.test.log(Status.PASS, "Get error message" + unsuccessfulLoginError.toString());
        return getTextFromElement(unsuccessfulLoginError);
    }
}
