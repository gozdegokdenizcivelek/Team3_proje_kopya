package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import pages.merchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_10 {
    @Test
    public void TC_11(){
        //Satıcıların daha önce girilmiş email adresi ile Register işlemi

        //Kullanıcı tarayıcıyı açar.
        //Kullanıcı e-ticaret sitesinin URL'sini adres çubuğuna yazar ve enter tuşuna basar.

        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        userPage userPage = new userPage();

        //Sayfanın aşağıya inerek "join us" linkine tıklar


        JSUtilities.scrollToElement(Driver.getDriver(),userPage.joinUsButton);
        ReusableMethods.wait(2);
        userPage.joinUsButton.click();

        //Restoran kayıt sayfası açılır.

        //Açılan sayfada istenen bilgileri doldurur
        userPage.storeName.sendKeys(ConfigReader.getProperty("StoreName"));

        userPage.storeAddress.sendKeys(ConfigReader.getProperty("StoreLocation"));

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();

        ReusableMethods.wait(2);

        userPage.storeEmailAddress.sendKeys(ConfigReader.getProperty("StoreEmail"));

        userPage.storeTelNumber.sendKeys(ConfigReader.getProperty("StoreTel"));

        userPage.storeComissionRadioButton.click();


        //Submit butonuna tıklanır
        userPage.storeSubmitButonu.click();

        ReusableMethods.wait(2);
        //Email kayıtlı olduğuna dair mesajı alınır.
        Assert.assertTrue(userPage.emailAlreadyTaken.isDisplayed());

        //"Already have an account? Login here" bölümüne tıklanır.
        userPage.alreadyloginherelinki.click();
        merchantPage merchantpage = new merchantPage();
        //Merchant login sayfası açılır
        Assert.assertTrue(merchantpage.merchantLoginUsername.isDisplayed());



        Driver.getDriver().quit();



    }
    @Test
    public void TC_12(){

        //Geçersiz Bilgilerle Başvuru Yapma

        //Kullanıcı tarayıcıyı açar.
        //Kullanıcı e-ticaret sitesinin URL'sini adres çubuğuna yazar ve enter tuşuna basar.

        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        userPage userPage = new userPage();

        //Sayfanın aşağıya inerek "join us" linkine tıklar


        JSUtilities.scrollToElement(Driver.getDriver(),userPage.joinUsButton);
        ReusableMethods.wait(2);
        userPage.joinUsButton.click();

        //Restoran kayıt sayfası açılır.

        //Açılan sayfada istenen bilgileri geçersiz bilgilerle doldurur.
        Faker faker = new Faker();
        userPage.storeName.sendKeys(faker.name().username());

        userPage.storeAddress.sendKeys(ConfigReader.getProperty("StoreLocation"));

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();

        ReusableMethods.wait(2);


        userPage.storeEmailAddress.sendKeys(faker.internet().emailAddress());

        userPage.storeTelNumber.sendKeys(faker.phoneNumber().phoneNumber());

        userPage.storeComissionRadioButton.click();


        //Submit butonuna tıklanır
        userPage.storeSubmitButonu.click();
        //Geçersiz bilgilerle aktif olunmamalı
        Assert.assertFalse(userPage.storeSubmitButonu.isEnabled());
        //Submit butonuna tıklanır
        //Register user sayfası açılmamalı




    }
    @Test
    public void TC_13(){
        //Lokasyon aratarak çıkan ürünlerden sepete ekleme ve Kredi Karti ile ödeme yapma

        //Kullanıcı tarayıcıyı açar.
        //Kullanıcı e-ticaret sitesinin URL'sini adres çubuğuna yazar ve enter tuşuna basar.

        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        userPage userPage = new userPage();


        //Lokasyon bölümüne Boston yazar ve arama yapar
        userPage.anasayfaLokasyonAramaKutusu.sendKeys("Boston");
        WebElement ilkrestoran = Driver.getDriver().findElement(By.xpath("//*[@class='m-0 text-grey']"));
        ilkrestoran.click();

        //Yemek listesi göründü ve  ilk sayfada filtreleme yaparak pizza seçer
        userPage.filterPizzaCheckbox.click();
        ReusableMethods.wait(3);

        //çıkan restoranlardan baştan ikinci seçeneği seçer
        WebElement ikincirestorant = Driver.getDriver().findElement(By.xpath("(//*[@class='el-image'])[2]"));
        ikincirestorant.click();
        ReusableMethods.wait(2);

        //Yemek listesi gelir ve ilk yemek sepete eklenir.
        WebElement ilkyemekaddtocart = Driver.getDriver().findElement(By.xpath("(//*[text()=' Add to cart '])[1]"));
        ilkyemekaddtocart.click();

        //attribute sayfası açılır ve ilk seçenek tıklanır ve adet 2 yapılır.



        WebElement attributeilksecenek = Driver.getDriver().findElement(By.xpath("(//*[@name='size_uuid'])[1]"));
        JSUtilities.clickWithJS(Driver.getDriver(), attributeilksecenek);


        WebElement adetArttir = Driver.getDriver().findElement(By.xpath("(//*[@class='rounded-pill qty-btn'])[2]"));

        JSUtilities.clickWithJS(Driver.getDriver(), adetArttir);
        JSUtilities.clickWithJS(Driver.getDriver(), adetArttir);
        JSUtilities.clickWithJS(Driver.getDriver(), adetArttir);
        JSUtilities.clickWithJS(Driver.getDriver(), adetArttir);

        JSUtilities.clickWithJS(Driver.getDriver(), adetArttir);


        //Açılan pop-up da new order butonu tıklanır.
        WebElement popupaddtocart = Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-green w-100 add_to_cart']"));
        JSUtilities.clickWithJS(Driver.getDriver(), popupaddtocart);


        //AÇılan sayfada checkout butonuna tıklanır.
        userPage.checkoutbutonu.click();
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


        //Sipariş,adres ve ödeme detaylarının göründüğü sayfa açılır.
        //Ödeme yöntemlerinden strip seçilir ve açılan sayfaya kredi kartı bilgileri girilir. Add cart butonuna basılır.

        JSUtilities.scrollToElement(Driver.getDriver(),userPage.stripeButonnu);
        ReusableMethods.wait(3);

        userPage.stripeButonnu.click();

        //Açılan sayfadan stripe seçili olduğu görülür ve place order butonuna basılır
        userPage.placeOrderButton.click();
        //sipariş durumunun görüntülendiği sayfa açılır.

        Assert.assertTrue(userPage.ConfirmyourOrder.isDisplayed());



    }

}


