package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.merchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_28 extends TestBaseRapor {
    @Test
    public void TC_2801(){
        extentTest = extentReports.createTest("Test of a restaurant manager examining the orders given,");
        merchantPage merchantPage = new merchantPage();
    // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //Sol menüden Orders > Orders Ready butonuna tıklanır.
        merchantPage.ordersMenu.click();

        merchantPage.ordersReadySideBarMenu.click();

        //search kısmından arama yapılır
        merchantPage.orderSearchBox.sendKeys("gozde gokdeniz");
        ReusableMethods.wait(2);
        //Order Ready Listesinden çıkan sonuça tıklanır,
        Assert.assertTrue(merchantPage.newOrderInfoBox.isDisplayed());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        Driver.closeDriver();
    }

    @Test
    public void TC_2802(){
        extentTest = extentReports.createTest("Test of a restaurant manager's ability to direct an Assign Driver to the orders placed,");
        merchantPage merchantPage = new merchantPage();

        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //Sol menüden Orders > Orders Ready butonuna tıklanır.
        merchantPage.ordersMenu.click();
        merchantPage.ordersReadySideBarMenu.click();
        ReusableMethods.wait(2);
        //"Assign Driver" tuşuna basılır,
        Assert.assertTrue(merchantPage.assignDriverButton.isEnabled());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        Driver.closeDriver();
    }

    @Test
    public void TC_2803(){
        extentTest = extentReports.createTest("testing a restaurant manager's ability to print orders,");
        merchantPage merchantPage = new merchantPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //Sol menüden Orders > Orders Ready butonuna tıklanır.
        merchantPage.ordersMenu.click();
        merchantPage.ordersReadySideBarMenu.click();
        ReusableMethods.wait(2);
        //DELİVERY FAİLED tıklanır,
        Assert.assertTrue(merchantPage.deliveryFailedButton.isEnabled());

        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        Driver.closeDriver();


    }
    @Test
    public void TC_2804(){
        extentTest = extentReports.createTest("The test of a restaurant manager delivering the order,");
        merchantPage merchantPage = new merchantPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //Sol menüden Orders > Orders Ready butonuna tıklanır.
        merchantPage.ordersMenu.click();
        merchantPage.ordersReadySideBarMenu.click();
        ReusableMethods.wait(2);
        // "Delivered" tuşuna basılır,
        merchantPage.deliveredButton.click();
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        Driver.closeDriver();

    }
}
