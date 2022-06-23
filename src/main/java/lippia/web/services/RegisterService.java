package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.RegisterConstants;

public class RegisterService extends ActionManager{
    public static void inputNewUsername(String text) {
        setInput(RegisterConstants.INPUT_NEW_USERNAME_ID, text);
    }
    public static void inputNewPassword(String text) {
        setInput(RegisterConstants.INPUT_NEW_PASSWORD_ID, text);
    }
    public static void clickRegister(String text) {
        click(RegisterConstants.BTN_REGISTER_XPATH);
    }
}
