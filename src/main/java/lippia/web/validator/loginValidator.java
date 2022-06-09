package lippia.web.validator;

import lippia.web.constants.LoginConstants;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.isVisible;

public class loginValidator {
    static SoftAssert softAssert = new SoftAssert();
    public static void verificarLogin() {
        softAssert.assertTrue(isVisible(LoginConstants.BTN_LOGOUT_XPATH));
    }
    public static void verificarLogout() {
        softAssert.assertTrue(isVisible(LoginConstants.BTN_LOGIN_XPATH ));
    }
    public static void checkPasswordSecurity() {
        softAssert.assertTrue(isVisible(LoginConstants.INPUT_PASSWORD_SECURITY_XPATH));
    }
    public static void noLoginUsername404() {
        softAssert.assertTrue(isVisible(LoginConstants.LI_USERNAME404_XPATH));
    }
    public static void noLoginPassword412() {
        softAssert.assertTrue(isVisible(LoginConstants.LI_PASSWORD412_XPATH));
    }
    public static void noLoginUsername412() {
        softAssert.assertTrue(isVisible(LoginConstants.LI_USERNAME412_XPATH));
    }
    public static void noLoginPassword409() {
        softAssert.assertTrue(isVisible(LoginConstants.LI_PASSWORD409_XPATH));
    }
}
