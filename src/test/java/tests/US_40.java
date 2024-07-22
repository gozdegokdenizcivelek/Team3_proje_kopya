package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.adminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;



public class US_40 extends TestBaseRapor {

    @Test
    public void KuponOluşturabilmeListelemeUpdateEdebilmeSilebilmeTesti (){
     // extentTest = extentReports.createTest("KuponOluşturabilmeListelemeUpdateEdebilmeSilebilmeTesti");
      adminPage adminPage=new adminPage();
        //Admin URL' yi girer . Kullanıcı adını ve parolasını girer dashboarda erişim sağlar.
        Driver.getDriver().get("https://qa.flavorfetch.com/backoffice/login");
        Actions actions=new Actions(Driver.getDriver());

        actions.click(adminPage.UserNameTextBox).sendKeys(ConfigReader.getProperty("adminuser_mahmut")).sendKeys(Keys.TAB)

                .sendKeys(ConfigReader.getProperty("adminPassword")).perform();

                     actions.click(adminPage.SignInButton).perform();


                     //Menüdeki Promo kısmından Coupon List sayfasına ulaşabilir.
        Driver.getDriver().findElement(By.xpath("//*[@class='promo']")).click();

        actions.click(adminPage.CouponLink).perform();
        ReusableMethods.wait(3);
        //Coupon List sayfasında Add New butonuna tıklar
        actions.click(adminPage.AddNewButton).perform();
        //Coupon için gerekli bilgileri girdikten sonra Save Tuşuna basar.
        Faker faker=new Faker();
        actions.click(adminPage.CouponNameTextBox).sendKeys(faker.name().name()).perform();
        Select select=new Select(adminPage.DropdownCouponType);
       // ReusableMethods.wait(3);
        select.selectByValue("percentage");
        //ReusableMethods.wait(3);
        actions.click(adminPage.AmountTextBox).sendKeys("10").
                sendKeys(Keys.TAB).
                sendKeys("21").perform();
        Select select1=new Select(adminPage.DropDownDaysAvalable);
        select1.selectByIndex(2);

        //Select select2=new Select(adminPage.DropDownApplicableToMerchant);
       // select2.selectByVisibleText("Krispy Kreme");

        //Driver.getDriver().findElement(By.xpath("(//td[@class='available'])[2]")).click();
        //ReusableMethods.wait(3);






        //Coupounu nu kaydeden admin Coupon List sayfasında couponu listeler.
        //Listede kendi kuponunu gören admin Update veya Delete tuşlarına basar
        //Couponunu Update ettikten sonra değişikliklerin eklendiğini veya çıkarıldığını listeden kontrol eder.
        //Couponunu silen admin couponun silindiğini ve listede artık olmadığını görür.

        Driver.getDriver().quit();

    }
}
