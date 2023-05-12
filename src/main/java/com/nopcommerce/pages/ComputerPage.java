package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerText;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsLink;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Notebooks'][normalize-space()='Notebooks']")
    WebElement notebooksLink;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Software'][normalize-space()='Software']")
    WebElement softwareLink;

    public String getComputersText(){
        Reporter.log("Get computers text" + computerText.toString());
        CustomListeners.test.log(Status.PASS, "Get computers text" + computerText.toString());
        return getTextFromElement(computerText);
    }

    public void clickOnDesktops(){
        Reporter.log("Click on desktop" + desktopsLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on desktop" + desktopsLink.toString());
        clickOnElement(desktopsLink);
    }
    public void clickOnNotebooks(){
        Reporter.log("Click on Notebooks" + notebooksLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Notebooks" + notebooksLink.toString());
        clickOnElement(notebooksLink);
    }
    public void clickOnSoftware(){
        Reporter.log("Click on Software" + softwareLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Software" + softwareLink.toString());
        clickOnElement(softwareLink);
    }
}
