package lippia.web.constants;

public class RegisterConstants {
    public static final String INPUT_NEW_USERNAME_ID = "id:reg_email";
    public static final String INPUT_NEW_PASSWORD_ID = "id:reg_password";
    public static final String BTN_REGISTER_XPATH = "xpath://input[@value='Register']";
    public static final String LI_USERNAME_OCUPPIED_XPATH = "xpath://li[text()=' An account is already registered with your email address. Please login.']";
    public static final String LI_USERNAME_INVALID_XPATH = "xpath://li[text()=' Please provide a valid email address.']";
    public static final String LI_PASSWORD_INVALID_XPATH = "xpath://li[text()=' Please enter an account password.']";
}
