package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.adminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_38 extends TestBaseRapor {
    @Test
    public void TC_01() {
        extentTest = extentReports.createTest("Bütün siparişleri ve detaylarını görüntüleme testi ");

        adminPage adminPage = new adminPage();
        //Kullanici browser acar url girer
        Driver.getDriver().get(ConfigReader.getProperty("admin_Url"));
        //User logs in with username and password
        Actions actions = new Actions(Driver.getDriver());

        actions.click(adminPage.UserNameTextBox).sendKeys(ConfigReader.getProperty("adminuser_xaver")).sendKeys(Keys.TAB)

                .sendKeys(ConfigReader.getProperty("adminPassword")).perform();

        actions.click(adminPage.SignInButton).perform();

        ReusableMethods.wait(2);

        // "Dashboard" menüsünün altındaki "Orders" menüsüne tıklar
        adminPage.orderButton.click();
        //Admin Page-de AllOrders butonu
        adminPage.allorderButton.click();
        //All Orders-a tıkladıkdan sonra yeni sayfada "AllOrders" başlığına tiklar
        adminPage.allOrdersTitle.click();


        // Sayfanın üst panelinde toplam sipariş sayısı ve toplam kazanç gibi bilgilerin olduğunu kontrol eder
        Assert.assertTrue(adminPage.ordersTextBox.isDisplayed());
        Assert.assertTrue((adminPage.cancelTextBox.isDisplayed()));
        Assert.assertTrue((adminPage.refundTextBox.isDisplayed()));
        Assert.assertTrue(adminPage.totalOrdersBox.isDisplayed());
        Driver.closeDriver();
    }

        @Test
       public void TC31_003() {
            extentTest = extentReports.createTest("Belirli tarihe gore filtreleme yapilabilmeli");

            adminPage adminPage = new adminPage();
            //Kullanici browser acar url girer
            Driver.getDriver().get(ConfigReader.getProperty("admin_Url"));
            //User logs in with username and password
            Actions actions=new Actions(Driver.getDriver());

            actions.click(adminPage.UserNameTextBox).sendKeys(ConfigReader.getProperty("adminuser_xaver")).sendKeys(Keys.TAB)

                    .sendKeys(ConfigReader.getProperty("adminPassword")).perform();

            actions.click(adminPage.SignInButton).perform();

            ReusableMethods.wait(2);

            // "Dashboard" menüsünün altındaki "Orders" menüsüne tıklar
            adminPage.orderButton.click();
            //Admin Page-de AllOrders butonu
            adminPage.allorderButton.click();
            //All Orders-a tıkladıkdan sonra yeni sayfada "AllOrders" başlığına tiklar
            adminPage.allOrdersTitle.click();
       // Sayfadaki tarih kısmına belirtilen tarih aralığını seçer
        adminPage.startAndEndDateBox.click();
        ReusableMethods.wait(5);
        //Belirli bir tarihe gore filtreleme yapar
        //adminPage.last7Days.click();
        ReusableMethods.wait(5);






    }}
