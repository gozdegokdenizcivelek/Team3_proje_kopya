package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_11 extends TestBaseRapor {
    @Test
    public void TC_1101(){
        extentTest = extentReports.createTest("Search test with enter key");

        /*KULLANICI ANA SAYFADA ENTER TUSUNA BASARAK ARAMA YAPMA TESTI*/

        userPage userPage = new userPage();
        Actions actions = new Actions(Driver.getDriver());
        //        Kullanici browser acar.
        //        Url'i girer.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        // Anasayfaya erisim saglandigini dogrular.
        userPage.headerLogo.isDisplayed();
        ReusableMethods.wait(2);

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar.
        actions.click(userPage.userSignInButton).perform();
        ReusableMethods.wait(2);

        actions.click(userPage.userNameInputBox).
                sendKeys(ConfigReader.getProperty("customeruser_ulvi")).perform();
        ReusableMethods.wait(2);
        actions.click(userPage.userPasswordInputBox).
                sendKeys(ConfigReader.getProperty("customerPassword")).perform();
        ReusableMethods.wait(2);

        actions.click(userPage.userSignInToAccountButton).perform();
        ReusableMethods.wait(2);

        //"Enter delivery address"  yazılı arama çubuğunun görünür olduğunu doğrular

        userPage.SearchBoxOnHomePage.isDisplayed();

        ReusableMethods.wait(4);

        //Lokasyon + ENTER girer
        actions.click(userPage.SearchBoxOnHomePage).
                sendKeys(ConfigReader.getProperty("deliveryAddress")).
                perform();
        actions.click(userPage.ListedDeliveryAdress).sendKeys(Keys.ENTER).perform();

        ReusableMethods.wait(4);

        //Sayfayi kapatir.
        Driver.closeDriver();

    }
    @Test
    public void TC_1102(){
        /* KULLANICI ANA SAYFADA DOGRU ADRES GIREREK ARAMA YAPAR */
        extentTest = extentReports.createTest("Searching test with the result when we enter the location");
        userPage userPage = new userPage();
        Actions actions = new Actions(Driver.getDriver());
        //        Kullanici browser acar.
        //        Url'i girer.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        // Anasayfaya erisim saglandigini dogrular.
        userPage.headerLogo.isDisplayed();
        ReusableMethods.wait(2);

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar.
        actions.click(userPage.userSignInButton).perform();
        ReusableMethods.wait(2);

        actions.click(userPage.userNameInputBox).
                sendKeys(ConfigReader.getProperty("customeruser_ulvi")).perform();
        ReusableMethods.wait(2);
        actions.click(userPage.userPasswordInputBox).
                sendKeys(ConfigReader.getProperty("customerPassword")).perform();
        ReusableMethods.wait(2);

        actions.click(userPage.userSignInToAccountButton).perform();
        ReusableMethods.wait(2);

        //"Enter delivery address"  yazılı arama çubuğunun görünür olduğunu doğrular

        userPage.SearchBoxOnHomePage.isDisplayed();

        ReusableMethods.wait(4);

        //Lokasyon + ENTER girer
        actions.click(userPage.SearchBoxOnHomePage).
                sendKeys(ConfigReader.getProperty("deliveryAddress")).
                perform();
        actions.click(userPage.ListedDeliveryAdress).perform();

        ReusableMethods.wait(7);

        String expectedUrl=  ConfigReader.getProperty("restoranlarSayfasi");
        String actualUrl   = Driver.getDriver().getCurrentUrl();

        ReusableMethods.wait(2);
        Assert.assertEquals(actualUrl,expectedUrl);


        System.out.println(actualUrl);
        //Sayfayi kapatir.
        Driver.closeDriver();

    }

    @Test
    public void TC_1103(){
        /* KULLANICI OLMAYAN BIR ADRESI GIREREK ARAMA YAPAR*/
        extentTest = extentReports.createTest("Unavailable location test");

        userPage userPage = new userPage();
        Actions actions = new Actions(Driver.getDriver());
        //        Kullanici browser acar.
        //        Url'i girer.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        // Anasayfaya erisim saglandigini dogrular.
        userPage.headerLogo.isDisplayed();
        ReusableMethods.wait(2);

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar.
        actions.click(userPage.userSignInButton).perform();
        ReusableMethods.wait(2);

        actions.click(userPage.userNameInputBox).
                sendKeys(ConfigReader.getProperty("customeruser_ulvi")).perform();
        ReusableMethods.wait(2);
        actions.click(userPage.userPasswordInputBox).
                sendKeys(ConfigReader.getProperty("customerPassword")).perform();
        ReusableMethods.wait(2);

        actions.click(userPage.userSignInToAccountButton).perform();
        ReusableMethods.wait(2);

        //"Enter delivery address"  yazılı arama çubuğunun görünür olduğunu doğrular

        userPage.SearchBoxOnHomePage.isDisplayed();

        ReusableMethods.wait(4);

        //Lokasyon + ENTER girer
        actions.click(userPage.SearchBoxOnHomePage).
                sendKeys(ConfigReader.getProperty("gecersizLokasyon")).
                perform();
//        actions.click(userPage.ListedDeliveryAdress).

        ReusableMethods.wait(7);


        Assert.assertTrue(userPage.WeDeliverDeliciousness.isDisplayed(),"Gecersiz adres..");

        //Sayfayi kapatir.
        Driver.closeDriver();

    }

    @Test
    public void TC_1104(){
        /*KULLANICI ARAMA IKONUNA KLIKLEYEREK ARAMA YAPAR */
        extentTest = extentReports.createTest("Location finding test by pressing the search button");

        userPage userPage = new userPage();
        Actions actions = new Actions(Driver.getDriver());
        //        Kullanici browser acar.
        //        Url'i girer.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        // Anasayfaya erisim saglandigini dogrular.
        userPage.headerLogo.isDisplayed();
        ReusableMethods.wait(2);

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar.
        actions.click(userPage.userSignInButton).perform();
        ReusableMethods.wait(2);

        actions.click(userPage.userNameInputBox).
                sendKeys(ConfigReader.getProperty("customeruser_ulvi")).perform();
        ReusableMethods.wait(2);
        actions.click(userPage.userPasswordInputBox).
                sendKeys(ConfigReader.getProperty("customerPassword")).perform();
        ReusableMethods.wait(2);

        actions.click(userPage.userSignInToAccountButton).perform();
        ReusableMethods.wait(2);

        //"Enter delivery address"  yazılı arama çubuğunun görünür olduğunu doğrular

        userPage.SearchBoxOnHomePage.isDisplayed();

        ReusableMethods.wait(4);

        //Lokasyon + ENTER girer
        actions.click(userPage.SearchBoxOnHomePage).
                sendKeys(ConfigReader.getProperty("deliveryAddress")).
                perform();

        ReusableMethods.wait(7);


        actions.click(userPage.iconOnSearchBox).perform();
        ReusableMethods.wait(2);
        Assert.assertTrue(userPage.WeDeliverDeliciousness.isDisplayed(),"Ikon calismiyor..");

        //Sayfayi kapatir.
        Driver.closeDriver();

    }

    @Test
    public void TC_1118(){
        /* KULLANICI RESTORAN ARAR VE RESTORANLARI FILTRELEYEREK MUTFAK SECER VE ADD TO CARD YAPAR */
        extentTest = extentReports.createTest("Filter section radio options test");

        /* Kullanici Ana Sayfada urunu arar Filtre secer ve sepete ekler */
        userPage userPage = new userPage();
        Actions actions = new Actions(Driver.getDriver());
        //        Kullanici browser acar.
        //        Url'i girer.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        // Anasayfaya erisim saglandigini dogrular.
        userPage.headerLogo.isDisplayed();
        ReusableMethods.wait(2);

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar.
        actions.click(userPage.userSignInButton).perform();
        ReusableMethods.wait(2);

        actions.click(userPage.userNameInputBox).
                sendKeys(ConfigReader.getProperty("customeruser_ulvi")).perform();
        ReusableMethods.wait(2);
        actions.click(userPage.userPasswordInputBox).
                sendKeys(ConfigReader.getProperty("customerPassword")).perform();
        ReusableMethods.wait(2);

        actions.click(userPage.userSignInToAccountButton).perform();
        ReusableMethods.wait(2);

        //"Enter delivery address"  yazılı arama çubuğunun görünür olduğunu doğrular

        userPage.SearchBoxOnHomePage.isDisplayed();

        ReusableMethods.wait(4);

        //Lokasyon + ENTER girer
        actions.click(userPage.SearchBoxOnHomePage).
                sendKeys(ConfigReader.getProperty("deliveryAddress")).
                perform();
        actions.click(userPage.ListedDeliveryAdress).perform();

        ReusableMethods.wait(7);

        String expectedUrl=  ConfigReader.getProperty("restoranlarSayfasi");
        String actualUrl   = Driver.getDriver().getCurrentUrl();

        ReusableMethods.wait(2);
        Assert.assertEquals(actualUrl,expectedUrl);

        actions.click(userPage.MostPopular).perform();
        ReusableMethods.wait(3);
        actions.click(userPage.ShowMoreButonu).perform();
        ReusableMethods.wait(2);
        actions.click(userPage.FasFood).perform();
        ReusableMethods.wait(3);

        actions.click(userPage.Team3Restaurant).perform();
        ReusableMethods.wait(3);

        //actions.click(userPage.AddToCardOnOpenedModal).perform();
        // ReusableMethods.wait(3);

        actions.click(userPage.LastAddToCard).perform();
        ReusableMethods.wait(3);

        //Sayfayi kapatir.
        Driver.closeDriver();

    }
}
