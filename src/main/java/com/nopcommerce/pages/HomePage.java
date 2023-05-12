package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopcommerceLogo;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;

    public void clickTopMenuElement(String menu) {
        Reporter.log("Click on main menu element");
        CustomListeners.test.log(Status.PASS, "Click on main menu element");
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']"));
    }

    public void clickOnLogIn() {
        Reporter.log("Click on Log In" + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Log In" + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegister() {
        Reporter.log("Click on Register" + registerLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Register" + registerLink.toString());
        clickOnElement(registerLink);
    }

    public void clickOnMyAccountLink() {
        Reporter.log("Click on My account" + myAccountLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on My account" + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOut() {
        Reporter.log("Click on Logout" + logOutLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Logout" + logOutLink.toString());
        clickOnElement(logOutLink);
    }

    public boolean logoutLinkDisplayed() {
        Reporter.log("Verify logout link element" + logOutLink.toString());
        CustomListeners.test.log(Status.PASS, "Verify logout link element" + logOutLink.toString());
        return logOutLink.isDisplayed();
    }

    public boolean loginLinkDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Verify login link element" + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Verify login link element" + loginLink.toString());
        return loginLink.isDisplayed();
    }
}
