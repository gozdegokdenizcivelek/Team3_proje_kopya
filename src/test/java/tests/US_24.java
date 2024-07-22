package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.merchantPage;
import utilities.*;

import java.util.List;


public class US_24 extends TestBaseRapor {

    @Test
    public void TC_24_001() {

        extentTest = extentReports.createTest("Mevcut kategorileri görüntüleme testi");

        merchantPage merchantPage = new merchantPage();

        //Restaurant yöneticisi browser açar
        //URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);

        // "Dashboard" menüsünün altındaki "Food" menüsüne tıklar
        merchantPage.foodMenu.click();

        // "Food" menüsüne tıkladıktan sonra açılan "Category" alt menüsüne tıklar
        merchantPage.categoryMenu.click();

        // Açılan sayfada kategori isimleri, görselleri ve detay bilgileri olduğunu kontrol eder
        boolean isCategoryPicDisplayed = merchantPage.orderListHeaderRow.get(0).isDisplayed();
        boolean isCategoryNameDisplayed = merchantPage.orderListHeaderRow.get(1).isDisplayed();
        boolean isCategoryActionDisplayed = merchantPage.orderListHeaderRow.get(2).isDisplayed();

        Assert.assertTrue(isCategoryNameDisplayed);
        Assert.assertTrue(isCategoryPicDisplayed);
        Assert.assertTrue(isCategoryActionDisplayed);

        // Sonraki Testin DÜzgün Çalışabilmesi İçin Çıkış Yapılmalı
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

        Driver.closeDriver();
    }

    @Test
    public void TC_24_002() {

        extentTest = extentReports.createTest("Yeni bir kategori ekleme ve eklendiğini kontrol  testi");

        // Restaurant yöneticisi browser açar
        // URL'e gider
        merchantPage merchantPage = new merchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);

        // "Dashboard" menüsünün altındaki "Food" menüsüne tıklar
        merchantPage.foodMenu.click();
        // "Food" menüsüne tıkladıktan sonra açılan "Category" alt menüsüne tıklar
        merchantPage.categoryMenu.click();
        // Açılan sayfada "Add New" butonuna tıklar
        merchantPage.addNewCategoryButton.click();
        // Açılan sayfada isim, açıklama gibi bilgilerin girilebileceği bir form olduğunu doğrular
        boolean isCategoryNameDisplayed = merchantPage.categoryNameTextBox.isDisplayed();
        boolean isCategoryDescriptionTextBoxDisplayed = merchantPage.categoryDescriptionTextBox.isDisplayed();
        boolean isFeaturedImageTextBoxDisplayed = merchantPage.featuredImageTextBox.isDisplayed();
        boolean isIconImageTextBoxDisplayed = merchantPage.iconImageTextBox.isDisplayed();

        Assert.assertTrue(isCategoryNameDisplayed);
        Assert.assertTrue(isCategoryDescriptionTextBoxDisplayed);
        Assert.assertTrue(isFeaturedImageTextBoxDisplayed);
        Assert.assertTrue(isIconImageTextBoxDisplayed);

        // Form doldurduktan sonra "Save" butonuna tıklar
        String expectedNewCategoryName = "Deneme123321";
        String expectedNewCategoryDescription = "DENEME123321123";
        merchantPage.categoryNameTextBox.sendKeys(expectedNewCategoryName);
        merchantPage.categoryDescriptionTextBox.sendKeys(expectedNewCategoryDescription);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(merchantPage.addNewCategorySaveButton).perform();

        merchantPage.addNewCategorySaveButton.click();

        // "Food" menüsüne tıkladıktan sonra açılan "Category" alt menüsüne tıklar
        merchantPage.dashboardNonActiveMenu.click();
        merchantPage.foodMenu.click();
        merchantPage.categoryMenu.click();

        // Eklemiş olduğu kategorinin listede olduğunu kontrol eder

        boolean isNewCategoryHere = false;

        for (int i = 0; i < merchantPage.categoryNameColoumn.size(); i++) {

            if (merchantPage.categoryNameColoumn.get(i).getText()
                    .contains(expectedNewCategoryName)) {
                isNewCategoryHere = true;
                break;
            }
        }

        Assert.assertTrue(isNewCategoryHere);

        // Sonraki Testin DÜzgün Çalışabilmesi İçin Çıkış Yapılmalı
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

        Driver.closeDriver();
    }

    @Test
    public void TC24_003() {

        extentTest = extentReports.createTest("Mevcut kategori güncelleme ve güncellendiğini kontrol testi ");


        Actions actions = new Actions(Driver.getDriver());

        // Restaurant yöneticisi browser açar
        // URL'e gider
        merchantPage merchantPage = new merchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);

        // "Dashboard" menüsünün altındaki "Food" menüsüne tıklar
        merchantPage.foodMenu.click();

        // "Food" menüsüne tıkladıktan sonra açılan "Category" alt menüsüne tıklar
        merchantPage.categoryMenu.click();

        // Açılan sayfadaki kategori isminin sağ tarafındaki "Update" butonuna basar
        merchantPage.categoryUpdateButtonColoumn.get(0).click();

        // Açılan sayfanın üst kısmında "Update Category" yazdığını kontrol eder
        Assert.assertTrue(merchantPage.updateCategoryLabel.isDisplayed());

        // "Name" kısmını verilen test datası yapar
        String expectedUpdatedCategoryName = "Update Test 123";
        merchantPage.categoryNameTextBox.clear();
        merchantPage.categoryNameTextBox.sendKeys(expectedUpdatedCategoryName);

        // "Save" butonuna tıklar

        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(2);
        merchantPage.updateSaveButton.click();
        // "Food" menüsüne tıkladıktan sonra açılan "Category" alt menüsüne tıklar
        merchantPage.dashboardNonActiveMenu.click();
        merchantPage.foodMenu.click();
        merchantPage.categoryMenu.click();

        // İşlem yaptığı kategorinin isminin değişmiş olduğunu kontrol eder
        Assert.assertTrue(merchantPage.categoryNameColoumn.get(0).getText().contains(expectedUpdatedCategoryName));

        // Sonraki Testin DÜzgün Çalışabilmesi İçin Çıkış Yapılmalı
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

        Driver.closeDriver();
    }

    @Test
    public void TC24_004() {

        extentTest = extentReports.createTest("Mevcut kategori silme ve sildiğini kontrol testi ");

        // Restaurant yöneticisi browser açar
        // URL'e gider
        merchantPage merchantPage = new merchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);

        // "Dashboard" menüsünün altındaki "Food" menüsüne tıklar
        merchantPage.foodMenu.click();

        // "Food" menüsüne tıkladıktan sonra açılan "Category" alt menüsüne tıklar
        merchantPage.categoryMenu.click();

        int mevcutKategoriSayisi = merchantPage.categoryNameColoumn.size();

        // Açılan sayfadaki kategori isminin sağ tarafındaki "Delete" butonuna basar
        merchantPage.categoryDeleteButtonColoumn.get(0).click();
        ReusableMethods.wait(2);

        // Açılan pop-up'da "Delete" butonuna basar
        // merchantPage.deleteOnayKabulButton.click();
        ReusableMethods.waitAndClick(merchantPage.deleteOnayKabulButton);


        // "Food" menüsüne tıkladıktan sonra açılan "Category" alt menüsüne tıklar
        merchantPage.dashboardNonActiveMenu.click();
        merchantPage.foodMenu.click();
        merchantPage.categoryMenu.click();

        // İşlem yaptığı kategorinin isminin kategori listesinde olmadığını kontrol eder
        Assert.assertTrue(merchantPage.categoryNameColoumn.size() + 1 == mevcutKategoriSayisi);

        // Sonraki Testin DÜzgün Çalışabilmesi İçin Çıkış Yapılmalı
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();
        Driver.closeDriver();
    }

    @Test
    public void TC24_005() {

        extentTest = extentReports.createTest("Mevcut kategori arama testi");

        // Restaurant yöneticisi browser açar
        // URL'e gider
        merchantPage merchantPage = new merchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);

        // "Dashboard" menüsünün altındaki "Food" menüsüne tıklar
        merchantPage.foodMenu.click();

        // "Food" menüsüne tıkladıktan sonra açılan "Category" alt menüsüne tıklar
        merchantPage.categoryMenu.click();

        // Sağ üst köşedeki searchBox' a istenen kategori ismini yazıp Enter' a basar
        String expectedCategoryName = "WHOPPER";
        merchantPage.categorySearchBox.sendKeys(expectedCategoryName + Keys.ENTER);
        ReusableMethods.wait(2);
        List<WebElement> aramaSonrasıMenuSayisi = Driver.getDriver().findElements(By.xpath("//td[2]"));


        // Gelen sayfadaki kategorinin aradığı kategori olduğunu doğrular

        boolean arananKategoriVarMi = false;

        for (int i = 0; i < aramaSonrasıMenuSayisi.size(); i++) {

            if (aramaSonrasıMenuSayisi.get(i).getText().contains(expectedCategoryName)) {
                arananKategoriVarMi = true;
            }
        }

        Assert.assertTrue(arananKategoriVarMi);

        // Sonraki Testin DÜzgün Çalışabilmesi İçin Çıkış Yapılmalı
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

        Driver.closeDriver();
    }
}
