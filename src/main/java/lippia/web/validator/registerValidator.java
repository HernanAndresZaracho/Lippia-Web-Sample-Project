package lippia.web.validator;

import lippia.web.constants.AccountConstants;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.RegisterConstants;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.isVisible;

public class registerValidator {
    static SoftAssert softAssert = new SoftAssert();

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
