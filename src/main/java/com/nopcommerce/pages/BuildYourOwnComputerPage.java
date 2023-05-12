package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerTextElement;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement addedToCartMessageElement;

    public String getBuildYourOwnComputerText() {
        Reporter.log("Getting Build you own computer text" + buildYourOwnComputerTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Getting Build you own computer text" + buildYourOwnComputerTextElement.toString());
        return getTextFromElement(buildYourOwnComputerTextElement);
    }

    public void selectProcessor(String processor) {
        Reporter.log("Select Processor" + processorDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select Processor" + processorDropDown.toString());
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void selectRam(String ram) {
        Reporter.log("Select ram" + ramDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select ram" + ramDropDown.toString());
        selectByVisibleTextFromDropDown(ramDropDown, ram);
    }

    public void selectHDD(String hdd) {
        Reporter.log("Select HDD");
        CustomListeners.test.log(Status.PASS, "Select HDD");
        clickOnElement(By.xpath("//input[@name='product_attribute_3']/following-sibling::label[text()='" + hdd + "']"));
    }

    public void selectOs(String os) {
        Reporter.log("Select OS");
        CustomListeners.test.log(Status.PASS, "Select OS");
        clickOnElement(By.xpath("//input[@name='product_attribute_4']/following-sibling::label[contains(text(),'" + os + "')]"));
    }

    public void selectSoftware(String software) {
        Reporter.log("Select Software");
        CustomListeners.test.log(Status.PASS, "Select Software");
        clickOnElement(By.xpath("//input[@name='product_attribute_5']/following-sibling::label[contains(text(),'" + software + "')]"));
    }

    public void clickOnAddToCartButton() {
        Reporter.log("CLick on add to card" + addToCartButton.toString());
        CustomListeners.test.log(Status.PASS, "CLick on add to card" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String getAddedToCartText() {
        Reporter.log("Get add to cart text" + addedToCartMessageElement.toString());
        CustomListeners.test.log(Status.PASS, "Get add to cart text" + addedToCartMessageElement.toString());
        return getTextFromElement(addedToCartMessageElement);
    }
}
