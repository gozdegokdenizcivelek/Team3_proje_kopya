package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_12 extends TestBaseRapor {
    @Test
    public void TC_1201(){
        extentTest = extentReports.createTest("Cuisine menu test");
        //Kullanici Yerel mutfaklara ait menunun anasayfada görüntülendiğini doğrular

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

        //Yerel mutfaklara ait menunun anasayfada görüntülendiğini doğrular
        Assert.assertTrue(userPage.YerelMutfak.isDisplayed());
        ReusableMethods.wait(2);
        //Sayfayi kapatir.
        Driver.closeDriver();
    }

    @Test
    public void TC_1202(){
        extentTest = extentReports.createTest("Cuisine menu More button test");
        //Kullanici Yerel mutfaklara ait menüde More butonunun açılabilir olduğunu doğrular

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

        //Yerel mutfaklara ait menude More butonunun açılabilir olduğunu doğrular
        actions.click(userPage.MoreButton).perform();
        ReusableMethods.wait(4);
        Assert.assertTrue(userPage.CousineDropdownMenu.isDisplayed());
        ReusableMethods.wait(4);
        //Sayfayi kapatir.
        Driver.closeDriver();
    }

    @Test
    public void TC_1203(){
        //BUG VAR
        extentTest = extentReports.createTest("Entrance test to restaurants from cuisine menu");
        //Kullanici Yerel mutfaga klikleyince İlgili mutfağa ait restoranların listelendiğini doğrular


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
//      Yerel mutfaklara ait menüde ilgili butona klikler
        actions.click(userPage.PizzaButtonOnCusinneMenu).perform();
        ReusableMethods.wait(3);
//      Header bölümü altında mutfak adının görüntülendiğini doğrular
        Assert.assertTrue(userPage.PizzaCousineText.isDisplayed());
        ReusableMethods.wait(5);

//      İlgili mutfağa ait restoranların listelendiğini doğrular
        String expectedCountCousine = "3 stores";
        String actualCountCousine = userPage.CountOfRest.getText();
        Assert.assertEquals(actualCountCousine,expectedCountCousine);
        ReusableMethods.wait(3);

        //Sayfayi kapatir.
        Driver.closeDriver();
    }

    @Test
    public void TC_1204(){

        extentTest = extentReports.createTest("Cuisine name visibility test");
        //Kullanici Yerel mutfaga klikleyince İlgili mutfağa ait restoranların listelendiğini doğrular
        //Header bölümü altında mutfak adının görüntülendiğini doğrular

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
//      Yerel mutfaklara ait menüde ilgili butona klikler
        actions.click(userPage.PizzaButtonOnCusinneMenu).perform();
        ReusableMethods.wait(3);
//      Header bölümü altında mutfak adının görüntülendiğini doğrular
        Assert.assertTrue(userPage.PizzaCousineText.isDisplayed());
        ReusableMethods.wait(5);
        //Sayfayi kapatir.
        Driver.closeDriver();
    }
}
