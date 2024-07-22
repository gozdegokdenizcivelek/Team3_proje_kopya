package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.adminPage;
import pages.merchantPage;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class E2E_Test {

    @Test
    public void E2E_test(){

        userPage userPage = new userPage();
        merchantPage merchantPage = new merchantPage();

        //Suite1
        //Loksayon Girerek Restoran görüntüleme
        //Kullanıcı siteye giriş yapar.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        //Lokasyon bölümüne California girer.
        //Lokasyona görerestoranlar sayfası görüntülenir.
        userPage.anasayfaLokasyonAramaKutusu.sendKeys("California");
        ReusableMethods.wait(3);
        userPage.ListedDeliveryAdress.click();

        //Suite2 Filtreleme Fonksiyonuyla Restoran Seçimi
        //Filter kısmından "Most Popular" ı seçer.
        //Cuisines bölümünden Fast Food u seçer.
        userPage.MostPopular.click();
        ReusableMethods.wait(3);
        userPage.FasFood.click();
        ReusableMethods.wait(3);
        //Team 03 Restoranı seçer
        userPage.Team3Restaurant.click();

        //US 11 - TC 18
        //Suite3 Seçilen Restorandan Yemek Seçimi ve sepete ekleme
        //Açılan restoran sayfasından Iskender isimli yemeğe gelir, add to cart butonuna tıklar.
        ReusableMethods.wait(4);
        userPage.iskenderAddToCart.click();
        ReusableMethods.wait(3);

        //Açılan ekrandan adet sayısını artırarak 5 yapar.
        for (int i = 1; i < 5; i++) {
            userPage.adetArttir.click();
            ReusableMethods.wait(1);
        }
        ReusableMethods.wait(3);

        //Tekrardan add to cart butonuna tıklar.
        userPage.AddToCardOnOpenedModal.click();
        //Açılan sayfada checkout butonuna tıklar
        ReusableMethods.wait(4);
        userPage.checkoutbutonu.click();
        ReusableMethods.wait(4);

        //
        //Suite4 Login
        //Acilan Login sayfasinda bilgileriyle giris yapar
        userPage.userNameTextBox.sendKeys(ConfigReader.getProperty("customeruser_emrah"));
        ReusableMethods.wait(3);
        userPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty("customerPassword")+ Keys.ENTER);
        ReusableMethods.wait(4);


        //Suite5 Sipariş verme
        //Açılan sayfada kayıtlı olduğu bilgiler görünür.
        Assert.assertEquals(userPage.userPhoneNumber.getText(), ConfigReader.getProperty("userPhoneNumber"));

        //Kayıtlı bilgileriyle sağ kısımda place order butonuna tıklar.
        userPage.placeOrderButton.click();
        ReusableMethods.wait(5);

        //Sipariş durumunu göreceği sayfa görüntülenir
        Assert.assertTrue(userPage.ConfirmyourOrder.isDisplayed());
        String OrderID = userPage.confirmedOrderID.getText();
        ReusableMethods.wait(5);

        //Suite6 Sipariş Kontrolü
        //Kullanıcı sağ üstte profil ismine tıklar.
        userPage.userDropDownMenu.click();
        ReusableMethods.wait(4);

        //Açılan drop-down menüden My Orders bölümüne tıklar.
        userPage.userDropdownMyOrders.click();
        System.out.println(userPage.userOrderID1.getText());
        ReusableMethods.wait(4);

        //Açılan Sayfadaki Siparişler listesinden en son vermiş olduğu en üstteki siparişi gelir.
        Assert.assertTrue(userPage.userOrderID1.getText().contains(OrderID));

        //Detayları kontrol etmek için siparişin en sağında buluna üç noktaya tıklar ve
        //view bölümüne tıklayarak detayları görüntüler.
        userPage.userOrdersUcNokta.click();
        ReusableMethods.wait(3);
        userPage.userOrdersView.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(userPage.viewOrderDetailsOrderID.getText()
                .contains(OrderID));


        //Suite7 Sipariş iptali

        //Kullanici adet arttirmak ister
        //Order details menusunu kapatmak icin kosedeki X isaretine basar.
        userPage.viewOrderDetailsCloseButton.click();
        ReusableMethods.wait(4);

        // sipariş sağındaki üç noktaya tıklayarak açılan menüden cancel order'a tıklar.
        userPage.userOrdersUcNokta.click();
        ReusableMethods.wait(4);
        userPage.userDropdownCancelOrders.click();
        ReusableMethods.wait(4);


        //Açılan "Are you sure?" başlıklı ekranda cansel order butonuna tıklayaraj onay verir.
        userPage.userOrdersCancelButton.click();
        ReusableMethods.wait(4);

        //Suite8 Buy Again
        //Açılan siparişler sayfasında "cancelled" olarak görülen sipariş satırındaki üç noktaya tıklar.
        userPage.userOrdersUcNokta.click();
        ReusableMethods.wait(4);

        //Açılan menüde "Buy again" bölümüne tıklar.
        userPage.userDropdownBuyAgain.click();
        ReusableMethods.wait(4);

        //Açılan yan sepet kısmında 1 adet arttirarak "Go to checkout" butonuna tıklar.
        userPage.adetArttir.click();
        ReusableMethods.wait(4);
        userPage.userGoToCheckout.click();
        ReusableMethods.wait(4);

        //Sağ kısımdaki "Place Order" butonuna tıklar.
        userPage.placeOrderButton.click();
        ReusableMethods.wait(4);

        //Sipariş durumunu göreceği sayfa görüntülenir
        Assert.assertTrue(userPage.ConfirmyourOrder.isDisplayed());

        //Suite9 Merchant Admin girişi
        //Merchant login sayfasında sisteme kayıtlı olan bilgileriyle giris yapar
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        ReusableMethods.wait(3);
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        ReusableMethods.wait(4);
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        ReusableMethods.wait(4);
        merchantPage.merchantLoginButton.click();

        //Açılan dashboard sayfasında bulunan "Last Orders" kısmındaki ilgili siparişin
        //sağ kısmında bulunan göz işaretine tıklayarak sipariş detaylarını görür
        merchantPage.merchantLastOrdersFirstOrderObserve.click();
        ReusableMethods.wait(4);

        //Sipariş durumunu ilerleterek siparişi "Delivered" yapar ve
        //sipariş müşteriye teslim edilmiş olur
        merchantPage.orderAcceptButton.click();
        ReusableMethods.wait(4);
        merchantPage.readyForPickupButton.click();
        ReusableMethods.wait(4);
        merchantPage.deliveryOnWayButton.click();
        ReusableMethods.wait(4);
        merchantPage.deliveredButton.click();
        ReusableMethods.wait(4);

        Driver.closeDriver();


    }
}
