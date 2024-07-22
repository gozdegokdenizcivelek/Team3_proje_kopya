package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_16 extends TestBaseRapor {

    //New address adding test
    @Test
    public void TC_1601(){
        /* KULLANICI YENI ADRES EKELEME TESTI */
        extentTest = extentReports.createTest("New address adding test");
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();

        Actions actions = new Actions(Driver.getDriver());
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

        actions.click(userPage.userDropDownMenu).perform();
        ReusableMethods.wait(3);
        actions.click(userPage.userDropdownAddresses).perform();

        actions.click(userPage.userAddressButtonOnSidebarSection).perform();
        ReusableMethods.wait(2);
        actions.click(userPage.addNewAddress).perform();

        ReusableMethods.wait(3);
        actions.click(userPage.EnterDeliveryAdress).
                sendKeys(ConfigReader.getProperty("deliveryAddress")).
                perform();

        ReusableMethods.wait(4);
        actions.click(userPage.ListedDeliveryAdress).perform();
        ReusableMethods.wait(4);
        actions.click(userPage.SaveDeliveryAddressBtn).perform();
        ReusableMethods.wait(1);
        Driver.closeDriver();

    }

    //Listing addresses test
    @Test
    public void TC_1602(){
        /* EKLENMIS ADRESLERIN LISTELENMESI ADRES VARMI TESTI */

        extentTest = extentReports.createTest("Listing addresses test");
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();

        Actions actions = new Actions(Driver.getDriver());
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

        actions.click(userPage.userDropDownMenu).perform();
        ReusableMethods.wait(3);
        actions.click(userPage.userDropdownAddresses).perform();

        actions.click(userPage.userAddressButtonOnSidebarSection).perform();
        ReusableMethods.wait(2);

        String expectedAddress = ConfigReader.getProperty("deliveryAddress").toLowerCase().trim();
        String actualAddres = userPage.SavedAddress.getText().toLowerCase().trim();
        ReusableMethods.wait(2);

        Assert.assertTrue(actualAddres.contains(expectedAddress));
        ReusableMethods.wait(4);
        Driver.closeDriver();

    }

    //User address update test
    @Test
    public void TC_1603(){
        /* KULLANICI EKLEDIGI ADRESI YENILEME TESTI */
        extentTest = extentReports.createTest("User address update test");
        //Kullanici browser acar.
        //Url'i girer.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();
        Actions actions = new Actions(Driver.getDriver());

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

        //Kullanici kullanıcı profili bölümünden Addresses alt menüsüne tıklar
        actions.click(userPage.userDropDownMenu).perform();
        ReusableMethods.wait(3);
        actions.click(userPage.userDropdownAddresses).perform();

        actions.click(userPage.userAddressButtonOnSidebarSection).perform();
        ReusableMethods.wait(2);

        //Kullanıcı adresi  yeniler
        actions.click(userPage.userAddressEditBtn).perform();
        ReusableMethods.wait(3);

        actions.click(userPage.getUserAddressEditBtn2).perform();
        ReusableMethods.wait(5);

        actions.doubleClick(userPage.CompleteAdd).sendKeys(ConfigReader.getProperty("editedAddressInf")).perform();
        ReusableMethods.wait(2);

        actions.click(userPage.SaveDeliveryAddressBtn).perform();
        ReusableMethods.wait(1);

        //Kullanıcı adresin yenilediğini doğrular

//        actions.click(userPage.userAddressEditBtn).perform();
//        ReusableMethods.wait(3);

        // Alınan adresin boşluk ve özel karakterlerden arındırılması
//        String expectedAddress = ConfigReader.getProperty("editedAddressInf").toLowerCase().trim().replaceAll("[^a-zA-Z0-9]", "");
        String expectedNewAddress = "Tampa";
        String actualNewAddress = userPage.UpdatedAddressValidation.getText();
        System.out.println(actualNewAddress);
        ReusableMethods.wait(4);


        // Adres karşılaştırması
        Assert.assertTrue(actualNewAddress.contains(expectedNewAddress));

        ReusableMethods.wait(3);

        actions.click(userPage.SaveDeliveryAddressBtn).perform();

        //Sayfayı  kapatır.
        Driver.closeDriver();
    }

    @Test
    public void TC_1604(){
        /* KULLANICI EKLENMIS ADRESI SILME TESTI */
        extentTest = extentReports.createTest("User address deletion test");
        //Kullanici browser acar.
        //Url'i girer.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();
        Actions actions = new Actions(Driver.getDriver());

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

        //Kullanici kullanıcı profili bölümünden Addresses alt menüsüne tıklar
        actions.click(userPage.userDropDownMenu).perform();
        ReusableMethods.wait(3);
        actions.click(userPage.userDropdownAddresses).perform();

        actions.click(userPage.userAddressButtonOnSidebarSection).perform();
        ReusableMethods.wait(2);

        //Kullanıcı adresi  siler
        actions.click(userPage.addressDeleteButton).perform();
        ReusableMethods.wait(3);
        actions.click(userPage.DeleteAcceptionButton).perform();


        //Sayfayı  kapatır.
        Driver.closeDriver();
    }
}
