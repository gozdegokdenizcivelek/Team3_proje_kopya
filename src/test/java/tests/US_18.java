package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import utilities.*;

public class US_18 extends TestBaseRapor {
    @Test
    public void TC18_001() {
        //Kullanıcı browser açar
        //URL'e gider

        extentTest = extentReports.createTest("Boş Saved Stores sayfası görünürlük ve sayfa yapısı kontrol testi");

        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        //Ana sayfada sağ üst köşedeki sign in butonuna tıklar
        userPage userPage = new userPage();

        userPage.userSignInBotten.click();

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        userPage.userNameTextBox.sendKeys(ConfigReader.getProperty("customeruser_burhan"));
        userPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty("customerPassword"));
        userPage.userGirisBotten.click();
        ReusableMethods.wait(2);

        //Ana sayfada sağ üst köşedeki profil menüsünde "Saved Store" olduğunu doğrular
        userPage.userDropDownMenu.click();

        String expectedLabel = "Saved Stores";
        String actualLabel = JSUtilities.getTextWithJS(Driver.getDriver(), userPage.userSavedStore).trim();

        Assert.assertEquals(actualLabel, expectedLabel);

        //"Saved Store" 'a tıklayıp sayfaya gider.
        userPage.userSavedStore.click();

        //Sayfada restaurant bilgisi olmadığını doğrular
        Assert.assertTrue(userPage.noShopOnSavedStoreLabel.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void TC18_002() {

        extentTest = extentReports.createTest("Restoranları Saved Stores sayfasına ekleme  ve sayfa yapısı kontrol testi");

        //Kullanıcı browser açar
        //URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        //Ana sayfada sağ üst köşedeki sign in butonuna tıklar
        userPage userPage = new userPage();

        userPage.userSignInBotten.click();

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        userPage.userNameTextBox.sendKeys(ConfigReader.getProperty("customeruser_burhan"));
        userPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty("customerPassword"));
        userPage.userGirisBotten.click();
        ReusableMethods.wait(2);
        // The Oceanaire Seafood Room Restoranına gider

        JSUtilities.scrollToElement(Driver.getDriver(), userPage.oceanaireShopLink);
        ReusableMethods.wait(2);

        userPage.oceanaireShopLink.click();

        // Açılan sayfada "Save store" yazısının üzerindeki kalp işaretine tıklar
        userPage.saveShoptoSavedStores.click();
        ReusableMethods.wait(1);

        // Sayfanın sağ üst köşesindeki profil menüsünden "Saved Stores" sayfasına gider
        userPage.userDropDownMenu.click();
        userPage.userSavedStore.click();

        // Sayfada beğendiği restorantın listelendiğini kontrol eder


        boolean isShopHere = false;

        for (int i = 0; i < userPage.savedShopNameList.size(); i++) {
            String expectedShopName = "The Oceanaire Seafood Room";

            if (userPage.savedShopNameList.get(i).getText().contains(expectedShopName)) {
                isShopHere = true;
                break;
            }
        }

        String expectedShopName = "The Oceanaire Seafood Room";

        Assert.assertTrue(isShopHere);

        // Listedeki restorana tıklayarak restorantın sayfasına gider

        userPage.savedShopList.get(0).click();
        // Gidilen sayfanın listeye eklenen restorantın aynısı olduğunu kontrol eder

        String actualShopName = userPage.shopName.getText();
        Assert.assertEquals(actualShopName, expectedShopName);

        Driver.closeDriver();
    }

    @Test
    public void TC18_003() {

        extentTest = extentReports.createTest("Restoranları Saved Stores sayfasından kaldırma testi");

        //Kullanıcı browser açar
        //URL'e gider
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        //Ana sayfada sağ üst köşedeki sign in butonuna tıklar
        userPage userPage = new userPage();

        userPage.userSignInBotten.click();

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        userPage.userNameTextBox.sendKeys(ConfigReader.getProperty("customeruser_burhan"));
        userPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty("customerPassword"));
        userPage.userGirisBotten.click();
        ReusableMethods.wait(2);
        // The Oceanaire Seafood Room Restoranına gider

        JSUtilities.scrollToElement(Driver.getDriver(), userPage.oceanaireShopLink);
        ReusableMethods.wait(2);

        userPage.oceanaireShopLink.click();

        // Açılan sayfada "Save store" yazısının üzerindeki kalp işaretine tıklar
        userPage.removeShoptoSavedStore.click();

        // Sayfanın sağ üst köşesindeki profil menüsünden "Saved Stores" sayfasına gider
        userPage.userDropDownMenu.click();
        userPage.userSavedStore.click();

        // Sayfada beğendiği restorantın listelendiğini kontrol eder

        String expectedShopName = "The Oceanaire Seafood Room";

        boolean isShopHere = false;

        for (int i = 0; i < userPage.savedShopNameList.size(); i++) {

            if (userPage.savedShopNameList.get(i).getText().contains(expectedShopName)) {
                isShopHere = true;
                break;
            }
        }

        Assert.assertTrue(!isShopHere);

    }
}
