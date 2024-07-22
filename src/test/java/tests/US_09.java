package tests;


import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_09 extends TestBaseRapor {


    userPage userPage = new userPage();

    @Test
    public void TC_01(){
        extentTest = extentReports.createTest("Privacy Policy access and content test");
        //User opens browser and accesses to the page with the url
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        //User confirms the privacy policy link is visible
        Assert.assertTrue(userPage.termsAndConditionsButton.isDisplayed());

        /*User clicks the privacy policy link and accesses to the page.
        User confirms the content of the privacy policy page
        (type of info collected, how its used, disclosure, security and contact us) is displayed correctly. */
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(userPage.termsAndConditionsButton).perform();
        ReusableMethods.wait(1);
        userPage.termsAndConditionsButton.click();

        Assert.assertTrue(userPage.termsAndConditionsContentText.isDisplayed());

        Driver.closeDriver();



    }

}
