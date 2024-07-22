package tests;

import org.testng.annotations.Test;
import pages.adminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_39 extends TestBaseRapor {
    adminPage adminPage = new adminPage();


    @Test
    public void TC_01(){
        extentTest = extentReports.createTest("Admin - merchant earnings page test");

        //User opens browser and accesses to the page with the url
        Driver.getDriver().get(ConfigReader.getProperty("admin_Url"));
        adminPage.UserNameTextBox.sendKeys(ConfigReader.getProperty("adminuser_emrah"));
        adminPage.PasswordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminPage.SignInButton.click();

        //User logs in with username and password
        adminPage.UserNameTextBox.sendKeys(ConfigReader.getProperty("adminuser_emrah"));
        adminPage.PasswordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminPage.SignInButton.click();

        //From left side menu, user navigates and clicks Earnings-->Merchant Earnings and confirms access.

        //User confirms the merchants are displayed in table format,
        //and clicks on the "Merchant" on  the table headear and confirms the merchants are listed in order.

        //User clicks on "Balance" on the table header and confirms merchants are sorted by the balance.

        //User clicks on search box and types in merchant name and confirms in comes up as a result

        Driver.closeDriver();

    }

    @Test
    public void TC_02(){
        //User opens browser and accesses to the page with the url
        Driver.getDriver().get(ConfigReader.getProperty("admin_Url"));

        //User logs in with username and password

        //From left side menu, user navigates and clicks Earnings-->Merchant Earnings and confirms access.

        //User clicks on the create transaction button and selects adjustment from the dropdown menu.

        //User fills the form and clicks submit

        //User clicks on the eye icon for the team3 restaurant on the list and confirms adjustment is there.

        Driver.closeDriver();
    }
}
