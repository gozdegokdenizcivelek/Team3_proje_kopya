package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class US_01 extends TestBaseRapor {
    @Test
    public void TC_0101() {

        extentTest = extentReports.createTest("Access test to home page with URL");
        //Ziyaretci vebsite anasayfaya erisir
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        userPage userPage = new userPage();
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(3);
        Driver.closeDriver();
    }
}