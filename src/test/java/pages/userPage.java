package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class userPage {

    public userPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    // user sayfasındakı flavor fetch logosunun xpath
    @FindBy(xpath = "//*[@class='top-logo']")
    public WebElement userlogo;

    // user sayfasındakı Sign in butonunun xpath
    @FindBy(xpath = "//*[@class='d-none d-lg-inline line-left']")
    public WebElement userSignInBotten;




    // User sayfasındaki Mobile number or email
    @FindBy(xpath = "(//*[@class='form-control form-control-text'])[1]")
    public WebElement userNameTextBox;

    // User sayfasındaki Password
    @FindBy(xpath = "(//*[@class='form-control form-control-text'])[2]")
    public WebElement userPasswordTextBox;

    // user sayfasında login olmak için Sign in butonu
    @FindBy(xpath = "//*[@class='btn btn-green w-100']")
    public WebElement userGirisBotten;

    // User sayfasında login olunduktan sonra Icon xpath
    @FindBy(xpath = "//*[@class='badge rounded-circle badge-danger count']")
    public WebElement userIcon;

    // header kısmında dropdown menüsü
    @FindBy(xpath = "//*[@id='dropdownMenuLink']")
    public WebElement userDropDownMenu;

    // dropdown Manage my account
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-account']")
    public WebElement userDropdownManageMyAccount;

    // dropdown My Orders
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-orders']")
    public WebElement userDropdownMyOrders;

    // dropdown Addresses
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-addresses']")
    public WebElement userDropdownAddresses;

    // dropdown Payments Options
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-payments']")
    public WebElement userPaymentsOptions;

    // dropdown Saved Stores
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-savedstore']")
    public WebElement userSavedStore;

    //dropdown kısmından Logout
    @FindBy(xpath = "dropdown-item with-icon-logout")
    public WebElement userLogout;

    // header bölümündeki sepet ve sepette kaç adet sipariş olduğunu gösteren sayı ıconu
    @FindBy(xpath = "//*[@class='d-inline mr-3 mr-lg-0']")
    public WebElement userSepet;
    @FindBy(xpath = "//*[@class='badge small badge-dark rounded-pill']")
    public WebElement userSıparısAdetı;

    // user header kısmında Cart
    @FindBy(xpath = "//*[@class='ssm-toggle-navx']")
    public WebElement userCart;


    @FindBy(xpath = "//*[@class='btn-white-parent non-trasparent']")
    public WebElement joinUsButton;

    // User sayfasında konum search yerı Enter delivery address
    @FindBy(xpath = "//div[@id='vue-home-search']//input[@placeholder='Enter delivery address']")
    public WebElement userSearchAddress;


    // User Join olma butonu
    @FindBy(xpath = "//*[@class='btn btn-link w25']")
    public WebElement userJoin;

    // Manage my account kısmına tıkladıktan sonra Basic Details kısmında fotoğraf xpath
    @FindBy(xpath = "//*[@class='handle w-100 text-center bold']")
    public WebElement userProfilePhoto;

    // Manage my account kısmına tıkladıktan sonra Basic Details xpath
    @FindBy(xpath = "(//*[@class='active'])[2]")
    public WebElement userBasicDetails;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement userFirstName;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement userLastName;
    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement userEmail;
    @FindBy(xpath = "//button[@class='dropdown-toggle']")
    public WebElement userNumberButton;
    @FindBy(xpath = "//*[@class='mr-0 ml-1'])")
    public WebElement userNumberCenter;
    @FindBy(xpath = "//input[@data-mask='###################']")
    public WebElement userNumber;
    @FindBy(xpath = "//button[@class='mt-3 btn btn-green w-100']")
    public WebElement userSubmit;

    //Change Password kısmının xpath
    // Submit butonu Basic Details xpath ile aynı oyüzden iki tane locate eklenmemiştir
    @FindBy(xpath = "//*[@class='user-change-password']")
    public WebElement userChangePassword;
    @FindBy(xpath = "//label[@for='old_password']")
    public WebElement userOldPassword;
    @FindBy(xpath = "//label[@for='new_password']")
    public WebElement userNewPassword;
    @FindBy(xpath = "//label[@for='confirm_password']")
    public WebElement userConfirmPassword;

    // Manage Account kısmının xpath
    @FindBy(xpath = "//*[@href='/account/manage_account']")
    public WebElement userManageAccount;
    @FindBy(xpath = "//h6[normalize-space()='Account Data']")
    public WebElement userAccountData;
    @FindBy(xpath = "//h6[normalize-space()='Delete Account']")
    public WebElement userDeleteAccount;

    // menu kısmından Orders kısmına geçmek için xpath
    @FindBy(xpath = "//*[@class='orders active']")
    public WebElement userMenuOrders;

    // menu kısmından Addresses kısmına geçmek için xpath
    @FindBy(xpath = "//*[@class='addresses']")
    public WebElement userMenuAddress;

    // menu kısmından Payments kısmına geçmek için xpath
    @FindBy(xpath = "//*[@class='payments']")
    public WebElement userMenuPayments;

    // menu kısmından Saved stores kısmına geçmek için xpath
    @FindBy(xpath = "//*[@class='favourites']")
    public WebElement userMenuSavedStores;

    // orders penceresindeki xpath

    @FindBy(xpath = "//*[@class=\"col-lg-3 d-none d-lg-block\"]")
    public WebElement userOrdersQty;

    @FindBy(xpath = "(//*[@class=\"col-lg-2 d-none d-lg-block\"])[2]")
    public WebElement userTotalAmount;

    @FindBy(xpath = "(//*[@class='pr-2'])[1]")
    public WebElement userMerchantIcon;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[1]")
    public WebElement userMerchantName1;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[2]")
    public WebElement userMerchantName2;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[3]")
    public WebElement userMerchantName3;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[4]")
    public WebElement userMerchantName4;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[5]")
    public WebElement userMerchantName5;
    @FindBy(xpath = "(//*[@class='font13'])[1]")
    public WebElement userOrderID1;
    @FindBy(xpath = "(//*[@class='font13'])[2]")
    public WebElement userOrderID2;
    @FindBy(xpath = "(//*[@class='font13'])[3]")
    public WebElement userOrderID3;
    @FindBy(xpath = "(//*[@class='font13'])[4]")
    public WebElement userOrderID4;

    @FindBy(xpath = "(//*[@class='font13'])[5]")
    public WebElement userOrderID5;

    // orders kısmında siparişlerimin durumunu incelemek için kullanılan üç nokta buttonu
    @FindBy(xpath = "(//*[@class='zmdi zmdi-more'])[1]")
    public WebElement userOrdersUcNokta;
    @FindBy(xpath = "(//*[@class='dropdown-item ssm-toggle-nav'])[1]")
    public WebElement userOrdersView;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement userDropdownBuyAgain;
    @FindBy(xpath = "//*[@class='btn btn-green w-100 small']")
    public WebElement userBuyAgainButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[2]")
    public WebElement UserDropdownTrack;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[5]")
    public WebElement userDropdownCancelOrders;
    @FindBy(xpath = "(//*[@class='label'])[1]")
    public WebElement userOrdersCancelButton;
    @FindBy(xpath = "(//*[@class='btn btn-black w-100'])[1]")
    public WebElement userOrdersDontCancel;
    @FindBy(xpath = "(//*[@class='d-flex justify-content-between'])[2]")
    public WebElement userGoToCheckout;
    @FindBy(xpath = "(//*[@class='d-block chevron-section promo-section d-flex align-items-center rounded mb-2'])[1]")
    public WebElement userPhoneNumber;
    @FindBy(xpath = "(//*[@class='d-block chevron-section promo-section d-flex align-items-center rounded mb-2'])[2]")
    public WebElement userAddPromoCode;
    @FindBy(xpath = "//*[@class='custom-control-label']")
    public WebElement userCondimentsButton;
    @FindBy(xpath = "//*[@class='badge btn-black rounded-pill ml-1 font20']")
    public WebElement userAddNewAddress;
    @FindBy(xpath = "(//*[@class='d-block chevron-section promo-section d-flex align-items-center rounded mb-2'])[3]")
    public WebElement userChooseDeliveryAddress;
    @FindBy(xpath = "//*[@class='top-logo']")
    public WebElement headerLogo;

    @FindBy(xpath = "(//a[@class='facebook'])[1]")
    public WebElement facebookButton;

    @FindBy(xpath = "(//a[@class='instagram'])[1]")
    public WebElement instagramButton;

    @FindBy(xpath = "(//a[@class='linkedin'])[1]")
    public WebElement linkedinButton;

    @FindBy(xpath = "(//a[@class='twitter'])[1]")
    public WebElement twitterButton;

    @FindBy(xpath = "(//a[@class='youtube'])[1]")
    public WebElement youtubeButton;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][1]")
    public WebElement fastfoodBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][2]")
    public WebElement pizzaBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][3]")
    public WebElement sandwichesAndWrapsBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][4]")
    public WebElement italianBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][5]")
    public WebElement soupsAndStewsBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][6]")
    public WebElement japaneseBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][7]")
    public WebElement dessertAndSnacksBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][8]")
    public WebElement chineseButton;

    @FindBy(xpath = "(//*[@class=\"owl-carousel-nav prev mr-4\"])[1]")
    public WebElement oncekiButton;

    @FindBy(xpath = "(//*[@class=\"owl-carousel-nav next\"])[1]")
    public WebElement sonrakiButton;

    @FindBy(xpath = "(//*[@href=\"https://qa.flavorfetch.com/team-3\"])[3]")
    public WebElement team3Box;

    @FindBy(xpath = "(//a[@class='btn btn-grey xget-item-details'])[1]")
    public WebElement iskenderAddCart;

    @FindBy(xpath = "(//a[@class='btn btn-grey xget-item-details'])[2]")
    public WebElement pizzaAddCart;

    @FindBy(xpath = "(//div[@class='position-relative quantity-wrapper'])[2]")
    public WebElement hamburgerAddCart;

    @FindBy(xpath = "(//a[@class='btn btn-grey xget-item-details'])[3]")
    public WebElement mozarellaSticksAddCart;

    @FindBy(xpath = "(//a[@class='rounded-pill qty-btn'])[3]")
    public WebElement eksiButton;

    @FindBy(xpath = "(//a[@class='rounded-pill qty-btn'])[4]")
    public WebElement artiButton;

    @FindBy(xpath = "(//a[@class='btn btn-grey xget-item-details'])[1]")
    public WebElement addToCartIskenderButton;

    @FindBy(xpath = "//*div[@class = 'btn btn-green w-100 pointer d-flex justify-content-between']")
    public WebElement checkOutButton;

    @FindBy(xpath = "//*div[@class = 'mr-1']")
    public WebElement cashpaymentButton;

    @FindBy(xpath = "//*div[@class = 'btn btn-green w-100']")
    public WebElement addCashButton;

    @FindBy(xpath = "//*[@href='https://qa.flavorfetch.com/contactus']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//*[@href='https://qa.flavorfetch.com/terms-and-conditions']")
    public WebElement termsAndConditionsButton;

    @FindBy(xpath = "(//div[@class='text-left'])[2]")
    public WebElement termsAndConditionsContentText;

    @FindBy(xpath = "(//li[@class='position-relative '])[3]")
    public WebElement privacyPolicyButton;

    @FindBy(xpath = "(//a[@class='btn btn-grey xget-item-details'])[2]")
    public WebElement addToCartoMozarellaButton;

    @FindBy(xpath = "//*[@href=\"https://qa.flavorfetch.com/merchant/signup\"]")
    public WebElement becomeAPartnerButton;

    //Food Lists..
    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[1]")
    public WebElement havanaSandwichPage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[2]")
    public WebElement dolanUyghurPage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[3]")
    public WebElement krispyKremePage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[4]")
    public WebElement redrosePage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[5]")
    public WebElement foodyPizzaPage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[6]")
    public WebElement sushiNationPage;

    @FindBy(xpath = ("(//div[@class='position-relative']/a[1])[7]"))
    public WebElement team3Page;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[8]")
    public WebElement burgerVillagePage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[9]")
    public WebElement oceanaireSeafoodPage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[10]")
    public WebElement team1Page;

    @FindBy(xpath = "(//a[@class='rounded-pill qty-btn'])[2]")
    public WebElement cartSummaryPlusButton;

    @FindBy(xpath = "(//a[@class='rounded-pill qty-btn'])[3]")
    public WebElement cartSummaryMinusButton;

    @FindBy(xpath = "/a[@class='rounded-pill item-remove ml-auto mb-1']")
    public WebElement removeCartButton;

    @FindBy(xpath = "//button[@class='btn btn-green w-100 pointer']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//textarea[@class='form-control form-control-text font13']")
    public WebElement noteTextBox;

    @FindBy(xpath = "//div[@class='flex-fill pl-2']")
    public WebElement confirmingOrderRestoranPage;

    @FindBy(xpath = "//div[@class='mt-2']/a[@class='btn btn-circle btn-white border mr-2']")
    public WebElement callButton;

    @FindBy(xpath = "//div[@class='mt-2']/a[@class='btn btn-circle btn-white border']")
    public WebElement navigateButton;

    //--- Eklenenler Burhan

    // Kaydedilen restorant listesi
    @FindBy(xpath = "//*[@class='col-lg-3 mb-3 col-md-6']")
    public List<WebElement> savedShopList;

    // Dükkanı Saved Stores sayfasına eklemek için kalp butonu
    @FindBy(xpath = "(//i[@class='zmdi zmdi-favorite-outline'])[1]")
    public WebElement saveShoptoSavedStores;

    //Dükkanı Saved Stores sayfasından çıkarmak için kalp butonu
    @FindBy(xpath = "(//i[@class='zmdi zmdi-favorite text-green'])[1]")
    public WebElement removeShoptoSavedStore;

    //
    @FindBy(xpath = "(//*[@href=\"https://qa.flavorfetch.com/oceanaire-seafood\"])[1]")
    public WebElement oceanaireShopLink;

    // Dükkan ismi
    @FindBy(xpath = "(//*[@class='w-50 align-self-center'])[1]")
    public WebElement shopName;

    // Saved Store'da dükkan yok texti
    @FindBy(xpath = "//*[@class='col-md-6']")
    public WebElement noShopOnSavedStoreLabel;

    // Kaydedilen restorant isim listesi
    @FindBy(xpath = "//*[@class='m-0 text-truncate']")
    public List<WebElement> savedShopNameList;


    // ***** Ulvi Start **** //


    //Ana sayfada arama kutusu
    @FindBy(xpath = "(//*[@class='form-control form-control-text'])[1]")
    public WebElement SearchBoxOnHomePage;

    //Ana sayfada arama kutusu uzerindeki yazi
    @FindBy(xpath = "//h2[text()='We Deliver Deliciousness!']")
    public WebElement WeDeliverDeliciousness;

    //Ana sayfada arama kutusundaki arama ikonu
    @FindBy(xpath = "(//*[@class='search_placeholder pos-right img-20'])[1]")
    public WebElement iconOnSearchBox;

    //Restoranlar sayfasinda solda yukarida gosterilen toplam Store sayisi
    @FindBy(xpath = "(//*[@class='m-0'])[1]")
    public WebElement TotalStore;

    //Sub-footer logo
    @FindBy (xpath = "//*[@class='sub-footer']")
    public WebElement SubFooterLogo;

    //Ana sayfa Footer bolumu
    @FindBy(xpath = "(//*[@class='container'])[4]")
    public WebElement Footer;

    //Footerda AppStore Logo
    @FindBy(xpath = "(//*[@class='p-2'])[1]")
    public WebElement AppStoreLogoonFooter;

    //Footerda GooglePlay Logo
    @FindBy(xpath = "(//*[@class='p-2'])[2]")
    public WebElement GooglePlayLogoOnFooter;

    //Footerda © Flavor Fetch Corp. 2023
    @FindBy(xpath = "//p[text()='  © Flavor Fetch Corp. 2023']")
    public WebElement FooterFetchCorp2023;

    //AppleStore sitesinde Apple Logo
    @FindBy(xpath = "//*[@class='ac-ln-title']")
    public WebElement LogoOnAppleStoreWebsite;

    //GooglePlay sitesinde PageHeader
    @FindBy (xpath = "//*[@aria-label='Page Header']")
    public WebElement HeaderOnGooglePlayWebsite;

    @FindBy(xpath = "//*[text()='flavorfetch.com']")
    public WebElement WebSiteUrlOnFooter;

    // == Flavor Fetch Corp. START == //
    @FindBy(xpath = "//*[text()='Contact us']")
    public WebElement ContactUs;
    @FindBy(xpath = "//*[text()='Terms and conditions']")
    public WebElement TermsAndConditions;
    @FindBy(xpath = "//*[text()='Privacy policy']")
    public WebElement PrivacyPolicy;
    // == Flavor Fetch Corp. END == //

    // == Business START == //
    @FindBy(xpath = "//*[text()='Become a Partner']")
    public WebElement BecomePartner;
    // == Business END == //


    //== BLOG START == //
    @FindBy(xpath = "//*[text()='The Social Side of Online Food Ordering...']")
    public WebElement SocialSideBlog;
    @FindBy(xpath = "//*[text()='Exploring the Delights of Home Cooking...']")
    public WebElement ExploringBlog;
    @FindBy(xpath = "//*[text()='Embrace the Convenience: Ordering Food Online'][1]")
    public WebElement EmbranceBlog;
    @FindBy(xpath = "//*[text()='Nourishing the Body and Mind...']")
    public WebElement NourishingBlog;
    @FindBy(xpath = "//h3[text()='The Social Side of Online Food Ordering: Connecting Communities Through Cuisine']")
    public WebElement BlogDivH;
    @FindBy(xpath = "//h3[text () = 'Embrace the Convenience: Ordering Food Online']")
    public WebElement EmbranceBlogOnBlogText;

    @FindBy(xpath = "//span[text()='Accept']")
    public WebElement CookieAcceptButton;
    //== BLOG END == //


    // == Subfooter Social Media icons Start ==//
    @FindBy(xpath = "//a[@class='facebook']")
    public WebElement FacebookOnFooter;
    @FindBy(xpath = "//a[@class='instagram']")
    public WebElement InstagramOnFooter;
    @FindBy(xpath = "//a[@class='linkedin']")
    public WebElement LinkedinOnFooter;
    @FindBy(xpath = "//a[@class='twitter']")
    public WebElement TwitterOnFooter;
    @FindBy(xpath = "//a[@class='youtube']")
    public WebElement YouTubeOnFooter;
    // == Subfooter Social Media icons End ==//


    //== Github USER PAGE aldiklarim ==//
    // user sayfasındakı Sign in butonunun xpath
    @FindBy(xpath = "//*[@class='d-none d-lg-inline line-left']")
    public WebElement userSignInButton;

    // User sayfasındaki Mobile number or email
    @FindBy(xpath = "//*[@for='username']")
    public WebElement userNameInputBox;

    // User sayfasındaki Password
    @FindBy(xpath = "(//*[@class='required'])[2]")
    public WebElement userPasswordInputBox;

    // user sayfasında login olmak için Sign in butonu
    @FindBy(xpath = "//*[@class='btn btn-green w-100']")
    public WebElement userSignInToAccountButton;

    //user profilde sidebarda adress bolumu
    @FindBy(xpath = "//*[@class='addresses active']")
    public WebElement userAddressButtonOnSidebarSection;

    //user yeni adres ekledigi buton
    @FindBy(xpath = "(//*[@class='btn btn-green'])[1]")
    public  WebElement addNewAddress;

    //user yeni adres ekledigi zaman acilan modal
    @FindBy(xpath = "//*[@class='form-control form-control-text']")
    public WebElement EnterDeliveryAdress;

    //Arama sonucunda bulunan listelenen adresin xpath (Tampa aranacak)
    @FindBy(xpath = "//*[@class='m-0 text-grey']")
    public WebElement ListedDeliveryAdress;

    //Adresi Save etme butonu
    @FindBy(xpath = "//*[@class='btn btn-green w-100']")
    public WebElement SaveDeliveryAddressBtn;

    //Kullanicinin ekledigi en son adres
    @FindBy(xpath = "(//*[@class='module truncate-overflow'])[1]")
    public WebElement SavedAddress;

    //Kullanici adres yenileme butonu
    @FindBy(xpath = "(//*[@class='btn normal small'])[1]")
    public WebElement userAddressEditBtn;

    //Genel edit icinde adres basligi editleme butonu
    @FindBy(xpath = "(//a[text()='Edit '])[1]")
    public WebElement getUserAddressEditBtn2;

    //Kullanici adresini yeniledigi Complete Add
    @FindBy(xpath = "//*[@id='formatted_address']")
    public WebElement CompleteAdd;

    //Update olunmus adresin isminin gorunen kismi
    @FindBy(xpath = "(//*[@class='module truncate-overflow'])[1]")
    public WebElement UpdatedAddressValidation;

    //Kullanici adres silme butonu
    @FindBy(xpath = "(//a[text()='Delete'])[1]")
    public WebElement addressDeleteButton;

    //Kullanici adres silme zamani acilan modaldaki onay accept butonu
    @FindBy(xpath = "//*[@class='btn btn-green small pl-4 pr-4 bootbox-accept']")
    public WebElement DeleteAcceptionButton;

    //Kullanici restoran sectikten sonra en populer filtresi
    @FindBy(xpath = "//*[@for='sort_most_popular']")
    public WebElement MostPopular;

    //Kullanici restoran sectikten sonra show more
    @FindBy(xpath = "//u[text()='Show more +']")
    public WebElement ShowMoreButonu;

    //Kullanici selectbox FastFood Secimi
    @FindBy(xpath = "(//label[text()='Fast Food'])[2]")
    public WebElement FasFood;


    //Team3 restorani
    @FindBy(xpath = "//h5[text()='Team3']")
    public WebElement Team3Restaurant;

    //User Add to Cart Modal-da Ilk Cikan
    @FindBy(xpath = "(//span[@class='label'])[8]")
    public WebElement AddToCardOnOpenedModal;

    //User Add to Cart En Sonda olan
    @FindBy(xpath = "(//a[@class='btn btn-grey xget-item-details'])[1]")
    public WebElement LastAddToCard;



    //------------------------//
    //Register Sayfası Locateleri Mahmut

    //login sayfasındaki Sıgn Up Butonu
    @FindBy(xpath = "//*[@href='/account/signup?redirect=']")
    public WebElement userSıgnupButton;

    //REGİSTER SAYFASI

    @FindBy(xpath = "//*[@for='firstname']")
    public WebElement registerfirstNameTextBox;

    @FindBy(xpath = "//*[@for='lastname']")
    public WebElement registerLastNameTextBox;

    @FindBy(xpath = "//*[@for='email_address']")
    public WebElement registerEmailAdressTextBox;

    @FindBy(xpath = "(//*[@type='text'])[3]")
    public WebElement registerPhoneNumbertextBox;

    @FindBy(xpath = "//*[@for='password']")
    public WebElement registerPasswordTextbox;

    @FindBy(xpath = "//*[@for='cpassword']")
    public WebElement registerConfirmPAsswordTextBox;

    @FindBy (xpath = "//*[@class='btn btn-green w-100']")
    public WebElement registerSıgnUpButton;

    @FindBy(xpath = "//*[@id='vue-register']")
    public WebElement registerSuccesYazisi;

    //---------
    //contact us sayfası locateleri

    //Your request has been sent. alert yazısı
    @FindBy(xpath = "//*[@class='alert alert-success']")
    public WebElement RequestHasBeenSentAlert;

    @FindBy(xpath = "//*[@for='AR_contact_fullname']")
    public WebElement fullNameTextBox;

    @FindBy(xpath = "//*[@class='zmdi zmdi-eye']")
    public WebElement visiblePassword;

    @FindBy(xpath = "//*[@for='rememberme']")
    public WebElement rememberMeCheckbox;


    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginYazisi;

    @FindBy(xpath = "//*[@class='alert alert-warning']")
    public WebElement unabletologinYazisi;


    @FindBy(xpath = "//*[@class='a-12']")
    public WebElement forgotPasswordLinki;

    @FindBy(xpath = "//*[text()='Forgot Password']")
    public WebElement forgotPasswordyazisi;

    //Become a PArtner Bölümü Locateleri


    @FindBy(xpath = "//*[@id='restaurant_name']")
    public WebElement storeName;

    @FindBy(xpath = "//*[@placeholder='Store address']")
    public WebElement storeAddress;

    @FindBy(xpath = "//*[@id='contact_email']")
    public WebElement storeEmailAddress;

    @FindBy(xpath = "//*[@data-mask='###################']")
    public WebElement storeTelNumber;

    @FindBy(xpath = "//*[@class='custom-control-label']")
    public WebElement storeComissionRadioButton;

    @FindBy(xpath = "//*[text()='Flavor Fetch General Terms and Conditions']")
    public WebElement storeSozlesme;

    @FindBy(xpath = "//*[text()='Privacy Policy']")
    public WebElement storeGizlilikPolitikasi;

    @FindBy(xpath = "//*[@class='btn btn-green w-100 mt-3']")
    public WebElement storeSubmitButonu;

    @FindBy(xpath = "//*[text()='Contact email \"a@gmail.com\" has already been taken.']")
    public WebElement emailAlreadyTaken;

    @FindBy(xpath = "//*[text()=' Login here ']")
    public WebElement alreadyloginherelinki;


    @FindBy(xpath = "//*[@class='form-control form-control-text']")
    public WebElement anasayfaLokasyonAramaKutusu;

    @FindBy(xpath = "//*[@for='cuisine4']")
    public WebElement filterPizzaCheckbox;

    @FindBy(xpath = "//*[text()='Checkout']")
    public WebElement checkoutbutonu;

    @FindBy(xpath = "(//*[@class='col-lg-8 col-md-8 col-10 d-flex align-items-center'])")
    public WebElement stripeButonnu;

    //*[text()='Confirming your order']
    @FindBy(xpath = "//*[text()='Confirming your order']")
    public WebElement ConfirmyourOrder;

//Kullanici ana sayfada yerel mutfaklar menusu
    @FindBy(xpath = "//*[@class='row no-gutters list-inline']")
    public WebElement YerelMutfak;

    //Ana sayfada yerel mutfak munusunde More butonu
    @FindBy(xpath = "//a[text()=' More ']")
    public WebElement MoreButton;

    //Ana sayfada More butonuna klikleyince acilan alt menu
    @FindBy(xpath = "//*[@class='dropdown-menu show']")
    public WebElement CousineDropdownMenu;

    @FindBy(xpath = "//a[text()='Pizza']")
    public WebElement PizzaButtonOnCusinneMenu;

    //Kullanici yerel mutfakta pizza klikledikten sonra acilan sayfada sol ustteki Pizza yazisi
    @FindBy(xpath = "//h4[text()='Pizza']")
    public WebElement PizzaCousineText;

    //Kullanici yerel mutfaga klikledikten sonra o mutfaga ait restoran sayisi sol ust
    @FindBy(xpath = "//h6[text()='3 stores']")
    public WebElement CountOfRest;



    //E2E Testi icin ek Locate ler

    //Iskender Add to Cart
    @FindBy(xpath = "(//*[text()=' Add to cart '])[1]")
    public WebElement iskenderAddToCart;

    //Add to cart penceresinde adet arttirma +
    @FindBy(xpath = "(//*[@class='rounded-pill qty-btn'])[2]")
    public WebElement adetArttir;

    //Confirm your order sayfasindaki order ID elementi
    @FindBy(xpath = "(//*[@class='m-0 mb-1 bold'])[1]")
    public WebElement confirmedOrderID;

    //View Order details penceresindeki Order ID
    @FindBy(xpath = "(//*[@class='font13 m-0'])[1]")
    public WebElement viewOrderDetailsOrderID;

    //View Order Details penceresindeki X butonu
    @FindBy(xpath = "//i[@class='zmdi zmdi-close']")
    public WebElement viewOrderDetailsCloseButton;
}
