package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerTextElement;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthdayDropdown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirthdayDropdown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirthdayDropdown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorFNameTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement errorLNameTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@data-valmsg-for='Email']")
    WebElement errorEmailTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement errorPasswordTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement errorConfirmPasswordTextElement;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompletedMsg;

    public String getRegisterText() {
        Reporter.log("Get register text" + registerTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Get register text" + registerTextElement.toString());
        return getTextFromElement(registerTextElement);
    }

    public void selectGender(String gender) {
        Reporter.log("Select gender");
        CustomListeners.test.log(Status.PASS, "Select gender");
        clickOnElement(By.xpath("//div[@id='gender']/descendant::label[text()='" + gender + "']"));
    }

    public void selectDateOfBirth(String date, String month, String year) {
        Reporter.log("Select date" + dateOfBirthdayDropdown.toString());
        Reporter.log("Select month" + monthOfBirthdayDropdown.toString());
        Reporter.log("Select year" + yearOfBirthdayDropdown.toString());
        CustomListeners.test.log(Status.PASS, "Select date" + dateOfBirthdayDropdown.toString());
        CustomListeners.test.log(Status.PASS, "Select month" + monthOfBirthdayDropdown.toString());
        CustomListeners.test.log(Status.PASS, "Select year" + yearOfBirthdayDropdown.toString());
        selectByVisibleTextFromDropDown(dateOfBirthdayDropdown, date);
        selectByVisibleTextFromDropDown(monthOfBirthdayDropdown, month);
        selectByVisibleTextFromDropDown(yearOfBirthdayDropdown, year);
    }

    public void enterEmail(String email) {
        Reporter.log("Enter email" + emailField.toString());
        CustomListeners.test.log(Status.PASS, "Enter email" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void setFirstNameField(String firstName) {
        Reporter.log("Enter First name" + firstNameField.toString());
        CustomListeners.test.log(Status.PASS, "Enter First name" + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
    }

    public void setLastNameField(String lastName) {
        Reporter.log("Enter Last name" + lastNameField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Last name" + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password" + passwordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter password" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String cfrmPassword) {
        Reporter.log("Enter confirm password" + confirmPassword.toString());
        CustomListeners.test.log(Status.PASS, "Enter confirm password" + confirmPassword.toString());
        sendTextToElement(confirmPassword, cfrmPassword);
    }

    public void clickOnRegister() {
        Reporter.log("Click on register" + registerButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on register" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String getErrorFNameText() {
        Reporter.log("Get first name error text" + errorFNameTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Get first name error text" + errorFNameTextElement.toString());
        return getTextFromElement(errorFNameTextElement);
    }

    public String getErrorLNameText() {
        Reporter.log("Get last name error text" + errorLNameTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Get last name error text" + errorLNameTextElement.toString());
        return getTextFromElement(errorLNameTextElement);
    }

    public String getEmailErrorText() {
        Reporter.log("Get email error text" + errorEmailTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Get email error text" + errorEmailTextElement.toString());
        return getTextFromElement(errorEmailTextElement);
    }

    public String getErrorPasswordText() {
        Reporter.log("Get password error text" + errorPasswordTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Get password error text" + errorPasswordTextElement.toString());
        return getTextFromElement(errorPasswordTextElement);
    }

    public String getConfirmPasswordText() {
        Reporter.log("Get confirm password error text" + errorConfirmPasswordTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Get confirm password error text" + errorConfirmPasswordTextElement.toString());
        return getTextFromElement(errorConfirmPasswordTextElement);
    }

    public String getRegistrationCompletedMsg() {
        Reporter.log("Get registration complete text" + registrationCompletedMsg.toString());
        CustomListeners.test.log(Status.PASS, "Get registration complete text" + registrationCompletedMsg.toString());
        return getTextFromElement(registrationCompletedMsg);
    }
}
