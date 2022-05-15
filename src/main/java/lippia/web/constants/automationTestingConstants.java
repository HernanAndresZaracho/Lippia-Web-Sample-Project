package lippia.web.constants;

public class automationTestingConstants {
    //Login
    public static final String BTN_MYACCOUNT_ID = "id:menu-item-50";
    public static final String INPUT_USERNAME_ID = "id:username";
    public static final String INPUT_PASSWORD_ID = "id:password";
    public static final String BTN_LOGIN_XPATH = "xpath://input[@value='Login']";
    public static final String BTN_LOGOUT_XPATH = "xpath://a[text()='Logout']";
    public static final String LI_USERNAME404_XPATH = "xpath://li[text()=' A user could not be found with this email address.']";
    public static final String LI_PASSWORD412_XPATH = "xpath://li[text()=' Password is required.']";
    public static final String LI_USERNAME412_XPATH = "xpath://li[text()=' Username is required.']";
    public static final String INPUT_PASSWORD_SECURITY_XPATH = "xpath://form/p/input[@type='password']";
    public static final String LI_PASSWORD409_XPATH = "xpath://div/div/ul/li[text()=' is incorrect. ']";



    //Register
    public static final String INPUT_NEW_USERNAME_ID = "id:reg_email";
    public static final String INPUT_NEW_PASSWORD_ID = "id:reg_password";
    public static final String BTN_REGISTER_XPATH = "xpath://input[@value='Register']";
    public static final String LI_USERNAME_OCUPPIED_XPATH = "xpath://li[text()=' An account is already registered with your email address. Please login.']";
    public static final String LI_USERNAME_INVALID_XPATH = "xpath://li[text()=' Please provide a valid email address.']";
    public static final String LI_PASSWORD_INVALID_XPATH = "xpath://li[text()=' Please enter an account password.']";



    //Account
    public static final String BTN_DASHBOARD_XPATH = "xpath://a[text()='Dashboard']";
    public static final String BTN_ORDERS_XPATH = "xpath://a[text()='Orders']";
    public static final String TD_ORDERS_VIEW_XPATH = "xpath://td[@data-title='Order']";
    public static final String BTN_ORDERS_VIEW_XPATH = "xpath://a[@class='button view']";
    public static final String MRK_ORDERS_NUMBER_XPATH = "xpath://mark[@class='order-number']";
    public static final String MRK_ORDERS_DATE_XPATH = "xpath://mark[@class='order-date']";
    public static final String BTN_ADDRESS_XPATH = "xpath://a[text()='Addresses']";
    public static final String DIV_BILLING_SHIPPING_XPATH = "xpath://div[@class='u-columns woocommerce-Addresses col2-set addresses']";
    public static final String BTN_SHIPPING_XPATH = "xpath://div[@class='u-column2 col-2 woocommerce-Address']/header/a[@class='edit']";
    public static final String INPUT_SHIPPING_FIRSTNAME_ID = "id:shipping_first_name";
    public static final String BTN_ACCOUNT_DETAILS_XPATH = "xpath://li/a[text()='Account Details']";
    public static final String INPUT_ACCOUNT_CHANGE_PASSWORD_ID = "id:password_1";


}
