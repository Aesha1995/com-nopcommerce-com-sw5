package com.nopcommerce.testsuite;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessFully(){

        homePage.clickOnLogIn();
        Assert.assertEquals(loginPage.getWelcomeMessage(), "Welcome, Please Sign In!", "User is not navigated to Login Page");
    }

    @Test
    public void verifyTheErrorMessageWithInValidCredentials(){
        homePage.clickOnLogIn();
        loginPage.enterEmail("michael12@gmail.com");
        loginPage.enterPassword("Asdf123");
        loginPage.clickOnLoginBtn();
        Assert.assertEquals(loginPage.getUnsuccessfulErrorMessage(), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found", "Error message is not displayed");
    }

    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLogIn();
        loginPage.enterEmail("michael123@gmail.com");
        loginPage.enterPassword("Asdf1234");
        loginPage.clickOnLoginBtn();
        Assert.assertTrue(homePage.logoutLinkDisplayed(), "Logout link is not displayed");
    }

    @Test
    public void VerifyThatUserShouldLogOutSuccessFully() throws InterruptedException {
        homePage.clickOnLogIn();
        loginPage.enterEmail("michael123@gmail.com");
        loginPage.enterPassword("Asdf1234");
        loginPage.clickOnLoginBtn();
        homePage.clickOnLogOut();
        Assert.assertTrue(homePage.loginLinkDisplayed(), "Login link is not displayed");
    }
}
