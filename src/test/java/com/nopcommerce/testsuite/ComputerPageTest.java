package com.nopcommerce.testsuite;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.BuildYourOwnComputerPage;
import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.DesktopsPage;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        homePage.clickTopMenuElement("Computers");
        Assert.assertEquals(computerPage.getComputersText(), "Computers", "User is not navigated to Computers page");
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.clickTopMenuElement("Computers");
        computerPage.clickOnDesktops();
        Assert.assertEquals(desktopsPage.getDesktopText(), "Desktops", "User is not navigated to desktop page.");
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
            (String processor, String ram, String hdd, String os, String software){
        homePage.clickTopMenuElement("Computers");
        computerPage.clickOnDesktops();
        desktopsPage.clickOnBuildYourComp();
        buildYourOwnComputerPage.selectProcessor(processor);
        buildYourOwnComputerPage.selectRam(ram);
        buildYourOwnComputerPage.selectHDD(hdd);
        buildYourOwnComputerPage.selectOs(os);
        buildYourOwnComputerPage.selectSoftware(software);
        buildYourOwnComputerPage.clickOnAddToCartButton();
        Assert.assertEquals(buildYourOwnComputerPage.getAddedToCartText(), "The product has been added to your shopping cart", "Product is not added to shopping cart.");

    }
}
