package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopTextElement;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourComp;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByElement;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement displayElement;
    @CacheLookup
    @FindBy(xpath = "//h2[@class = 'product-title']/child::a")
    WebElement productList;

    public String getDesktopText(){
        Reporter.log("Get desktop text" + desktopTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Get desktop text" + desktopTextElement.toString());
        return getTextFromElement(desktopTextElement);
    }
    public void setSortByElement(String text){
        Reporter.log("Sort by products per page" + sortByElement.toString());
        CustomListeners.test.log(Status.PASS, "Sort by products per page" + sortByElement.toString());
        selectByVisibleTextFromDropDown(sortByElement, text);
    }
    public void setDisplayElement(String text){
        Reporter.log("Display products per page" + displayElement.toString());
        CustomListeners.test.log(Status.PASS, "Display products per page" + displayElement.toString());
        selectByVisibleTextFromDropDown(displayElement, text);
    }
    public void clickOnBuildYourComp(){
        Reporter.log("Click on build your own computer" + buildYourComp.toString());
        CustomListeners.test.log(Status.PASS, "Click on build your own computer" + buildYourComp.toString());
        clickOnElement(buildYourComp);
    }
}
