package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class adminPage {
    public adminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //ulvi start
    @FindBy(className = "navbar-brand")
    public WebElement allMerchantText;

  //  @FindBy(className = "btn btn-black btn-circle")
    //public WebElement addNewMerchantButton;

    //@FindBy(className = "form-control rounded search w-25")
    //public WebElement merchantSearchBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement merchantSearchButton;

    @FindBy(xpath = "(//*[@class='dataTables_info']")
    public WebElement merchantTotalEntries;

    @FindBy(xpath = "//*[@id='merchantListActions_previous']")
    public WebElement paginationPreviousButton;

    @FindBy(xpath = "//*[@id='merchantListActions_next']")
    public WebElement paginationNextButton;

    @FindBy(xpath = "(//*[text()='Commission'])[1]")
    public WebElement chargeTypeCommission;

    @FindBy(xpath = "(//*[text()='Membership'])[1]")
    public WebElement chargeTypeMembership;

    @FindBy(xpath = "(//*[@class='badge ml-2 customer pending'])[1]")
    public WebElement PendingForApproval;

    @FindBy(xpath = "(//*[@class='badge ml-2 customer active'])[1]")
    public WebElement customerActive;

    @FindBy(xpath = "(//*[@class='zmdi zmdi-border-color'])[1]")
    public WebElement actionsEditButton;

    //ulvi end


    //xaver start Admin pagede Orders bolumu
    //Admin Page-de Orders butonu
    @FindBy (xpath = "//*[text()='Orders'])[1]")
    public WebElement orderButton;

    //Admin Page-de AllOrders butonu
    @FindBy (xpath = "//*[text()='All order']")
    public WebElement allorderButton;

    //Orders-ın bölümündeki All Orders-a tıkladıkdan sonra yeni sayfada "AllOrders" başlığı
    @FindBy (xpath = ("(//*[text()='All Orders']) [2]"))
    public WebElement allOrdersTitle;


    //Toplam sifarişler için Orders yazısı
    @FindBy (xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[1]")
    public WebElement ordersTextBox;

    //Toplam iptal için Cancel yazısı
    @FindBy (xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[2]")
    public WebElement cancelTextBox;

    //Toplam geri iadeler için Refund yazısı
    @FindBy (xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[3]")
    public WebElement refundTextBox;

    //Toplam meblağ için Total Orders yazısı
    @FindBy (xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[4]")
    public WebElement totalOrdersBox;

    //Date filter (YYYYMMDD)
    @FindBy (xpath = "//*[@class='form-control py-2 border-right-0 border']")
    public WebElement startAndEndDateBox;

    //Calendar button
    @FindBy (xpath = "//*[@class='zmdi zmdi-calendar-alt']")
    public WebElement calendarIcon;

    //Filtreleme butonu
    @FindBy (xpath = "(//*[@class='d-flex'])[6]")
    public WebElement filtersButton;

    //Header bolumunde kullanıcı profil resmi
    @FindBy(xpath = "(//tr//td)[1]")
    public List<WebElement> imageProfileX;

    //Siparis bilgileri
    @FindBy(xpath = "(//tr//td)[2]")
    public List<WebElement> orderInformationText;

    //Siparişlerin ID numarası
    @FindBy(xpath = "(//tr//td)[3]")
    public  List<WebElement> orderIDColumn;

    //Restoran bilgileri
    @FindBy (xpath = "(//tr//td)[4]")
    public WebElement merchant;

    //Müsteri ismi
    @FindBy(xpath = "(//tr//td)[5]")
    public List<WebElement> customer;

    //View ve Download ikonlarının bulunduğu bölüm
    @FindBy (xpath = "(//*[@class='sorting_disabled'])[5]")
    public WebElement actions;

    //Admin All Orders ilk order satırı inceleme butonu (-index kullanilmali)
    @FindBy (xpath ="(//tr//td[5]//a)[1]")
    public List<WebElement> adminAllOrdersFirstOrderObserve;

   //Admin All Orders ilk order satırı indirme butonu (-index kullanilmali)
    @FindBy (xpath = "(//tr//td[5]//a)[2]")
    public List<WebElement> adminAllOrdersFirstOrderDownloadButon;

    //Toplam giriş sayısını görmek için
    @FindBy (xpath = "//*[@class='dataTables_info']")
    public WebElement dataTableinfo;

    //Sayfaya geri dönmek için Previous butonu
    @FindBy (xpath = "//*[@class='paginate_button page-item previous']")
    public List<WebElement> previousButton;

    //Diğer sayfaya geçmek için Next butonu
    @FindBy (xpath = "//*[@class='paginate_button page-item next']")
    public List<WebElement> nextButton;

    //xaver end


//--------------------------//
    //Mahmut Starts
    
    //admin login sayfası baslangıc
    @FindBy(xpath = "//*[@for='LoginForm_username']")
    public WebElement UserNameTextBox;

    @FindBy (xpath = "//*[text()='Username ']")
    public WebElement PasswordTextBox;

    @FindBy(xpath = "//*[@for='LoginForm_rememberMe']")
    public WebElement RememberMeButton;

    @FindBy(xpath = "//*[@class='dim underline']")
    public WebElement ForgotPasswordButton;


    @FindBy(xpath = "//*[@class='btn btn-green btn-full']")
    public WebElement SignInButton;

    @FindBy(xpath = "//*[@src='/backoffice/themes/classic/assets/images/app-store@2x.png']")
    public WebElement AppStoreLink;

    @FindBy(xpath = "//*[@src='/backoffice/themes/classic/assets/images/google-play@2x.png']")
    public WebElement PlayStoreLink;
    
    //admin login bitiş------
    
    //admin dashboard 

    @FindBy(xpath = "//*[@href='/backoffice/promo/coupon']")
    public WebElement CouponLink;

    @FindBy(xpath = "//*[@href='/backoffice/promo/coupon_create']")
    public WebElement AddNewButton;

    @FindBy(xpath = "//*[@class='form-control rounded search w-25']")
    public WebElement SearchTextBox;

    @FindBy(xpath = "//*[@class='submit input-group-text border-0 ml-2 normal']")
    public WebElement SearchButton;

    @FindBy(xpath = "//*[@style='width: 408px;']")
    public WebElement NameButton;

    @FindBy(xpath = "//*[@style='width: 260px;']")
    public WebElement UsedButton;

    @FindBy(xpath = "//*[@style='width: 186px;']")
    public WebElement ActionsButton;

    //Coupon Olusturma Sayfası
    @FindBy(xpath = "//*[@href='/backoffice/promo/coupon'][1]")
    public WebElement AllCouponLink;

    @FindBy(xpath = "//*[@for='AR_voucher_voucher_name']")
    public WebElement CouponNameTextBox;

    @FindBy(xpath = "//select[@id='AR_voucher_voucher_type']")
    public WebElement DropdownCouponType;

    @FindBy(xpath = "//*[@for='AR_voucher_amount']")
    public WebElement AmountTextBox;

    @FindBy(xpath = "//*[@for='AR_voucher_min_order']")
    public WebElement MinOrderTextBox;

    @FindBy(xpath = "//select[@class='form-control custom-select form-control-select select_two select2-hidden-accessible']")
    public WebElement DropDownDaysAvalable;

    @FindBy(xpath = "//select[@class='form-control custom-select form-control-select select_two_ajax select2-hidden-accessible']")
    public WebElement DropDownApplicableToMerchant;

    @FindBy(xpath = "//*[@for='AR_voucher_expiration']")
    public WebElement ExpirationDate;

    @FindBy(xpath = "//select[@class='form-control custom-select form-control-select coupon_options']")
    public WebElement CouponOptionsDropDownMenu;

    @FindBy(xpath = "//select[@id='AR_voucher_status']")
    public WebElement StatusDropDownMenu;

    @FindBy(xpath = "//*[@class='btn btn-green btn-full mt-3']")
    public WebElement SaveButton;

    @FindBy(xpath = "//*[@class='merchant']")
    public WebElement merchantMenu;

    @FindBy(xpath = "//*[@class='position-relative vendor_list']")
    public WebElement merchantListMenu;

    @FindBy(xpath = "//*[@class='btn btn-black btn-circle']")
    public WebElement addNewMerchantButton;

    @FindBy(xpath = "//*[@class='form-control rounded search w-25']")
    public WebElement merchantSearchBox;

    @FindBy(xpath = "(//*[@class='form-control form-control-text'])[1]")
    public WebElement UserLoginName;

    @FindBy (xpath = "(//*[@class='form-control form-control-text'])[2]")
    public WebElement PasswordLogintBox;
}
