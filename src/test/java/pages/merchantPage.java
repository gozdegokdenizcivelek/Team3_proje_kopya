package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class merchantPage {

    public merchantPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //----@@@@SEMİH

    //>>>Sidebar Merchant Menu
    @FindBy(xpath = "//li[@class='merchant']")
    public WebElement merchantMenu;

    //>>Sidebar Merchant Relative Information Menu
    @FindBy(xpath = "//li[@class='position-relative merchant_edit']")
    public WebElement merchInformationMenu;

    //> Relative Information Merchant Information Menu
    @FindBy(xpath = "(//ul[@class='attributes-menu']//li)[1]")
    public WebElement merchInformationSubMenu;

    // Merchant Information Restaurant Name
    @FindBy(xpath = "//*[@id='AR_merchant_restaurant_name']")
    public WebElement restaurantNameTextBox;

    // Merchant Information Restaurant Slug
    @FindBy(xpath = "AR_merchant_restaurant_slug")
    public WebElement restaurantSlugTextBox;

    // Merchant Information Contact Name
    @FindBy(xpath = "AR_merchant_contact_name")
    public WebElement contactNameTextBox;

    // Merchant Information Contact Phone
    @FindBy(xpath = "AR_merchant_contact_phone")
    public WebElement contactPhoneTextBox;

    // Merchant Information Contact Email
    @FindBy(xpath = "AR_merchant_contact_email")
    public WebElement contactEmailTextBox;

    // Merchant Information Logo Browse Button
    @FindBy(xpath = "(//button[@class='btn btn-info'])[1]")
    public WebElement logoBrowseButton;

    // Merchant Information Header Browse Button
    @FindBy(xpath = "(//button[@class='btn btn-info'])[2]")
    public WebElement headerBrowseButton;

    //Merchant Information About Text Area
    @FindBy(xpath = "//div[@class='note-editable card-block']")
    public WebElement aboutTextBox;

    // Merchant Information Short About Area
    @FindBy(xpath = "//*[@id='AR_merchant_short_description']")
    public WebElement shortAboutTextBox;

    // Merchant Information Cousine
    @FindBy(xpath = "(//*[@class='select2-selection select2-selection--multiple'])[1]")
    public WebElement cousineBox;

    // Merchant Information Services
    @FindBy(xpath = "(//*[@class='select2-selection select2-selection--multiple'])[2]")
    public WebElement servicesBox;

    // Merchant Information Tags
    @FindBy(xpath = "(//*[@class='select2-selection select2-selection--multiple'])[3]")
    public WebElement tagsBox;

    // Merchant Information Featured
    @FindBy(xpath = "(//*[@class='select2-selection select2-selection--multiple'])[4]")
    public WebElement featuredBox;

    //Merchant Information Delivery Distance TextBox
    @FindBy(xpath = "//*[@id='AR_merchant_delivery_distance_covered']")
    public WebElement deliveryDistanceTextBox;

    // Merchant Information Published Merchant
    @FindBy(xpath = "//*[@id='is_ready']")
    public WebElement isPublishedCheckBox;

    // Merchant Information Save Button
    @FindBy(xpath = "//*[@class='btn btn-green btn-full']")
    public WebElement merchantInformationSaveButton;

    //> Relative Information Login  Menu

    //Relative Information Login First Name Textbox
    @FindBy(xpath = "//*[@name='AR_merchant_user[first_name]']")
    public WebElement merchantinformationloginfirstname;

    //Relative Information Login First Name Textbox
    @FindBy(xpath = "//*[@name='AR_merchant_user[last_name]']")
    public WebElement merchantinformationloginlastname;


    //Relative Information Login Last Name Textbox
    @FindBy(xpath = "//*[@name='AR_merchant_user[contact_email]']")
    public WebElement merchantinformationloginemail;

    //Relative Information Login Telephone Textbox
    @FindBy(xpath = "//*[@name='AR_merchant_user[contact_number]']")
    public WebElement merchantinformationlogintelephone;

    //Relative Information Username Textbox
    @FindBy(xpath = "//*[@for='AR_merchant_user_username']")
    public WebElement merchantinformationloginusername;

    //Relative Information Login Nre Password Textbox
    @FindBy(xpath = "//*[@for='AR_merchant_user_new_password']")
    public WebElement merchantinformationloginnewpassword;

    //Relative Information Login Confirm Password Textbox
    @FindBy(xpath = "//*[@for='AR_merchant_user_repeat_password']")
    public WebElement merchantinformationloginconfirmpassword;

    // Merchant Information Login Save Button
    @FindBy(xpath = "//*[@class='btn btn-green btn-full']")
    public WebElement merchantInformationLoginSaveButton;

    //> Relative Information Address  Menu

    //Addressmenu address details TextBox
    @FindBy(xpath = "//*[@name='AR_merchant[address]']")
    public WebElement merchantinformationaddressdetails;

    //Addressmenu Latitude TextBox
    @FindBy(xpath = "//*[@name='AR_merchant[latitude]']")
    public WebElement merchantinformationaddressLatitude;

    //Addressmenu Lontitude TextBox
    @FindBy(xpath = "//*[@name='AR_merchant[lontitude]']")
    public WebElement merchantinformationaddressLontitude;

    //Addressmenu Delivery Distance Textbox
    @FindBy(xpath = "//*[@name='AR_merchant[delivery_distance_covered]']")
    public WebElement merchantinformationaddressDeliveryDistance;

    //Addressmenu Miles Checkbox
    @FindBy(xpath = "//*[@name='AR_merchant[distance_unit]']")
    public WebElement merchantinformationaddressMilesCheckbox;

    //Addressmenu Save Butonu
    @FindBy(xpath = "//*[@class='btn btn-green btn-full']")
    public WebElement merchantinformationaddressSaveButon;


    //>>Sidebar Merchant Relative Settings Menu

    //Merchant Settings-Basic Settings Sayfası

    //Merchant Basic Settings Menu Butonu
    @FindBy(xpath = "(//*[@class='zmdi zmdi-settings'])[1]")
    public WebElement merchantsettingsbasicsettingsbuton;

    //Merchant Basic Settings Menu Tax Nummber Textbox
    @FindBy(xpath = "//*[text()='Tax number']")
    public WebElement merchantsettingsbasicsettingsTaxNummberTextbox;

    //Merchant Basic Settings Menu Two Flavor Options-please select kutusu
    @FindBy(xpath = "//*[@id='AR_option_merchant_two_flavor_option']")
    public WebElement merchantsettingsbasicsettingsTwoFlavorOptions;

    //Merchant Basic Settings Menu Two Flavor Options-website adres kutusu
    @FindBy(xpath = "//*[text()='Website address']")
    public WebElement merchantsettingsbasicsettingsTwoFlavorOptionsWebsiteAddress;

    //Merchant Basic Settings Menu close store radio
    @FindBy(xpath = "//*[@for='merchant_close_store']")
    public WebElement merchantsettingsbasicsettingsCloseStoreRadio;

    //Merchant Basic Settings Menu enabled voucher radio
    @FindBy(xpath = "//*[@for='merchant_enabled_voucher']")
    public WebElement merchantsettingsbasicsettingsenabledVoucherRadio;

    //Merchant Basic Settings Menu enabled tips radio
    @FindBy(xpath = "//*[@id='merchant_enabled_tip']")
    public WebElement merchantsettingsbasicsettingsEnabledTipsRadio;

    //Merchant Basic Settings Menu enabled language radio
    @FindBy(xpath = "//*[@for='merchant_enabled_language']")
    public WebElement merchantsettingsbasicsettingsEnabledLanguageRadio;

    //Merchant Basic Settings Menu default tip checkbox
    @FindBy(xpath = "//*[@id='AR_option_merchant_default_tip']")
    public WebElement merchantsettingsbasicsettingsDefaultTipCheckbox;

    //Merchant Basic Settings Menu tip type checkbox
    @FindBy(xpath = "//*[@name='AR_option[merchant_tip_type]']")
    public WebElement merchantsettingsbasicsettingsTipTypeCheckbox;

    //Merchant Basic Settings Menu Enabled Tips on the following transaction kutusu
    @FindBy(xpath = "//*[@class='select2-selection select2-selection--multiple']")
    public WebElement merchantsettingsbasicsettingsEnabledTipsTransactionTextbox;

    //Merchant Basic Settings SaveButonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement merchantsettingsbasicsettingsSaveButonu;


    //Merchant Settings-Store Hours Sayfası

    //Store Hours Sayfası Add New Buton
    @FindBy(xpath = "//*[@class='btn btn-black btn-circle']")
    public WebElement merchantsettingsStoreHoursAddNewButon;

    //Store Hours Sayfası arama kutusu
    @FindBy(xpath = "//*[@class='form-control rounded search w-25']")
    public WebElement merchantsettingsStoreHoursAramakutu;

    //Store Hours Sayfası arama submit(arama kutusuun yanı)
    @FindBy(xpath = "//*[@class='submit input-group-text border-0 ml-2 normal']")
    public WebElement merchantsettingsStoreHoursAramaSubmit;

    //Store Hours Sayfası ilk satır (index değişerek alt satıra inebilir)
    @FindBy(xpath = "(//*[@class='odd'])[1]")
    public WebElement merchantsettingsStoreHoursIlkSatir;

    //Store Hours Sayfası ilk satır düzenleme butonu(index değişerek alt satıra inebilir)
    @FindBy(xpath = "(//*[@class='zmdi zmdi-border-color'])[1]")
    public WebElement merchantsettingsStoreHoursDüzenlemeButonu;

    //Store Hours Sayfası ilk satır silme butonu(index değişerek alt satıra inebilir)
    @FindBy(xpath = "(//*[@class='zmdi zmdi-delete'])[1]")
    public WebElement merchantsettingsStoreHoursSilmeButonu;

    //Store Hours Sayfası
    @FindBy(xpath = "")
    public WebElement merchantsettingsStoreHours;

    //Merchant Settings-Store Hours Sayfası

    //Taxes Sayfası tax enabled radio
    @FindBy(xpath = "//*[@for='tax_enabled']")
    public WebElement merchantsettingsTaxesTaxEnabledRadio;

    //Taxes Sayfası Tax on service fee radio
    @FindBy(xpath = "//*[@for='tax_service_fee']")
    public WebElement merchantsettingsTaxesTaxOnServiceFeeRadio;

    //Taxes Sayfası Tax on delivery fee radio
    @FindBy(xpath = "//*[@for='tax_on_delivery_fee']")
    public WebElement merchantsettingsTaxesTaxonDeliveryFeeRadio;

    //Taxes Sayfası tax_packaging radio
    @FindBy(xpath = "//*[@for='tax_packaging']")
    public WebElement merchantsettingsTaxesTaxPackagingRadio;

    //Taxes Sayfası tax type checkbox
    @FindBy(xpath = "//*[@id='AR_merchant_meta_tax_type']")
    public WebElement merchantsettingsTaxesTaxTypeCheckbox;

    //Taxes Sayfası add nex tax butonu
    @FindBy(xpath = "//*[@class='btn btn-link btn-sm text-green border']")
    public WebElement merchantsettingsTaxesAddNexTaxButonu;

    //Taxes Sayfası No data yazısı
    @FindBy(xpath = "//*[@class='dataTables_empty']")
    public WebElement merchantsettingsTaxesNoDataYazisi;

    //Taxes Sayfası Save Butonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement merchantsettingsTaxesSaveButon;


    //Merchant Settings-Notification Settings Sayfası

    //Notification Settings Sayfasi enabled notification radio buton
    @FindBy(xpath = "//*[@for='merchant_enabled_alert']")
    public WebElement merchantsettingsNotificationSettingsEnabledNotificationRadioButon;

    //Notification Settings Sayfasi email address kutusu
    @FindBy(xpath = "//*[@for='AR_option_merchant_email_alert']")
    public WebElement merchantsettingsNotificationSettingsEmailAddressTextBox;

    //Notification Settings Sayfasi mobile number Kutusu
    @FindBy(xpath = "//*[@id='AR_option_merchant_mobile_alert']")
    public WebElement merchantsettingsNotificationSettingsMobileNumberTextBox;

    //Notification Settings Sayfasi save butonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement merchantsettingsNotificationSettingsSaveButonu;

    //Merchant Settings-Order Settings Sayfası

    //Order Settings Sayfasi Critical minutes kutusu
    @FindBy(xpath = "//*[@for='AR_option_merchant_order_critical_mins']")
    public WebElement merchantsettingsOrderSettingsCriticalMinutesTextBox;

    //Order Settings Sayfasi Reject order minutes kutusu
    @FindBy(xpath = "//*[@for='AR_option_merchant_order_reject_mins']")
    public WebElement merchantsettingsOrderSettingsRejectOrderMinutesTextBox;

    //Order Settings Sayfasi save butonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement merchantsettingsOrderSettingsSaveButon;

    //Merchant Settings-Mnu Options Sayfası

    //Menu Options Sayfasi open in new window radio
    @FindBy(xpath = "//*[@for='AR_option_merchant_menu_type_0']")
    public WebElement merchantsettingsMenuOptionsOpeninNewWindowRadio;

    //Menu Options Sayfasi Open in a pop up radio
    @FindBy(xpath = "//*[@for='AR_option_merchant_menu_type_1']")
    public WebElement merchantsettingsMenuOptionsOpeninaPopupRadio;

    //Menu Options Sayfasi save butonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement merchantsettingsMenuOptionsSaveButonu;

    //Merchant Menu-Menu Sayfası

    //Menu Menu Sayfasi creat a new menu linki
    @FindBy(xpath = "//*[@class='text-green']")
    public WebElement merchantMenuSAyfasiCreateaNewMenuLink;

    //Menu Menu Sayfasi Promo menu butonu
    @FindBy(xpath = "//*[@class='m-0 mt-1 text-truncate']")
    public WebElement merchantMenuSAyfasiPromoMenuButonu;

    //Menu Menu Sayfasi Add to menu butonu
    @FindBy(xpath = "(//*[text()='Add to menu'])[1]")
    public WebElement merchantMenuSAyfasiAddtoMenu;

    //Menu Menu Sayfasi Menu name kutusu
    @FindBy(xpath = "")
    public WebElement merchantMenuSAyfasiMenuNameTextbox;

    //Menu Menu Sayfasi Save Manu Butonu
    @FindBy(xpath = "//*[@class='btn btn-green normal rounded-0 mr-2']")
    public WebElement merchantMenuSAyfasiSaveMenuButonu;

    //Menu Menu Sayfasi Delete butonu
    @FindBy(xpath = "//*[@class='btn btn-link normal rounded-0 text-green']")
    public WebElement merchantMenuSAyfasiDeleteButonu;

    //Merchant - Promo

    //Merchant Promo ilk satır
    @FindBy(xpath = "//*[@class='odd']")
    public WebElement merchantPromoFirstLine;

    //Merchant Promo ilk satır açıklama(index kullan 2 den başlıyor)
    @FindBy(xpath = "(//*[h6])[2]")
    public WebElement getMerchantPromoFirstLineDescription;

    //Merchant Promo Düzenleme butonu (2.si i.in index kullan)
    @FindBy(xpath = "(//*[@class='zmdi zmdi-border-color'])[1]")
    public WebElement merchantPromoEditButon;

    //Merchant Promo Silme butonu (2.si i.in index kullan)
    @FindBy(xpath = "(//*[@class='zmdi zmdi-delete'])[1]")
    public WebElement merchantPromoDeleteButon;


    //Merchant - Last orders

    //Merchant Last Orders All butonu
    @FindBy(xpath = "(//*[text()='All'])[1]")
    public WebElement merchantLastOrdersAllButonu;

    //Merchant Last Orders Processing butonu
    @FindBy(xpath = "(//*[text()='Processing'])[1]")
    public WebElement merchantLastOrdersProcessingButonu;

    //Merchant Last Orders Ready butonu
    @FindBy(xpath = "(//*[text()='Ready'])[1]")
    public WebElement merchantLastOrdersReadyButonu;

    //Merchant Last Orders Completed Butonu
    @FindBy(xpath = "(//*[text()='Completed'])[1]")
    public WebElement merchantLastOrdersCompletedButonu;

    //Merchant Last Orders ilk order satırı başlık (order nosu bulunan yer - index kullan)
    @FindBy(xpath = "(//*[@class='font-weight-bold hover-text-primary mb-1'])[1]")
    public WebElement merchantLastOrdersFirstOrderTitle;

    //Merchant Last Orders ilk order satırı fiyat ( - index kullan)
    @FindBy(xpath = "(//*[@class='text-right align-middle'])[1]")
    public WebElement merchantLastOrdersFirstOrderPrice;

    //Merchant Last Orders ilk order satırı ödeme seçeneği( - index kullan)
    @FindBy(xpath = "(//*[@class='text-muted font-weight-500'])[1]")
    public WebElement merchantLastOrdersFirstOrderPaymentOption;

    //Merchant Last Orders ilk order satırı status new-pickup( - index kullan)
    @FindBy(xpath = "(//*[@class='badge order_status new'])[1]")
    public WebElement merchantLastOrdersFirstorderStatus;

    //Merchant Last Orders ilk order satırı inceleme butonu ( - index kullan)
    @FindBy(xpath = "(//*[@class='zmdi zmdi-eye'])[1]")
    public WebElement merchantLastOrdersFirstOrderObserve;

    //Merchant Last Orders ilk order satırı indirme butonu ( - index kullan)
    @FindBy(xpath = "(//*[@class='zmdi zmdi-download'])[1]")
    public WebElement merchantLastOrdersFirstOrderDownloadButon;

    //Merchant - Popular Items

    //Merchant-Popular İtems popular items butonu (yeşil)
    @FindBy(xpath = "(//*[text()='Popular items'])[2]")
    public WebElement merchantPopularItemsButton;

    //Merchant-Popular İtems Last 30 days butonu
    @FindBy(xpath = "(//*[text()='Last 30 days sales'])[1]")
    public WebElement merchantPopularItemsLast30DaysButonu;

    //Merchant-Popular İtems ürün listesi ilk satır resmi ve linki (index kullan)
    @FindBy(xpath = "(//*[@class='img-60 rounded-circle'])[1]")
    public WebElement merchantPopularItemsProductListFirst;

    //Merchant-Popular İtems ürün listesi ilk satır satış adedi (index kullan-4ten başlıyor)
    @FindBy(xpath = "(//*[@class='m-0 text-muted'])[4]")
    public WebElement merchantPopularItemsFirstLinePuchaseQuantity;

    //Merchant-Popular İtems Last 30 days istatistikleri
    @FindBy(xpath = "(//*[@class='highcharts-background'])[1]")
    public WebElement merchantPopularItemsLast30DaysStatics;

    //Merchant - Top Customers

    //Merchant Top Customers İlk müşteri resmi (index kullan)
    @FindBy(xpath = "(//*[@class='img-60 rounded-circle'])[1]")
    public WebElement merchantTopCustomersFirstCustomerImg;

    //Merchant Top Customers İlk müşteri ismi(index kullan)
    @FindBy(xpath = "(//*[@class='img-60 rounded-circle'])[1]")
    public WebElement getMerchantTopCustomersFirstCustomerName;

    //Merchant Top Customers İlk müşteri satış adedi(index kullan - 3 ten başlar)
    @FindBy(xpath = "(//*[@class='m-0 text-muted'])[3]")
    public WebElement getMerchantTopCustomersFirstCustomerPuchaseQuantity;

    //Merchant Top Customers view all customer
    @FindBy(xpath = "(//*[text()='View All Customer'])")
    public WebElement merchantTopCustomersViewAllCustomer;


    //Merchant - Profile Sayfasi

    //Merchant Profile Sayfası Basic Details butonu
    @FindBy(xpath = "//*[@class='zmdi zmdi-account-circle']")
    public WebElement merchantProfilePageBasicDetailsButonu;

    //Merchant Profile Sayfası First name kutusu
    @FindBy(xpath = "//*[@name='AR_merchant_user[first_name]']")
    public WebElement merchantProfilePageFirstNameTextbox;

    //Merchant Profile Sayfası Last name kutusu
    @FindBy(xpath = "//*[@name='AR_merchant_user[last_name]']")
    public WebElement merchantProfilePageLastNameTextbox;

    //Merchant Profile Sayfası Email kutusu
    @FindBy(xpath = "//*[@for='AR_merchant_user_contact_email']")
    public WebElement merchantProfilePageEmailTextBox;

    //Merchant Profile Sayfası Number Kutusu
    @FindBy(xpath = "//*[@name='AR_merchant_user[contact_number]']")
    public WebElement merchantProfilePageNumberTextBox;

    //Merchant Profile Sayfası Username Kutusu
    @FindBy(xpath = "//*[@name='AR_merchant_user[username]']")
    public WebElement merchantProfilePageUsernameTextBox;

    //Merchant Profile Sayfası Browse Butonu
    @FindBy(xpath = "//*[@class='btn btn-info']")
    public WebElement merchantProfilePageBrowseButon;

    //Merchant Profile Sayfası Resmi kapatma simgesi
    @FindBy(xpath = "//*[@class='zmdi zmdi-close']")
    public WebElement merchantProfilePageCloseImg;

    //Merchant Profile Sayfası Save butonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement merchantProfilePageSaveButon;

    //Merchant Profile Sayfası Change Password Butonu
    @FindBy(xpath = "//*[@class='zmdi zmdi-lock-outline']")
    public WebElement merchantProfilePageChangePasswordButonu;

    //Merchant Profile Sayfası Old password kutusu
    @FindBy(xpath = "//*[@for='AR_merchant_user_old_password']")
    public WebElement merchantProfilePageOldPasswordTextbox;

    //Merchant Profile Sayfası New Password
    @FindBy(xpath = "")
    public WebElement merchantProfilePageNewPasswordTextBox;

    //Merchant Profile Sayfasi Confirm Password Kutusu
    @FindBy(xpath = "//*[@for='AR_merchant_user_repeat_password']")
    public WebElement merchantProfilePageConfirmPasswordTextbox;

    //Merchant Profile Sayfasi Save
    @FindBy(xpath = "//*[@for='AR_merchant_user_repeat_password']")
    public WebElement merchantProfilePageSaveButonu;

    //-----@@@EMRAH

    //Merchant Login sayfasindaki Username kutucugu
    @FindBy(xpath = "//*[@placeholder='Username']")
    public WebElement merchantLoginUsername;

    //Merchant Login sayfasindaki Password kutucugu
    @FindBy(xpath = "//*[@placeholder='Password']")
    public WebElement merchantLoginPassword;

    //Merchant Login Butonu
    @FindBy(xpath = "//*[@value='Sign in']")
    public WebElement merchantLoginButton;

    //Attributes Menu
    @FindBy(xpath = "//*[@class='attributes']")
    public WebElement attributesMenu;

    //Attributes altindaki Size linki
    @FindBy(xpath = "//*[@href='/backoffice/attrmerchant/size_list']")
    public WebElement attSizeMenu;

    //Attributes-Size sayfasindaki Add New Butonu
    @FindBy(xpath = "//*[@class='btn btn-black btn-circle']")
    public WebElement attSizeMenuAddNewButton;

    //Attributes-Size sayfasindaki Arama Kutucugu
    @FindBy(xpath = "//*[@placeholder='Search']")
    public WebElement attSizeMenuSearchBox;

    //Attributes-Size sayfasindaki Arama Butonu
    @FindBy(xpath = "//*[@class='submit input-group-text border-0 ml-2 normal']")
    public WebElement attSizeMenuSearchButton;

    //Attributes-Size sayfasindaki Tablonun # basligi
    @FindBy(xpath = "//th[1]")
    public WebElement attSizeNumberTableHead;

    //Attributes-Size sayfasindaki Tablonun Name basligi
    @FindBy(xpath = "//th[2]")
    public WebElement attSizeNameTableHead;

    //Attributes-Size sayfasindaki Tablonun Actions basligi
    @FindBy(xpath = "//th[3]")
    public WebElement attSizeActionsTableHead;

    //Attributes-Size sayfasindaki tum Edit Butonlari Listesi
    @FindBy(xpath = "//*[@data-original-title='Update']")
    public List<WebElement> attSizeEditButtons;

    //Attributes-Size sayfasindaki tum Delete Butonlari Listesi
    @FindBy(xpath = "//*[@data-original-title='Delete']")
    public List<WebElement> attSizeDeleteButtons;

    //Attributes altindaki Ingredients linki
    @FindBy(xpath = "//*[@href='/backoffice/attrmerchant/ingredients_list']")
    public WebElement attIngredientsMenu;

    //Attributes-Ingredients sayfasindaki Add New Butonu
    @FindBy(xpath = "//*[@class='btn btn-black btn-circle']")
    public WebElement attIngredientsMenuAddNewButton;

    //Attributes-Ingredients sayfasindaki Arama Kutucugu
    @FindBy(xpath = "//*[@placeholder='Search']")
    public WebElement attIngredientsMenuSearchBox;

    //Attributes-Ingredients sayfasindaki Arama Butonu
    @FindBy(xpath = "//*[@class='submit input-group-text border-0 ml-2 normal']")
    public WebElement attIngredientsMenuSearchButton;

    //Attributes-Ingredients sayfasindaki Tablonun # basligi
    @FindBy(xpath = "//th[1]")
    public WebElement attIngredientsNumberTableHead;

    //Attributes-Ingredients sayfasindaki Tablonun Name basligi
    @FindBy(xpath = "//th[2]")
    public WebElement attIngredientsNameTableHead;

    //Attributes-Ingredients sayfasindaki Tablonun Actions basligi
    @FindBy(xpath = "//th[3]")
    public WebElement attIngredientsActionsTableHead;

    //Attributes-Ingredients sayfasindaki tum Edit Butonlari Listesi
    @FindBy(xpath = "//*[@data-original-title='Update']")
    public List<WebElement> attIngredientsEditButtons;

    //Attributes-Ingredients sayfasindaki tum Delete Butonlari Listesi
    @FindBy(xpath = "//*[@data-original-title='Delete']")
    public List<WebElement> attIngredientsDeleteButtons;

    //Attributes altindaki Cooking Reference linki
    @FindBy(xpath = "//*[@href='/backoffice/attrmerchant/cookingref_list']")
    public WebElement attCookingReferenceMenu;

    //Attributes-Cooking Reference sayfasindaki Add New Butonu
    @FindBy(xpath = "//*[@class='btn btn-black btn-circle']")
    public WebElement attCookRefMenuAddNewButton;

    //Attributes-Cooking Reference sayfasindaki Arama Kutucugu
    @FindBy(xpath = "//*[@placeholder='Search']")
    public WebElement attCookRefMenuSearchBox;

    //Attributes-Cooking Reference sayfasindaki Arama Butonu
    @FindBy(xpath = "//*[@class='submit input-group-text border-0 ml-2 normal']")
    public WebElement attCookRefMenuSearchButton;

    //Attributes-Cooking Reference sayfasindaki Tablonun # basligi
    @FindBy(xpath = "//th[1]")
    public WebElement attCookRefNumberTableHead;

    //Attributes-Cooking Reference sayfasindaki Tablonun Name basligi
    @FindBy(xpath = "//th[2]")
    public WebElement attCookRefNameTableHead;

    //Attributes-Cooking Reference sayfasindaki Tablonun Actions basligi
    @FindBy(xpath = "//th[3]")
    public WebElement attCookRefActionsTableHead;

    //Attributes-Cooking Reference sayfasindaki tum Edit Butonlari Listesi
    @FindBy(xpath = "//*[@data-original-title='Update']")
    public List<WebElement> attCookRefEditButtons;

    //Attributes-Cooking Reference sayfasindaki tum Delete Butonlari Listesi
    @FindBy(xpath = "//*[@data-original-title='Delete']")
    public List<WebElement> attCookRefDeleteButtons;

    //Order Type Menu
    @FindBy(xpath = "//*[@class='food']")
    public WebElement orderTypeMenu;

    //Order Type Altindaki Delivery Menu
    @FindBy(xpath = "//*[@class='position-relative services_delivery_settings active']")
    public WebElement orderTypeDeliveryMenu;

    //Order Type - Delivery sayfasindaki Settings butonu
    @FindBy(xpath = "//ul[@id='yw0']/li[@class='active']")
    public WebElement oTDeliveryMenuSettingsButton;

    //Order Type - Delivery - Enabled Opt in for no contact delivery Switch
    @FindBy(xpath = "//*[@for='merchant_opt_contact_delivery']")
    public WebElement oTDeliveryMenuSwitch1;

    //Order Type - Delivery - Free Delivery on First Order Switch
    @FindBy(xpath = "//*[@for='free_delivery_on_first_order']")
    public WebElement oTDeliveryMenuSwitch2;

    //Order Type - Delivery - Settings - Save Button
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement oTDeliveryMenuSaveButton;

    //Order Type - Delivery sayfasindaki Fixed Charge butonu
    @FindBy(xpath = "//*[@class='zmdi zmdi-time-countdown']")
    public WebElement oTDeliveryMenuFixedChargeButton;

    //Order Type - Delivery - Fixed Charge - Price Kutucugu
    @FindBy(xpath = "//*[@id='AR_shipping_rate_distance_price']")
    public WebElement oTDeliveryMenuFixedChargePriceBox;

    //Order Type - Delivery - Fixed Charge - Delivery Estimation Kutucugu
    @FindBy(xpath = "//*[@id='AR_shipping_rate_estimation']")
    public WebElement oTDeliveryMenuFixedChargeDeliveryEstBox;

    //Order Type - Delivery - Fixed Charge - Minimum Order Kutucugu
    @FindBy(xpath = "//*[@id='AR_shipping_rate_minimum_order']")
    public WebElement oTDeliveryMenuFixedChargeMinOrderBox;

    //Order Type - Delivery - Fixed Charge - Maximum Order Kutucugu
    @FindBy(xpath = "//*[@id='AR_shipping_rate_maximum_order']")
    public WebElement oTDeliveryMenuFixedChargeMaxOrderBox;

    //Order Type - Delivery - Fixed Charge - Save Butonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement oTDeliveryMenuFixedChargeSaveButton;

    //Order Type Altindaki Pickup Menu
    @FindBy(xpath = "//*[@class='position-relative services_settings_pickup active']")
    public WebElement orderTypePickupMenu;

    //Order Type -Pickup sayfasindaki Settings butonu
    @FindBy(xpath = "//ul[@id='yw0']/li[@class='active']/a")
    public WebElement oTPickupMenuSettingsButton;

    //Order Type - Pickup - Settings - Pickup Estimation Kutusu
    @FindBy(xpath = "//*[@id='AR_shipping_rate_estimation']")
    public WebElement oTPickupMenuSettingsPickupEstimation;

    //Order Type - Pickup - Settings - Minimum Order Kutusu
    @FindBy(xpath = "//*[@id='AR_shipping_rate_minimum_order']")
    public WebElement oTPickupMenuSettingsMinOrder;

    //Order Type - Pickup - Settings - Maximum Order Kutusu
    @FindBy(xpath = "//*[@id='AR_shipping_rate_maximum_order']")
    public WebElement oTPickupMenuSettingsMaxOrder;

    //Order Type - Pickup - Settings - Save Butonu
    @FindBy(xpath = "//input[@value='Save']")
    public WebElement oTPickupMenuSettingsSaveButton;

    //Order Type Altindaki Dinein Menu
    @FindBy(xpath = "//*[@class='position-relative services_settings_dinein active']")
    public WebElement orderTypeDineinMenu;

    //Order Type -Dinein sayfasindaki Settings butonu
    @FindBy(xpath = "//ul[@id='yw0']/li[@class='active']/a")
    public WebElement oTDineinMenuSettingsButton;

    //Order Type - Dinein - Settings - Dinein Estimation Kutusu
    @FindBy(xpath = "//*[@id='AR_shipping_rate_estimation']")
    public WebElement oTDineinMenuSettingsPickupEstimation;

    //Order Type - Dinein - Settings - Minimum Order Kutusu
    @FindBy(xpath = "//*[@id='AR_shipping_rate_minimum_order']")
    public WebElement oTDineinMenuSettingsMinOrder;

    //Order Type - Dinein - Settings - Maximum Order Kutusu
    @FindBy(xpath = "//*[@id='AR_shipping_rate_maximum_order']")
    public WebElement oTDineinMenuSettingsMaxOrder;

    //Order Type - Dinein - Settings - Save Butonu
    @FindBy(xpath = "//input[@value='Save']")
    public WebElement oTDineinMenuSettingsSaveButton;

    //Images Menu
    @FindBy(xpath = "//*[@class='merchant_images']")
    public WebElement imagesMenu;

    //Images altindaki Gallery Menu
    @FindBy(xpath = "//*[@class='position-relative images_gallery']")
    public WebElement imagesGalleryMenu;

    //Images - Gallery - Browse Button
    @FindBy(xpath = "//*[@class='btn btn-info']")
    public WebElement imagesGalleryBrowseButton;

    //Images - Gallery - Save Button
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement imagesGallerySaveButton;

    //Images - Media Library Menusu
    @FindBy(xpath = "//*[@class='position-relative images_media_library']")
    public WebElement imagesMediaLibraryMenu;

    //Users Menu
    @FindBy(xpath = "//*[@class='merchan_user']")
    public WebElement usersMenu;

    //Users - All User Menu
    @FindBy(xpath = "//*[@class='position-relative usermerchant_user_list']")
    public WebElement usersAllUserMenu;

    //Users - All User Add New Button
    @FindBy(xpath = "//*[@class='btn btn-black btn-circle']")
    public WebElement usersAllUserMenuAddNewButton;

    //Users - All User Search Box
    @FindBy(xpath = "//*[@type='search']")
    public WebElement usersAllUserMenuSearchBox;

    //Users - All User Search Button
    @FindBy(xpath = "//*[@class='submit input-group-text border-0 ml-2 normal']")
    public WebElement usersAllUserMenuSearchButton;

    //Users - All User Menu Tablodaki Name Basligi
    @FindBy(xpath = "//th[@class='sorting'][2]")
    public WebElement usersAllUserMenuTableNameHeader;

    //Users - All User sayfasindaki tum Edit Butonlari Listesi
    @FindBy(xpath = "//*[@class='btn btn-light tool_tips']")
    public List<WebElement> usersAllUserMenuEditButtonsList;

    //Users - All User sayfasindaki tum Delete Butonlari Listesi
    @FindBy(xpath = "//*[@class='btn btn-light datatables_delete tool_tips']")
    public List<WebElement> usersAllUserMenuDeleteButtonsList;

    //Merchant Dashboard - Ustte bulunan 4 bolumluk gorsel
    @FindBy(xpath = "//*[@class='row m-0 p-0']")
    public WebElement merchantSummaryOne;

    //Merchant Dashboard - Ustte bulunan 4 bolumdeki sadece sayilar List olarak
    @FindBy(xpath = "//div[@class='report-inner']/p")
    public List<WebElement> merchantSummaryOneDataList;

    //Merchant Dashboard - ikinci bolum, (sales, earnings, balance)
    @FindBy(xpath = "//div[@class='position-relative mb-3']/div[@class='row']")
    public WebElement merchantSummaryTwo;

    //Merchant Dashboard - ikinci bolum, (sales, earnings, balance) sadece sayilar list olarak
    @FindBy(xpath = "//*[@class='m-0 position-relative']")
    public List<WebElement> merchantSummaryTwoDataList;

    //Merchant Dashboard - ucuncu bolum, (orders received, today delievered, today sales, today refund)
    @FindBy(xpath = "//div[@class='col-lg-8 mb-3 mb-xl-0']/div[@class='dashboard-statistic position-relative mb-3']")
    public WebElement merchantSummaryThree;

    //Merchant Dashboard - ucuncu bolum, (orders received, today delievered, today sales, today refund) sadece sayilar list olarak
    @FindBy(xpath = "//h3")
    public List<WebElement> merchantSummaryThreeDataList;

    //Merchant Dashboard - dorduncu bolum grafik (Sales Overview)
    @FindBy(xpath = "//*[@class='highcharts-background']")
    public WebElement merchantSummaryFour;

    //Merchant Dasboard sag altta bulunan Overview of Reviews deki Checkout all reviews butonu
    @FindBy(xpath = "//*[@href='https://qa.flavorfetch.com/backoffice/customer/reviews']")
    public WebElement merchantOverviewOfReviewCheckAllReviewsButton;

    //-------@BURHAN

    //------------------------------------------------------------------

    /*  *******************
        --- Dashboard ---
        *******************  */
    @FindBy(xpath = "//li[@class='merchant_dashboard active']")
    public WebElement dashboardMenu;
    @FindBy(xpath = "//li[@class='merchant_dashboard']")
    public WebElement dashboardNonActiveMenu;

    @FindBy(xpath = "//*[@class='sidebar-nav']")
    public WebElement sideMenuFull;


    /*  *******************
        --- Orders Menu ---
        *******************  */
    @FindBy(xpath = "//*[@class='merchant_orders']")
    public WebElement ordersMenu;
    @FindBy(xpath = "//*[@class='position-relative orders_new']")
    public WebElement newOrdersMenu;
    @FindBy(xpath = "//*[@class='position-relative orders_processing']")
    public WebElement ordersProcessingMenu;
    @FindBy(xpath = "//*[@class='position-relative orders_completed']")
    public WebElement ordersCompletedMenu;
    @FindBy(xpath = "//*[@class='position-relative orders_scheduled']")
    public WebElement ordersScheduledMenu;
    @FindBy(xpath = "//*[@class='position-relative orders_history']")
    public WebElement allOrdersMenu;

    /*
        Sol kısımdaki sipariş detaylarının gözüktüğü bölümün locate'i bütün order basamaklarında aynı
        Üst kısımdaki searchBox ve filtreleme türleri olan Order type, Payment Status, Sort bölümün locate'i bütün order basamaklarında aynı
        Sağ kısımdaki Summary bölümün locate'i bütün order basamaklarında aynı
        Assign Driver butonu locate'i bütün order basamaklarında aynı
        Alt kısımdaki Payment History locate'i bütün order basamaklarında aynı
        Ortadaki sipariş detayları bölümünün locate'i bütün order basamaklarında aynı
     */

    /*  ---------Orders-----------
        --- Ortak Kullanımlar ----
        -------------------------- */

    // Sol kısımdaki sipariş detay kutusu
    @FindBy(xpath = "//*[@class='chevron selected']")
    public WebElement newOrderInfoBox;

    // Orta kısımdaki sipariş detay kutusu
    @FindBy(xpath = "//*[@class='col-md-5']")
    public WebElement detailedOrderInfoBox;

    // Order search box
    @FindBy(xpath = "//*[@class='form-control py-2 border-right-0 border']")
    public WebElement orderSearchBox;

    // Order type filter
    @FindBy(xpath = "(//*[@title='Order type'])[1]")
    public WebElement orderTypeDropdown;

    // Payment Status filter
    @FindBy(xpath = "(//*[@title='Order type'])[1]")
    public WebElement paymentStatusDropdown;

    //Sort
    @FindBy(xpath = "(//*[@title='Sort'])[1]")
    public WebElement sortDropdown;

    // Assign Driver
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement assignDriverButton;

    //Summary
    @FindBy(xpath = "//*[@class='card-body pt-3']")
    public WebElement orderSummaryLabel;

    //Payment history
    @FindBy(xpath = "//*[@class='table-responsive-md']")
    public WebElement paymentHistoryTable;

    /*  ------Orders-------
        --- New Orders ----
        -------------------  */

    // Accept Button
    @FindBy(xpath = "//button[@class='btn-green btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement orderAcceptButton;
    // Order Reject Button
    @FindBy(xpath = "//button[@class='btn-black btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement orderRejectButton;


    /*  ---------Orders-----------
        --- Orders Processing ----
        --------------------------  */

    // Ready for pickup button
    @FindBy(xpath = "//*[@class='btn-green btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement readyForPickupButton;

    /*  ---------Orders-----------
        --- ---Orders Ready ------
        --------------------------  */

    // Delivery on its way button
    @FindBy(xpath = "//*[@class='btn-green btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement deliveryOnWayButton;

    // Delivered Button
    @FindBy(xpath = "//*[@class='btn-yellow btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement deliveredButton;

    // Delivery Failed Button
    @FindBy(xpath = "//*[@class= 'btn-black btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement deliveryFailedButton;

    /*  ---------Orders-----------
        ----Orders Completed -----
        --------------------------  */

    // Kullanılan bütün elementler ortak kısımda

     /*  ---------Orders-----------
        ----Orders Scheduled -----
        --------------------------  */

    // Accept Button
    @FindBy(xpath = "//button[@class='btn-green btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement scheduledAcceptButton;

    // Order Reject Button
    @FindBy(xpath = "//button[@class='btn-black btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement scheduledRejectButton;

     /*  ---------Orders-----------
         ------- All Orders -------
         --------------------------  */

    // Order History Top Section Summary (4 Elements)
    @FindBy(xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[1]")
    public WebElement ordersSummary;

    @FindBy(xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[2]")
    public WebElement cancelledOrdersSummary;

    @FindBy(xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[3]")
    public WebElement totalRefundSummary;

    @FindBy(xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[4]")
    public WebElement totalOrdersSummary;

    //Date filter (YYYYMMDD)
    @FindBy(xpath = "//*[@class='form-control py-2 border-right-0 border']")
    public WebElement dateFilterTextBox;

    // Filter By Customer etc.
    @FindBy(xpath = "(//*[text()='Filters'])[1]")
    public WebElement regularFilterButton;

    // Filter Page-shown  by customer etc.
    @FindBy(xpath = "(//*[@class='card-body'])[2]")
    public WebElement filterPanelMenu;

    /// Orders List Table Header Row
    @FindBy(xpath = "//th")
    public List<WebElement> orderListHeaderRow;

    // Customer PP Coloumn
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> cutomerPPColoumn;

    // Order Id Coloumn
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> orderIdColoumn;

    // Customer Name Coloumn
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> customerNameColoumn;

    // Order Information Coloumn
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> orderInfoColoumn;

    // Order view button
    @FindBy(xpath = "//tr//td[5]//a[1]")
    public List<WebElement> viewDetailsButton;

    // Receipt download button
    @FindBy(xpath = "//tr//td[5]//a[2]")
    public List<WebElement> downloadReceiptButton;

    // Next Page Button
    @FindBy(xpath = "//*[@class='paginate_button page-item next']")
    public WebElement nextPageButton;

    // Previous Page Button
    @FindBy(xpath = "//*[@class='paginate_button page-item previous']")
    public WebElement previousPageButton;


    /*  *******************
        ---- Food Menu ----
        *******************  */

    @FindBy(xpath = "//*[@class='food']")
    public WebElement foodMenu;
    @FindBy(xpath = "//*[@class='position-relative food_category']")
    public WebElement categoryMenu;
    @FindBy(xpath = "//*[@class='position-relative food_addoncategory']")
    public WebElement addOnCategoryMenu;
    @FindBy(xpath = "//*[@class='position-relative food_addonitem']")
    public WebElement addOnItemsMenu;
    @FindBy(xpath = "//*[@class='position-relative food_items']")
    public WebElement itemsMenu;

     /*
       Tablo başlık satırı bölümünün locate'i bütün basamaklarında aynı

     */


    /*  ------Food--------
        ---- Category -----
        -------------------  */

    // Category Picture Coloumn
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> categoryPicturedColoumn;

    // Category Name Coloumn
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> categoryNameColoumn;

    // Category Update Button Coloumn
    @FindBy(xpath = "//tr//td[3]//a[1]")
    public List<WebElement> categoryUpdateButtonColoumn;

    // Category Delete Button Coloumn
    @FindBy(xpath = "//tr//td[3]//a[2]")
    public List<WebElement> categoryDeleteButtonColoumn;

    // Add New Category Button
    @FindBy(xpath = "//*[@class='btn btn-black btn-circle']")
    public WebElement addNewCategoryButton;

    // Category name textBox
    @FindBy(xpath = "//*[@id='AR_category_category_name']")
    public WebElement categoryNameTextBox;

    // Category description textBox
    @FindBy(xpath = "//*[@id='AR_category_category_description']")
    public WebElement categoryDescriptionTextBox;

    //Category Featured Image Browse Button
    @FindBy(xpath = "((//button[@class='btn btn-info'])[1])")
    public WebElement featuredImageTextBox;

    //Category Icon Image Browse Button
    @FindBy(xpath = "((//button[@class='btn btn-info'])[2])")
    public WebElement iconImageTextBox;

    @FindBy(xpath = "//*[@class='btn btn-green btn-full mt-3']")
    public WebElement addNewCategorySaveButton;

    // Category Sort
    @FindBy(xpath = "//*[@class='btn btn-primary btn-circle']")
    public WebElement sortCategoryButton;

    /*  ------- Food ------------
        ---- AddOn Category -----
        -------------------------  */

    // AddOnCategory List Table Header Row
    @FindBy(xpath = "//th")
    public List<WebElement> addOnCategoryListHeaderRow;

    // AddOnCategory Picture Coloumn
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> addOnCategoryPicturedColoumn;

    // AddOnCategory Name Coloumn
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> adOnCategoryNameColoumn;

    // AddOnCategory Update Button Coloumn
    @FindBy(xpath = "//tr//td[3]//a[1]")
    public List<WebElement> addOnCategoryUpdateButtonColoumn;

    //Update category name textbox
    @FindBy(xpath = "//*[@id='AR_subcategory_subcategory_name']")
    public WebElement addOnCategoryNameTextBox;

    //Update category description textbox
    @FindBy(xpath = "//*[@id='AR_subcategory_subcategory_description']")
    public WebElement addOnCategoryDescriptionTextBox;


    // AddOnCategory Featured Image Browse Button
    @FindBy(xpath = "//*[@class='btn btn-info']")
    public List<WebElement> addOnCategoryFeaturedImageButton;

    // AddOnCategory Update Save Button
    @FindBy(xpath = "//*[@class='btn btn-green btn-full mt-3']")
    public WebElement updateSaveButton;

    // AddOnCategory Delete Button Coloumn
    @FindBy(xpath = "//tr//td[3]//a[2]")
    public List<WebElement> addOnCategoryDeleteButton;

     /*  ------- Food --------
        ---- AddOn Items -----
        ----------------------  */

    // AddOnItem List Table Header Row
    @FindBy(xpath = "//th")
    public List<WebElement> addOnItemListHeaderRow;

    // AddOnItem Picture Coloumn
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> addOnItemPicturedColoumn;

    // AddOnItem Name Coloumn
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> adOnItemNameColoumn;

    // AddOnItem's Category Name Coloumn
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> adOnItemCategoryColoumn;

    // AddOnItem Price Coloumn
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> adOnItemPriceColoumn;

    // AddOnItem Update Button Coloumn
    @FindBy(xpath = "//tr//td[5]//a[1]")
    public List<WebElement> addOnItemUpdateButtonColoumn;

    //Update addOnItem name textbox
    @FindBy(xpath = "//*[@id='AR_subcategory_item_sub_item_name']")
    public WebElement addOnItemNameTextBox;

    //Update addOnItem description textbox
    @FindBy(xpath = "//*[@id='AR_subcategory_item_sub_item_name']")
    public WebElement addOnItemDescriptionTextBox;

    //Update addOnItem price textbox
    @FindBy(xpath = "//*[@id='AR_subcategory_item_price']")
    public WebElement addOnItemPriceTextBox;

    // Update addOnItem AddOnCategory Menu
    @FindBy(xpath = "//*[@class='select2-selection select2-selection--multiple']")
    public WebElement addOnItemCategoryMenu;

    // AddOnItem Featured Image Browse Button
    @FindBy(xpath = "//*[@class='btn btn-info']")
    public WebElement ImageBrowseButton;

    // AddOnItem Update Save Button
    @FindBy(xpath = "//*[@class='btn btn-green btn-full mt-3']")
    public WebElement AddOnItemUpdateSaveButton;

    // Status dropdown
    @FindBy(xpath = "//*[@class='select2-selection select2-selection--multiple']")
    public WebElement statusDropdown;


    // AddOnItem Delete Button Coloumn
    @FindBy(xpath = "//tr//td[5]//a[2]")
    public List<WebElement> addOnItemDeleteButtonColoumn;

     /*  ------- Food -------
         -----  Items -------
         --------------------  */

    // Items List Table Header Row
    @FindBy(xpath = "//th")
    public List<WebElement> itemsListHeaderRow;

    // Items Picture Coloumn
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> itemsPicturedColoumn;

    // Items Availability Coloumn
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> itemsAvailabilityCheckBoxColoumn;

    // Items Name Coloumn
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> itemsNameColoumn;

    // Items' Category Coloumn
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> itemsCategoryColoumn;

    // Items Price Coloumn
    @FindBy(xpath = "//tr//td[5]")
    public List<WebElement> itemsPriceColoumn;

    // Items Update Coloumn
    @FindBy(xpath = "//tr//td[6]//a[1]")
    public List<WebElement> itemsUpdateColoumn;

    // Items Delete Coloumn
    @FindBy(xpath = "//tr//td[6]//a[2]")
    public List<WebElement> itemsDeleteColoumn;

    //-------SONRADAN EKLENENLER

    @FindBy(xpath = "(//*[text()='Update Category'])[2]")
    public WebElement updateCategoryLabel;
    @FindBy(xpath = "//a[@class='btn btn-green item_delete']")
    public WebElement deleteOnayKabulButton;

    @FindBy(xpath = "//*[@class='form-control rounded search w-25']")
    public WebElement categorySearchBox;

    // MerchAdmin Profile DropDown
    @FindBy(xpath = "(//*[@id='dropdownMenuLink'])[1]")
    public WebElement profileDropdown;

    // MerchAdminLogout
    @FindBy(xpath = "(//*[text()=' Logout '])[1]")
    public WebElement logOutButton;

    //Food Items Search Box
    @FindBy(xpath = "(//*[@class='col-sm-12 col-md-6'])[2]")
    public WebElement foodItemsSearchBox;

    //Attribute - Size Menu Delete item confirmation button
    @FindBy(xpath = "//*[@class='btn btn-green item_delete']")
    public WebElement attDeleteConfirm;

    // Date filter 30 days button
    @FindBy(xpath = "//*[text()='Last 30 Days']")
    public WebElement dateFilter30Days;

    @FindBy(xpath = "(//*[text()=' Profile '])[1]")
    public WebElement merchantAdminProfile;

    @FindBy(xpath = "//*[@class='position-relative orders_ready']")
    public WebElement ordersReadySideBarMenu;
    
}
