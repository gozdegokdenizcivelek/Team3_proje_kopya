package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.merchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Arrays;
import java.util.List;

public class US_21 extends TestBaseRapor {

    @Test
    public void TC_21_001() {

        extentTest = extentReports.createTest("Dashboard menü yapısı kontrol testi");

        merchantPage merchantPage = new merchantPage();

        //Restaurant yöneticisi browser açar
        //URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar

        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);

        //Sayfanın sol kısmındaki menüde "Dashboard" yazısının olduğunu kontrol eder
        String actualString = merchantPage.dashboardMenu.getText();
        String expectedString = "Dashboard";

        Assert.assertEquals(actualString, expectedString);

        //"Dashboard" yazısına tıklandığında "Dashboard" sayfasına gittiğini kontrol eder
        merchantPage.dashboardMenu.click();
        String expectedUrl = "https://qa.flavorfetch.com/backoffice/merchant/dashboard";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);

        // Sonraki Testin DÜzgün Çalışabilmesi İçin Çıkış Yapılmalı
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

        Driver.closeDriver();

    }

    @Test
    public void TC_21_002() {

        extentTest = extentReports.createTest("Alt menüler görüntüleme ve fonksiyon testi");

        merchantPage merchantPage = new merchantPage();

        // Restaurant yöneticisi browser açar
        // URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));

        // Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);

        // "Dashboard" yazısının altında test datasında olan başlıkların olduğunu kontrol eder.

        List<String> menuNames = Arrays.asList("Dashboard", "Merchant", "Orders", "Attributes", "Food",
                "Order Type", "Payment gateway", "Promo",
                "Images", "Account", "Buyers", "Users", "Reports", "Inventory Management");

        String[] actualMenuNamesArray = merchantPage.sideMenuFull.getText().split("\n");
        List<String> actualMenuNamesList = Arrays.asList(actualMenuNamesArray);

        for (int i = 0; i < menuNames.size(); i++) {
            String expectedMenuName = menuNames.get(i);
            String actualMenuName = actualMenuNamesList.get(i);

            Assert.assertEquals(actualMenuName, expectedMenuName);
        }

        // Dashboard altındaki "Merchant" başlığına tıkla
        merchantPage.merchantMenu.click();

        // "Merchant" altında açılan "Information" alt başlığına tıklar
        merchantPage.merchInformationMenu.click();

        // Gerekli sayfaya yönlendirildiğini kontrol eder
        String expectedUrl = "https://qa.flavorfetch.com/backoffice/merchant/edit";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        Driver.closeDriver();
    }
}
