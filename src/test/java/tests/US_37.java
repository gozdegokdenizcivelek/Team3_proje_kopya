package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.adminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_37 extends TestBaseRapor {


    @Test
    public void TC_3701(){
        extentTest = extentReports.createTest("Restaurant names from admin's merchant list, search test,");

        adminPage adminPage =new adminPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("admin_Url"));
        adminPage.UserLoginName.sendKeys(ConfigReader.getProperty("adminuser_gozde"));
        adminPage.PasswordLogintBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminPage.SignInButton.click();

        // Merchant dropdown menüsünden List tuşunu görüp tıklanır,
        adminPage.merchantMenu.click();
        adminPage.merchantListMenu.click();

        ReusableMethods.wait(2);
        //search kısmından data aratılır,
        adminPage.merchantSearchBox.sendKeys("SaKa");
        adminPage.merchantSearchButton.click();
        ReusableMethods.wait(5);
        //header >dropdown > logout tuşuna basılır,
        Driver.closeDriver();


    }
    @Test
    public void TC_3702(){
        extentTest = extentReports.createTest("Test to search and edit Merchant information from the All Merchant List,");
        adminPage adminPage =new adminPage();
        //username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("admin_Url"));
        adminPage.UserLoginName.sendKeys(ConfigReader.getProperty("adminuser_gozde"));
        adminPage.PasswordLogintBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminPage.SignInButton.click();

        //Merchant dropdown menüsünden List tuşunu görüp tıklanır,
        adminPage.merchantMenu.click();
        adminPage.merchantListMenu.click();

        ReusableMethods.wait(2);
        //Merchant Search edilir,
        adminPage.merchantSearchBox.sendKeys("Team3");
        adminPage.merchantSearchButton.click();
        ReusableMethods.wait(5);
        // header >dropdown > logout tuşuna basılır,
        Driver.closeDriver();

    }
    @Test
    public void TC_3703(){
        extentTest = extentReports.createTest("Test to Add New Merchant from All Merchant List");
        adminPage adminPage =new adminPage();

        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("admin_Url"));
        adminPage.UserLoginName.sendKeys(ConfigReader.getProperty("adminuser_gozde"));
        adminPage.PasswordLogintBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminPage.SignInButton.click();
        // Merchant dropdown menüsünden List tuşunu görüp tıklanır,

        adminPage.merchantMenu.click();
        adminPage.merchantListMenu.click();
        ReusableMethods.wait(2);

        // Add new basılır
        Assert.assertTrue(adminPage.addNewMerchantButton.isEnabled());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        Driver.closeDriver();
    }

}
