package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginHomeService extends ActionManager{
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickMyAccount(String text) {
        click(LoginConstants.BTN_MYACCOUNT_ID, text);
    }
    public static void inputUsername(String text) {
        setInput(LoginConstants.INPUT_USERNAME_ID, text);
    }
    public static void inputPassword(String text) {
        setInput(LoginConstants.INPUT_PASSWORD_ID, text);
    }
    public static void clickLogin() {
        click(LoginConstants.BTN_LOGIN_XPATH);
    }
    public static void verificarLogin() {
        Assert.assertTrue(isVisible(LoginConstants.BTN_LOGIN_XPATH));
    }
    public static void noLoginUsername404() {
        Assert.assertTrue(isVisible(LoginConstants.LI_USERNAME404_XPATH));
    }
    public static void noLoginPassword412() {
        Assert.assertTrue(isVisible(LoginConstants.LI_PASSWORD412_XPATH));
    }
    public static void noLoginUsername412() {
        Assert.assertTrue(isVisible(LoginConstants.LI_USERNAME412_XPATH));
    }
    public static void noLoginPassword409() {
        Assert.assertTrue(isVisible(LoginConstants.LI_PASSWORD409_XPATH));
    }
    public static void checkPasswordSecurity() {
        Assert.assertTrue(isVisible(LoginConstants.INPUT_PASSWORD_SECURITY_XPATH));
    }
    public static void clickLogout(String text){
        click(LoginConstants.BTN_LOGOUT_XPATH);
    }
    public static void verificarLogueo() {
        Assert.assertTrue(isVisible(LoginConstants.BTN_LOGIN_XPATH ));
    }
}
