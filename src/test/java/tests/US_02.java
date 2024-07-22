package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_02 extends TestBaseRapor {

    @Test
    public void TC_01(){
        extentTest = extentReports.createTest("Userpage Anasayfa erisim ve logo testi");
        userPage userPage = new userPage();

        //Kullanıcı browserını açar. URL'i doğru şekilde girerek siteye ulaşır.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        //Açılan sayfada sol üstte sitenin logosunu içeren bir başlık olup olmadığını kontrol eder.
        //Logonun tıklanabilir olup olmadığını test eder.
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        Assert.assertTrue(userPage.headerLogo.isEnabled());
        //Sonrasında tıklayarak sayfa yenileme ile anasayfada oldugunu test eder.
        userPage.headerLogo.click();
        Assert.assertTrue(userPage.headerLogo.isEnabled());
        //Ardından sayfayı kapatır.
        Driver.closeDriver();

    }

    @Test
    public void TC_02(){
        extentTest = extentReports.createTest("Userpage anasayfa Cart testi");
        userPage userPage = new userPage();

        //Kullanici URL'i doğru şekilde girerek siteye ulaşır.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        //Açılan sayfada CART yazılı kısma tıklayarak sepet içeriğini görüntüleme yapılır.
        userPage.userCart.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='el-drawer__close-btn']")).isEnabled());
        //X ile sepet içeriği kısmı kapatılır.
        Driver.getDriver().findElement(By.xpath("//*[@class='el-drawer__close-btn']")).click();
        Assert.assertTrue(userPage.headerLogo.isEnabled());
        //Sayfa kapatılır.
        Driver.closeDriver();
    }

    @Test
    public void TC_03(){
        extentTest = extentReports.createTest("Userpage signin butonu testi");
        userPage userPage = new userPage();

        //Kullanici URL'i doğru şekilde girerek siteye ulaşır.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        //Açılan sayfada Sign In yazılı kısma tıklayarak giriş ekranına geçiş yapar.
        userPage.userSignInButton.click();
        Assert.assertTrue(userPage.userSıgnupButton.isEnabled());
        //Sayfa başarılı bir şekilde kapatılır.
        Driver.closeDriver();

    }
}
