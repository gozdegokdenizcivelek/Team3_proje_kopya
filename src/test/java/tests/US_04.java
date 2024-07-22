package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

@Test
public class US_04 extends TestBaseRapor {
    public void TC_0401(){
        extentTest = extentReports.createTest("Sub - Footer visibility test");
        /*
            Kullanici browser acar.
            Url'i girer.
            Anasayfaya erisim saglandigini dogrular.
            Sub - footer bölümünün görünür olduğunu doğrular.
            Sayfayi kapatir.
        */
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(userPage.SubFooterLogo.isDisplayed());
        ReusableMethods.wait(2);
        Driver.closeDriver();
    }

    public void TC_0402(){
        extentTest = extentReports.createTest("Footer visibility test");
        /*
            Kullanici browser acar.
            Url'i girer.
            Anasayfaya erisim saglandigini dogrular.
            Footerin görünür olduğunu doğrular.
            Sayfayi kapatir.
        */
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(userPage.Footer.isDisplayed());
        ReusableMethods.wait(2);
        Driver.closeDriver();
    }
    @Test
    public void TC_0403(){
        extentTest = extentReports.createTest("Store images test");
        /*
                Kullanici browser acar.
                Url'i girer.
                Anasayfaya erisim saglandigini dogrular.
                AppStore market ikonunun görünür olduğunu doğrular.
                AppStore ikonu kliklenince market bölümüne gidebildiğini doğrular.
                GooglePlay market ikonunun görünür olduğunu doğrular.
                AppStore ikonu kliklenince market bölümüne gidebildiğini doğrular.
                Sayfayi kapatir.
        */
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();

        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(2);

        Assert.assertTrue(userPage.AppStoreLogoonFooter.isDisplayed());
        ReusableMethods.wait(2);

        Actions actions = new Actions(Driver.getDriver());
        actions.click(userPage.AppStoreLogoonFooter).perform();

        Assert.assertTrue(userPage.LogoOnAppleStoreWebsite.isDisplayed());
        ReusableMethods.wait(2);

        Driver.getDriver().navigate().back();

        Assert.assertTrue(userPage.GooglePlayLogoOnFooter.isDisplayed());
        ReusableMethods.wait(2);
        actions.click(userPage.GooglePlayLogoOnFooter).perform();

        Assert.assertTrue(userPage.HeaderOnGooglePlayWebsite.isDisplayed());
        ReusableMethods.wait(2);
        Driver.getDriver().navigate().back();
        Driver.closeDriver();

    }

    @Test
    public void TC_0404() {
        extentTest = extentReports.createTest("flavorfetch.com url test in footer section");
        /*
            Kullanici browser acar.
            Url'i girer.
            Anasayfaya erisim saglandigini dogrular.
            Footer bölümünün anasayfada görünürlüğünü doğrular.
            flavorfetch.com linkinin tıklanabilir ve anasayfaya tekrar yönlendirildiğini doğrular.
            Sayfayi kapatir.
        */


        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();

        Assert.assertTrue(userPage.headerLogo.isDisplayed());

        ReusableMethods.wait(2);

        // Footer bölümünün anasayfada görünürlüğünü doğrula
        Assert.assertTrue(userPage.Footer.isDisplayed());

        // Kısa bir bekleme süresi ekle
        ReusableMethods.wait(2);

        // Sayfanın belirli bir elemente kadar kaydırılması
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", userPage.WebSiteUrlOnFooter);

        Assert.assertTrue(userPage.WebSiteUrlOnFooter.isEnabled() && userPage.WebSiteUrlOnFooter.isDisplayed(), "Link tıklanabilir değil");

        Actions actions = new Actions(Driver.getDriver());
        actions.click(userPage.WebSiteUrlOnFooter).perform();

        ReusableMethods.wait(3);

        // Anasayfaya yönlendirildiğini doğrula
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.flavorfetch.com/";
        Assert.assertEquals(actualUrl, expectedUrl, "Anasayfaya geri yönlendirilmedi");

        Driver.closeDriver();
    }


    @Test
    public void TC_0405() {
        extentTest = extentReports.createTest("Contact us text link test");
//Contact us   linkinin tıklanabilir ve ilgili sayfaya gidebildiğini doğrular
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();

        //Anasayfaya erisim saglandigini dogrular.
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(2);

        // Sayfanın contact us'a  kadar kaydırılması
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", userPage.SubFooterLogo);

        // SubFooter bölümünün anasayfada görünürlüğünü doğrula
        Assert.assertTrue(userPage.SubFooterLogo.isDisplayed());

        // Kısa bir bekleme süresi ekle
        ReusableMethods.wait(2);

        // Contact us linkinin tıklanabilir ve ilgili sayfaya gidebildiğini doğrular

        Assert.assertTrue(userPage.ContactUs.isEnabled() && userPage.ContactUs.isDisplayed());

        Actions actions = new Actions(Driver.getDriver());
        actions.click(userPage.ContactUs).perform();

        ReusableMethods.wait(3);

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.flavorfetch.com/contactus";
        Assert.assertEquals(actualUrl, expectedUrl, "Contact Us sayfasina gitmedi");

        Driver.closeDriver();
    }


    public void TC_0406() {
        extentTest = extentReports.createTest("Terms and conditions text link test");
//Terms and conditions  linkinin tıklanabilir ve ilgili sayfaya gidebildiğini doğrular
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();

        //Anasayfaya erisim saglandigini dogrular.
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(2);

        // Sayfanın contact us'a  kadar kaydırılması
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", userPage.SubFooterLogo);

        // SubFooter bölümünün anasayfada görünürlüğünü doğrula
        Assert.assertTrue(userPage.SubFooterLogo.isDisplayed());

        // Kısa bir bekleme süresi ekle
        ReusableMethods.wait(2);

        //Terms and conditions  linkinin tıklanabilir ve ilgili sayfaya gidebildiğini doğrular

        Assert.assertTrue(userPage.TermsAndConditions.isEnabled()
                && userPage.TermsAndConditions.isDisplayed());

        Actions actions = new Actions(Driver.getDriver());
        actions.click(userPage.TermsAndConditions).perform();

        ReusableMethods.wait(3);

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.flavorfetch.com/terms-and-conditions";
        Assert.assertEquals(actualUrl,expectedUrl);
        ReusableMethods.wait(2);
        Driver.getDriver().navigate().back();
        Driver.closeDriver();
    }


    public void TC_0407() {
        extentTest = extentReports.createTest("Privacy policy  text link test");
//Privacy policy linkinin tıklanabilir ve ilgili sayfaya gidebildiğini doğrular
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();

        //Anasayfaya erisim saglandigini dogrular.
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(2);

        // Sayfanın contact us'a  kadar kaydırılması
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", userPage.SubFooterLogo);

        // SubFooter bölümünün anasayfada görünürlüğünü doğrula
        Assert.assertTrue(userPage.SubFooterLogo.isDisplayed());

        // Kısa bir bekleme süresi ekle
        ReusableMethods.wait(2);

        //Privacy policy linkinin tıklanabilir ve ilgili sayfaya gidebildiğini doğrular

        Assert.assertTrue(userPage.PrivacyPolicy.isEnabled()
                && userPage.PrivacyPolicy.isDisplayed());

        Actions actions = new Actions(Driver.getDriver());
        actions.click(userPage.PrivacyPolicy).perform();

        ReusableMethods.wait(3);

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.flavorfetch.com/privacy-policy";
        Assert.assertEquals(actualUrl,expectedUrl);
        ReusableMethods.wait(2);
        Driver.getDriver().navigate().back();
        Driver.closeDriver();
    }

    public void TC_0408() {
        extentTest = extentReports.createTest("Become a Partner  text link test");
       //Become a Partner  linkinin tıklanabilir ve ilgili sayfaya gidebildiğini doğrular
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();

        //Anasayfaya erisim saglandigini dogrular.
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(2);

        // Sayfanın contact us'a  kadar kaydırılması
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", userPage.SubFooterLogo);

        // SubFooter bölümünün anasayfada görünürlüğünü doğrula
        Assert.assertTrue(userPage.SubFooterLogo.isDisplayed());

        // Kısa bir bekleme süresi ekle
        ReusableMethods.wait(2);

        //Become a Partner  linkinin tıklanabilir ve ilgili sayfaya gidebildiğini doğrular

        Assert.assertTrue(userPage.BecomePartner.isEnabled()
                && userPage.BecomePartner.isDisplayed());

        Actions actions = new Actions(Driver.getDriver());
        actions.click(userPage.BecomePartner).perform();

        ReusableMethods.wait(3);

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.flavorfetch.com/merchant/signup";
        Assert.assertEquals(actualUrl,expectedUrl);
        ReusableMethods.wait(2);
        Driver.getDriver().navigate().back();
        Driver.closeDriver();
    }

    @Test
    public void TC_0409() {
        extentTest = extentReports.createTest("Blog section test");

        /*footer bolumunde bloglarin testi */
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();

        // Anasayfaya erisim saglandigini dogrular.
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(2);

        // Sayfanın contact us'a kadar kaydırılması
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", userPage.SubFooterLogo);

        // SubFooter bölümünün anasayfada görünürlüğünü doğrula
        Assert.assertTrue(userPage.SubFooterLogo.isDisplayed());

        // Kısa bir bekleme süresi ekle
        ReusableMethods.wait(2);

        // Blog linklerinin tıklanabilir ve ilgili sayfaya gidebildiğini doğrular
        Assert.assertTrue(userPage.SocialSideBlog.isEnabled() && userPage.SocialSideBlog.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(userPage.ExploringBlog.isEnabled() && userPage.ExploringBlog.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(userPage.EmbranceBlog.isEnabled() && userPage.EmbranceBlog.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(userPage.NourishingBlog.isEnabled() && userPage.NourishingBlog.isDisplayed());

        Actions actions = new Actions(Driver.getDriver());
        actions.click(userPage.CookieAcceptButton).perform();
        ReusableMethods.wait(2);
        actions.click(userPage.EmbranceBlog).perform();
        ReusableMethods.wait(5);

        // İlgili sayfada BlogDivH elemanının görünürlüğünü doğrula
        Assert.assertTrue(userPage.EmbranceBlogOnBlogText.isDisplayed());

        // Geri navigasyon sonrası kısa bir bekleme süresi ekle
        Driver.getDriver().navigate().back();
        // Driver'ı kapat
        Driver.closeDriver();
    }
    @Test
    public void TC_0410() {
        extentTest = extentReports.createTest("Social media icons test");
        // KULLANICI FOOTER BOLUMUNDE SOSYAL MEDIA IKONLARI TESTI
    /*
        Kullanici browser acar.
        Url'i girer.
        Anasayfaya erisim saglandigini dogrular.
        Footer bölümünün anasayfada görünürlüğünü doğrular
        Facebook ikonunun tıklanabilir ve ilgili sayfaya gidebildiğini doğrular
        Instagram ikonunun tıklanabilir ve ilgili sayfaya gidebildiğini doğrular
        Linkedin ikonunun tıklanabilir ve ilgili sayfaya gidebildiğini doğrular
        Twitter ikonunun tıklanabilir ve ilgili sayfaya gidebildiğini doğrular
        YouTube ikonunun tıklanabilir ve ilgili sayfaya gidebildiğini doğrular
        Sayfayi kapatir.
    */
        /*footer bolumunde bloglarin testi */
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();
        Actions actions = new Actions(Driver.getDriver());

        // Anasayfaya erisim saglandigini dogrular.
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(2);

        // Sayfanın contact us'a kadar kaydırılması
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", userPage.SubFooterLogo);

        // SubFooter bölümünün anasayfada görünürlüğünü doğrula
        Assert.assertTrue(userPage.SubFooterLogo.isDisplayed());

        // Kısa bir bekleme süresi ekle
        ReusableMethods.wait(2);

        // SOSYAL MEDIA IKONLARI linklerinin tıklanabilir ve ilgili sayfaya gidebildiğini doğrular
        Assert.assertTrue(userPage.FacebookOnFooter.isEnabled());
        ReusableMethods.wait(1);

        // Facebook ikonuna tıkla ve yeni sekmeye geç
        actions.click(userPage.FacebookOnFooter).perform();
        ReusableMethods.wait(2);

        // Ana pencerenin tutamaçını al
        String mainWindowHandle = Driver.getDriver().getWindowHandle();

        // Facebook sekmesine geç
        String facebookWindowHandle = ReusableMethods.switchToWindowByUrl("facebook.com");

        // Facebook URL'inin doğru olduğunu doğrula
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.facebook.com/";
        ReusableMethods.wait(1);
        Assert.assertEquals(actualURL, expectedURL);

        // Facebook sekmesini kapat ve ana sekmeye geri dön
        Driver.getDriver().close();
        ReusableMethods.switchToMainWindow(mainWindowHandle);

        // Driver'ı kapat
        Driver.closeDriver();
    }

    @Test
    public void TC_0411() {
        extentTest = extentReports.createTest("© Flavor Fetch Corp. 2023 text test");
    /*
         Footer bolumunde © Flavor Fetch Corp. 2023 gorunur oldugunu Testi
    */
        //Kullanici browser acar.
        //Url'i girer.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        userPage userPage = new userPage();
        Actions actions = new Actions(Driver.getDriver());

        // Anasayfaya erisim saglandigini dogrular.
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(2);

        // Sayfanın contact us'a kadar kaydırılması
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", userPage.SubFooterLogo);

        //Footer bölümünün anasayfada görünürlüğünü doğrular
        Assert.assertTrue(userPage.Footer.isDisplayed());

        //© Flavor Fetch Corp. 2023 yazısının görünür olduğunu doğrular
        Assert.assertTrue(userPage.FooterFetchCorp2023.isDisplayed());
        //Sayfayi kapatir.
        Driver.closeDriver();
    }

}

