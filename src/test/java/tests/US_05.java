package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05 {
    @Test
    public void TC_01(){
        //Login Sayfasına Erişim ve Kullanıcının Doğru Bilgilerle Login OLabilmesi

        //Kullanıcı tarayıcıyı açar.
        //Kullanıcı e-ticaret sitesinin URL'sini adres çubuğuna yazar ve enter tuşuna basar.

        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));        //Kullanıcı anasayfaya gider, sağ üstte "sign in" linkini görür ve üzerine tıklar


        userPage userPage = new userPage();
        userPage.userSignInBotten.click();


        //Başlığında "Login" yazan kullanıcı giriş sayfası açılır.



        //Login sayfasının altındaki text box içerisine kullanıcı tıklar ve  kayıtlı olduğu email girer.
        userPage.userNameTextBox.sendKeys(ConfigReader.getProperty("customeruser_semih"));

        //Ardından hemen altındaki "password text box"ına kayıtlı olduğu şifreyi girer
        userPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty("customerPassword"));
        //Şifre yıldızlarla görünmez şekildedir. Kullanıcı şifreyi doğru girdiğinden emin olmak için "password text box"ının yanındaki visible fonksiyonuna tıklar.
        userPage.visiblePassword.click();

        //Şifresini doğru girdiğinden emin olan kullanıcı visible fonksiyonuna tekrar tıklar ve şifresi görünmez olur.
        //userPage.visiblePassword.click();

        //Tekrar şifresini girmek istemeyen kullanıcı altta Remember me yazısının yanındaki check box u görür ve işaretler
        userPage.rememberMeCheckbox.click();

        //Bilgiler girildiikten sonra kullanıcı Sign in butonuna tıklar.
        userPage.userGirisBotten.click();
        //Kullanıcı sayfası görülür ve login olunur
        ReusableMethods.wait(2);

        Assert.assertTrue(userPage.userIcon.isDisplayed());

        Driver.getDriver().quit();


    }

    @Test
    public void TC02(){
        // Login Sayfasına Erişim ve Yanlış email ile Login olamaması

        //Kullanıcı tarayıcıyı açar.
        //Kullanıcı e-ticaret sitesinin URL'sini adres çubuğuna yazar ve enter tuşuna basar.

        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));        //Kullanıcı anasayfaya gider, sağ üstte "sign in" linkini görür ve üzerine tıklar


        userPage userPage = new userPage();
        userPage.userSignInBotten.click();


        //Başlığında "Login" yazan kullanıcı giriş sayfası açılır.

        ReusableMethods.wait(2);
        WebElement cookiesaccept = Driver.getDriver().findElement(By.xpath("//*[@class='el-button el-button--primary el-button--default is-round w-100']"));
        cookiesaccept.click();

        ReusableMethods.wait(2);

        //Login sayfasının altındaki text box içerisine kullanıcı tıklar ve  kayıtlı olduğu emaili yanlış girer.        userPage.userName.sendKeys(ConfigReader.getProperty("customeruser_semih"));
        //Ardından hemen altındaki "password text box"ına kayıtlı olduğu şifreyi girer

        Faker faker = new Faker();

        userPage.userNameTextBox.sendKeys(faker.internet().emailAddress());

        //Ardından hemen altındaki "password text box"ına kayıtlı olduğu şifreyi girer
        userPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty("customerPassword"));


        //Bilgiler girildiikten sonra kullanıcı Sign in butonuna tıklar.
        userPage.userSignInBotten.click();


        //Bilgilerin altında "unable to login yazısı çıkar ve kullanıcı login olamaz.

        Assert.assertTrue(userPage.unabletologinYazisi.isDisplayed());

        Driver.getDriver().quit();

    }

    @Test
    public void TC_03(){
        //Login Sayfasına Erişim ve Yanlış  Telefon ile Login olamaması

        //Kullanıcı tarayıcıyı açar.
        //Kullanıcı e-ticaret sitesinin URL'sini adres çubuğuna yazar ve enter tuşuna basar.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));        //Kullanıcı anasayfaya gider, sağ üstte "sign in" linkini görür ve üzerine tıklar



        //Kullanıcı anasayfaya gider, sağ üstte "sign in" linkini görür ve üzerine tıklar
        userPage userPage = new userPage();
        userPage.userSignInBotten.click();
        //Başlığında "Login" yazan kullanıcı giriş sayfası açılır.
        //Login sayfasının altındaki text box içerisine kullanıcı tıklar ve  kayıtlı olduğu telefonu yanlış girer.
        Faker faker = new Faker();
        userPage.userPasswordTextBox.sendKeys(faker.phoneNumber().phoneNumber());
        //Ardından hemen altındaki "password text box"ına kayıtlı olduğu şifreyi girer
        userPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty("customerPassword"));


        userPage.userSignInBotten.click();


        //Bilgilerin altında "unable to login yazısı çıkar ve kullanıcı login olamaz.

        Assert.assertTrue(userPage.unabletologinYazisi.isDisplayed());

        Driver.getDriver().quit();
    }

    @Test
    public void TC_04(){

        //Login Sayfasına Erişim ve Yanlış password ile Login olamaması

        //Kullanıcı tarayıcıyı açar.
        //Kullanıcı e-ticaret sitesinin URL'sini adres çubuğuna yazar ve enter tuşuna basar.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        //Kullanıcı anasayfaya gider, sağ üstte "sign in" linkini görür ve üzerine tıklar
        userPage userPage = new userPage();
        userPage.userSignInBotten.click();
        //Başlığında "Login" yazan kullanıcı giriş sayfası açılır.
        //Username text box 'ına kullanıcı tıklar ve  kayıtlı olduğu email  girer.

        userPage.userNameTextBox.sendKeys(ConfigReader.getProperty("customeruser_semih"));

        //Kullanıcı "password text box"ına kayıtlı olduğu şifreyi yanlış girer
        Faker faker = new Faker();
        userPage.userPasswordTextBox.sendKeys(faker.internet().password());
        //Bilgiler girildiikten sonra kullanıcı Sign in butonuna tıklar.

        //Bilgilerin altında "unable to login yazısı çıkar ve kullanıcı login olamaz.
        userPage.userSignInBotten.click();


        //Bilgilerin altında "unable to login yazısı çıkar ve kullanıcı login olamaz.

        Assert.assertTrue(userPage.unabletologinYazisi.isDisplayed());

        Driver.getDriver().quit();

    }
    @Test
    public void TC_05(){
        //Login Sayfasına Erişim ve Yanlış email veya telefon ve password ile Login olamaması

        //Kullanıcı tarayıcıyı açar.
        //Kullanıcı e-ticaret sitesinin URL'sini adres çubuğuna yazar ve enter tuşuna basar.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        //Kullanıcı anasayfaya gider, sağ üstte "sign in" linkini görür ve üzerine tıklar
        userPage userPage = new userPage();
        userPage.userSignInBotten.click();
        //Başlığında "Login" yazan kullanıcı giriş sayfası açılır.

        //Login sayfasının altındaki text box içerisine kullanıcı tıklar ve  kayıtlı olduğu emaili yanlış girer.
        Faker faker = new Faker();
        userPage.userNameTextBox.sendKeys(faker.internet().emailAddress());
        //Ardından hemen altındaki "password text box"ına kayıtlı olduğu şifreyi yanlış girer
        userPage.userPasswordTextBox.sendKeys(faker.internet().password());

        //Bilgiler girildiikten sonra kullanıcı Sign in butonuna tıklar.

        userPage.userSignInBotten.click();


        //Login sayfası tekrar açılır ve kullanıcı login olamaz.

        Assert.assertTrue(userPage.loginYazisi.isDisplayed());


        Driver.getDriver().quit();

    }
    @Test
    public void TC_06(){
        //Bilgiler Boş Bırakılarak Login Olamama

        //Kullanıcı tarayıcıyı açar.
        //Kullanıcı e-ticaret sitesinin URL'sini adres çubuğuna yazar ve enter tuşuna basar.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        //Bilgiler girildiikten sonra kullanıcı Sign in butonuna tıklar.
        userPage userPage = new userPage();
        userPage.userGirisBotten.click();


        //Başlığında "Login" yazan kullanıcı giriş sayfası açılır.
        // Kullanıcı Sign in butonu aktif olmaz

        Assert.assertTrue(userPage.userSignInBotten.isEnabled());
        Driver.getDriver().quit();

    }
    @Test
    public void TC_07(){
        //Kullanıcının şifresini hatırlamayarak "Forgot Password" linkini kullanması

        //Kullanıcı tarayıcıyı açar.
        //Kullanıcı e-ticaret sitesinin URL'sini adres çubuğuna yazar ve enter tuşuna basar.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        //Bilgiler girildiikten sonra kullanıcı Sign in butonuna tıklar.
        userPage userPage = new userPage();
        userPage.userSignInBotten.click();
        //Başlığında "Login" yazan kullanıcı giriş sayfası açılır.
        //Forgot Password linkine tıklar
        userPage.forgotPasswordLinki.click();
        //Forgot Password Sayfası açılır

        Assert.assertTrue(userPage.forgotPasswordyazisi.isDisplayed());
        Driver.getDriver().quit();



    }



}
