package com.nopcommerce.testsuite;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {
    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegister();
        Assert.assertEquals(registerPage.getRegisterText(), "Register", "User is not navigated to register page");
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegister();
        registerPage.clickOnRegister();
        Assert.assertEquals(registerPage.getErrorFNameText(), "First name is required.", "Error message is not displayed");
        Assert.assertEquals(registerPage.getErrorLNameText(), "Last name is required.", "Error message is not displayed");
        Assert.assertEquals(registerPage.getEmailErrorText(), "Email is required.", "Error message is not displayed");
        Assert.assertEquals(registerPage.getErrorPasswordText(), "Password is required.", "Error message is not displayed");
        Assert.assertEquals(registerPage.getConfirmPasswordText(), "Password is required.", "Error message is not displayed");
    }

    @Test
    public void VerifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegister();
        registerPage.selectGender("Female");
        registerPage.setFirstNameField("Michale");
        registerPage.setLastNameField("Vine");
        registerPage.selectDateOfBirth("10", "May", "1992");
        registerPage.enterEmail("michael123@gmail.com");
        registerPage.enterPassword("Asdf1234");
        registerPage.enterConfirmPassword("Asdf1234");
        registerPage.clickOnRegister();
        Assert.assertEquals(registerPage.getRegistrationCompletedMsg(), "Your registration completed", "User is not registered successfully");
    }
}
