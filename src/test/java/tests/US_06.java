package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_06 extends TestBaseRapor { //sayfaya kayıt olabilme testi
    pages.userPage userPage = new userPage();

    @Test
    public void test01(){
        extentTest = extentReports.createTest("Sayfı Kayıt Olabilme Testi");
        //Kullanıcı anasayfaya gider, sağ üstte "sign in" linkini görür ve üzerine tıklar
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage.userSignInBotten.click();
        ReusableMethods.wait(3);
        //Daha önce hesabı olmayan kullanıcı Sign Up butonuna tıklayıp "Login" sayfasına ulaşır
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());

        userPage.userSıgnupButton.click();
        ReusableMethods.wait(3);

        //Kullanıcı Firs Name, Last Name e- mail adress textBoxlarına kendi bilgilerini girer.

        String sifre = "k0spdvs20namss.S";
        String fakeEmail = faker.internet().emailAddress();
        //long phoneNumber=312612252;



        ReusableMethods.wait(3);
        actions.click(userPage.userNameTextBox).sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(fakeEmail).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).


        //Kullanıcı telefon numarasını girer ve password ve confirm password textboxlarını Sıgn Up tuşuna basar
                //Şifre gereksinimlerinin sağlanması halinde kullanıcı Sıgn Up tuşuna tıklar

                sendKeys(faker.phoneNumber().cellPhone()).
                sendKeys(Keys.TAB).
                sendKeys(sifre).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(sifre).perform();

        ReusableMethods.wait(4);

        actions.click(userPage.registerSıgnUpButton).perform();

        //Ardından "Registered Successfully" uyarısını alan kullanıcı başarılı bir şekilde siteye kayıt olur

        Assert.assertTrue(userPage.registerSuccesYazisi.isDisplayed());




    }


}
