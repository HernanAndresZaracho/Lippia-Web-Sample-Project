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
    public static void noLoginUsername404() {
        Assert.assertTrue(isVisible(automationTestingConstants.LI_USERNAME404_XPATH));
    }
    public static void noLoginPassword412() {
        Assert.assertTrue(isVisible(automationTestingConstants.LI_PASSWORD412_XPATH));
    }
    public static void noLoginUsername412() {
        Assert.assertTrue(isVisible(automationTestingConstants.LI_USERNAME412_XPATH));
    }
    public static void noLoginPassword409() {
        Assert.assertTrue(isVisible(automationTestingConstants.LI_PASSWORD409_XPATH));
    }
    public static void checkPasswordSecurity() {
        Assert.assertTrue(isVisible(automationTestingConstants.INPUT_PASSWORD_SECURITY_XPATH));
    }
    public static void clickLogout(){
        click(automationTestingConstants.BTN_LOGOUT_XPATH);
    }
    public static void verificarLogueo() {
        Assert.assertFalse(isVisible(automationTestingConstants.BTN_LOGOUT_XPATH));
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
