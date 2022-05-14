package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.automationTestingConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class automationTestingHomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    //Login
    public static void clickMyAccount(String text) {
        click(automationTestingConstants.BTN_MYACCOUNT_ID, text);
    }
    public static void inputUsername(String text) {
        setInput(automationTestingConstants.INPUT_USERNAME_ID, text);
    }
    public static void inputPassword(String text) {
        setInput(automationTestingConstants.INPUT_PASSWORD_ID, text);
    }
    public static void clickLogin() {
        click(automationTestingConstants.BTN_LOGIN_XPATH);
    }
    public static void verificarLogin() {
        Assert.assertTrue(isVisible(automationTestingConstants.BTN_LOGOUT_XPATH));
    }
    public static void verificarNoLogin() {
        Assert.assertTrue(isVisible(automationTestingConstants.STRONG_ERROR_XPATH));
    }

    //Register
    public static void inputNewUsername(String text) {
        setInput(automationTestingConstants.INPUT_NEW_USERNAME_ID, text);
    }
    public static void inputNewPassword(String text) {
        setInput(automationTestingConstants.INPUT_NEW_PASSWORD_ID, text);
    }
    public static void clickRegister(String text) {
        click(automationTestingConstants.BTN_REGISTER_XPATH);
    }
    public static void verificarRegister() {
        Assert.assertTrue(isVisible(automationTestingConstants.BTN_LOGOUT_XPATH));
    }
}
