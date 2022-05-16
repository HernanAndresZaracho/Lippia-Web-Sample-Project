package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AccountConstants;
import lippia.web.constants.RegisterConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class RegisterHomeService extends ActionManager{
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void inputNewUsername(String text) {
        setInput(RegisterConstants.INPUT_NEW_USERNAME_ID, text);
    }
    public static void inputNewPassword(String text) {
        char primerElemento = text.charAt(0);
        StringBuilder texto = new StringBuilder(text);
        texto = texto.deleteCharAt(0);
        setInput(RegisterConstants.INPUT_NEW_PASSWORD_ID, String.valueOf(primerElemento));
        waitVisibility(RegisterConstants.BTN_REGISTER_XPATH);
        setInput(RegisterConstants.INPUT_NEW_PASSWORD_ID, String.valueOf(texto));
    }
    public static void clickRegister(String text) {
        click(RegisterConstants.BTN_REGISTER_XPATH);
    }
    public static void verificarRegister() {
        Assert.assertTrue(isVisible(AccountConstants.BTN_DASHBOARD_XPATH));
    }
    public static void noRegisterUsernameOccupied(){
        Assert.assertTrue(isVisible(RegisterConstants.LI_USERNAME_OCUPPIED_XPATH));
    }
    public static void noRegisterUsername(){
        Assert.assertTrue(isVisible(RegisterConstants.LI_USERNAME_INVALID_XPATH));
    }
    public static void noRegisterPassword(){
        Assert.assertTrue(isVisible(RegisterConstants.LI_PASSWORD_INVALID_XPATH));
    }
}
