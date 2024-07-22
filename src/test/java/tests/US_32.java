package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.merchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_32 extends TestBaseRapor {


    //@Test
    //public void TC_01(){   Diger test caselerin icerisinde zaten yapiliyor, o yuzden yapmiyorum

        //User opens browser and confirms access to the merchant login page with the url


        //User logs in with username and password


        //From left side menu, user navigates and clicks Attributes-->Size,
        // Ingredients and cooking reference seperately and confirms access to all of them.


    //}

    @Test
    public void TC_02(){
        extentTest = extentReports.createTest("Merchant attributes - size page test");
        merchantPage merchantPage = new merchantPage();

        //User opens browser and confirms access to the merchant login page with the url
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));

        //User logs in with username and password
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();

        //From left side menu, user navigates and clicks Attributes-->Size and confirms access.
        merchantPage.attributesMenu.click();
        merchantPage.attSizeMenu.click();
        Assert.assertTrue(merchantPage.attSizeActionsTableHead.isDisplayed());

        //User clicks to add new button
        merchantPage.attSizeMenuAddNewButton.click();

        //User fills the form with attribute name and status.
        Driver.getDriver().findElement(By.xpath("//*[@name='AR_size[size_name]']"))
                .sendKeys(ConfigReader.getProperty("sizeName"));
        Driver.getDriver().findElement(By.xpath("//*[@value='Save']")).click();

        //From left side menu, user navigates to the attribute and confirms it is added
        merchantPage.attSizeMenu.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//td[h6])[1]"))
                .getText().contains(ConfigReader.getProperty("sizeName")));

        //User click delete attribute button and confirms the action
        merchantPage.attSizeDeleteButtons.get(0).click();
        ReusableMethods.wait(2);
        merchantPage.attDeleteConfirm.click();

        //From left side menu, user navigates to the attribute and confirms it is deleted
        merchantPage.attSizeMenu.click();
        Assert.assertFalse(Driver.getDriver().findElement(By.xpath("(//td[h6])[1]"))
                .getText().contains(ConfigReader.getProperty("sizeName")));


        Driver.closeDriver();
    }

    @Test
    public void TC_03() {
        extentTest = extentReports.createTest("Merchant attributes - Ingredients page test");
        merchantPage merchantPage = new merchantPage();

        //User opens browser and confirms access to the merchant login page with the url
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        //User logs in with username and password
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //From left side menu, user navigates and clicks Attributes-->Ingredients and confirms access.
        merchantPage.attributesMenu.click();
        merchantPage.attIngredientsMenu.click();
        Assert.assertTrue(merchantPage.attIngredientsActionsTableHead.isDisplayed());

        //User clicks to add new button
        merchantPage.attIngredientsMenuAddNewButton.click();

        //User fills the form with attribute name
        Driver.getDriver().findElement(By.xpath("//*[@name='AR_ingredients[ingredients_name]']"))
                .sendKeys(ConfigReader.getProperty("ingredientName"));
        Driver.getDriver().findElement(By.xpath("//*[@value='Save']")).click();
        ReusableMethods.wait(2);

        //From left side menu, user navigates to the attribute and confirms it is added
        merchantPage.attIngredientsMenu.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//td[h6])[1]"))
                .getText().contains(ConfigReader.getProperty("ingredientName")));

        //User click delete attribute button and confirms the action
        merchantPage.attIngredientsDeleteButtons.get(0).click();
        ReusableMethods.wait(2);
        merchantPage.attDeleteConfirm.click();

        //From left side menu, user navigates to the attribute and confirms it is deleted
        merchantPage.attIngredientsMenu.click();
        Assert.assertFalse(Driver.getDriver().findElement(By.xpath("(//td[h6])[1]"))
                .getText().contains(ConfigReader.getProperty("ingredientName")));

        Driver.closeDriver();
    }

    @Test
    public void TC_04() {
        extentTest = extentReports.createTest("Merchant attributes - Cooking Reference page test");
        merchantPage merchantPage = new merchantPage();

        //User opens browser and confirms access to the merchant login page with the url
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        //User logs in with username and password
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //From left side menu, user navigates and clicks Attributes-->Cooking reference and confirms access.
        merchantPage.attributesMenu.click();
        merchantPage.attCookingReferenceMenu.click();
        Assert.assertTrue(merchantPage.attCookRefActionsTableHead.isDisplayed());

        //User clicks to add new button
        merchantPage.attCookRefMenuAddNewButton.click();

        //User fills the form with attribute name and status.
        Driver.getDriver().findElement(By.xpath("//*[@name='AR_cookingref[cooking_name]']"))
                .sendKeys(ConfigReader.getProperty("cookingReferenceName"));
        Driver.getDriver().findElement(By.xpath("//*[@value='Save']")).click();
        ReusableMethods.wait(1);

        //From left side menu, user navigates to the attribute and confirms it is added
        merchantPage.attCookingReferenceMenu.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//td[h6])[1]"))
                .getText().contains(ConfigReader.getProperty("cookingReferenceName")));

        //User clicks delete attribute button and confirms the action
        merchantPage.attCookRefDeleteButtons.get(0).click();
        ReusableMethods.wait(2);
        merchantPage.attDeleteConfirm.click();

        //From left side menu, user navigates to the attribute and confirms it is deleted
        merchantPage.attCookingReferenceMenu.click();
        Assert.assertFalse(Driver.getDriver().findElement(By.xpath("(//td[h6])[1]"))
                .getText().contains(ConfigReader.getProperty("cookingReferenceName")));

        Driver.closeDriver();
    }
}
