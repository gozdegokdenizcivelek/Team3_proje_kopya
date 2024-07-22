package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.merchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_27 extends TestBaseRapor {



    @Test
    public void TC_01(){
        extentTest = extentReports.createTest("Merchant food - items access and sort test");
        merchantPage merchantPage = new merchantPage();
        
        //User opens browser and confirms access to the merchant login page with the url
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        //User logs in with username and password
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();

        //From left side menu, user navigates and clicks Food-->Items, and confirms access
        merchantPage.foodMenu.click();
        merchantPage.itemsMenu.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl() , "https://qa.flavorfetch.com/backoffice/food/items");

        //User sees all the items in a list format,
        Assert.assertFalse(merchantPage.itemsNameColoumn.isEmpty());

        // and sorts them with table headers(Availability, Name),
        Assert.assertTrue(merchantPage.itemsListHeaderRow.get(2).isEnabled());

        //User confirms Search box is active and can search for items.
        ReusableMethods.wait(2);
        System.out.println();
        merchantPage.foodItemsSearchBox.sendKeys("Iskender" + Keys.ENTER);

        Assert.assertTrue(ReusableMethods.waitAndGetText(merchantPage.itemsNameColoumn.get(0), 1).contains("Iskender"));

        Driver.closeDriver();
    }


}
