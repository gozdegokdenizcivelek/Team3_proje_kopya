package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.merchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_22 extends TestBaseRapor {
    @Test
    public void TC_2201(){

        extentTest = extentReports.createTest("First Name and Last Name change test");

        merchantPage merchantPage=new merchantPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);
        //Dropdown'a tıklanır.
        merchantPage.profileDropdown.click();
        //Kullanıcı profile'e tıklanır.
        merchantPage.merchantAdminProfile.click();
        //First Name/ Last Name değiştirilir,
        merchantPage.merchantinformationloginfirstname.clear();
        merchantPage.merchantinformationloginfirstname.sendKeys("Team3");
        merchantPage.merchantinformationloginlastname.clear();
        merchantPage.merchantinformationloginlastname.sendKeys("Test");
        ReusableMethods.wait(2);
        //Save tuşuna basılır,
        merchantPage.merchantProfilePageSaveButon.click();
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

    }



    @Test
    public void TC_2202(){

        extentTest = extentReports.createTest("Profile photo changing test");
        merchantPage merchantPage=new merchantPage();
        //username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);
        //Dropdown'a tıklanır.
        merchantPage.profileDropdown.click();
        //Kullanıcı profile'e tıklanır.
        merchantPage.merchantAdminProfile.click();
        ReusableMethods.wait(2);
        //Profil görseli değiştirilmek için "Browse" tıklanır,
        Assert.assertTrue(merchantPage.merchantProfilePageBrowseButon.isEnabled());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

    }

    @Test
    public void TC_2203(){
        extentTest = extentReports.createTest("Password change test,");

        merchantPage merchantPage=new merchantPage();
        //username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);
        //Dropdown'a tıklanır.
        merchantPage.profileDropdown.click();
        //Kullanıcı profile'e tıklanır.
        merchantPage.merchantAdminProfile.click();
        //Change Password tıklanır,
        merchantPage.merchantProfilePageChangePasswordButonu.click();
        ReusableMethods.wait(2);
        //Old Password girilir
        merchantPage.merchantProfilePageOldPasswordTextbox.sendKeys("Flavor.2106");
        ReusableMethods.wait(2);
        //New Password girilir
        merchantPage.merchantProfilePageNewPasswordTextBox.sendKeys("Flavor.2106");
        //Confirm New Password girilir,
        merchantPage.merchantinformationloginconfirmpassword.sendKeys("Flavor.2106");
        //Save tuşuna basılır,
        merchantPage.merchantProfilePageSaveButon.click();
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

    }

}
