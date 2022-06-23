package lippia.web.validator;

import lippia.web.constants.AccountConstants;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.isVisible;

public class accountValidator {
    static SoftAssert softAssert = new SoftAssert();
    public static void verificarDashboard(){
        softAssert.assertTrue(isVisible(AccountConstants.BTN_DASHBOARD_XPATH));
    }
    public static void verificarOrdenes(){
        softAssert.assertTrue(isVisible(AccountConstants.TD_ORDERS_VIEW_XPATH));
    }
    public static void verificarOrdersDetails(){
        softAssert.assertTrue(isVisible(AccountConstants.MRK_ORDERS_NUMBER_XPATH));
    }
    public static void verificarNumeroYFechaOrders(){
        softAssert.assertTrue(isVisible(AccountConstants.MRK_ORDERS_NUMBER_XPATH));
        softAssert.assertTrue(isVisible(AccountConstants.MRK_ORDERS_DATE_XPATH));
    }
    public static void verificarBillingShipping(){
        softAssert.assertTrue(isVisible(AccountConstants.DIV_BILLING_SHIPPING_XPATH));
    }
    public static void verificarShippingEdit(){
        softAssert.assertTrue(isVisible(AccountConstants.INPUT_SHIPPING_FIRSTNAME_ID));
    }
    public static void verificarAccountDetailsEditPassword(){
        softAssert.assertTrue(isVisible(AccountConstants.INPUT_ACCOUNT_CHANGE_PASSWORD_ID));
    }
    public static void verificarLogout(){
        softAssert.assertTrue(isVisible(LoginConstants.BTN_LOGIN_XPATH));
    }
}
