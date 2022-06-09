package lippia.web.validator;

import lippia.web.constants.AccountConstants;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.isVisible;

public class accountValidator {
    static SoftAssert softAssert = new SoftAssert();
    public static void verificarDashboard(){
        Assert.assertTrue(isVisible(AccountConstants.BTN_DASHBOARD_XPATH));
    }
    public static void verificarOrdenes(){
        Assert.assertTrue(isVisible(AccountConstants.TD_ORDERS_VIEW_XPATH));
    }
    public static void verificarOrdersDetails(){
        Assert.assertTrue(isVisible(AccountConstants.MRK_ORDERS_NUMBER_XPATH));
    }
    public static void verificarNumeroYFechaOrders(){
        Assert.assertTrue(isVisible(AccountConstants.MRK_ORDERS_NUMBER_XPATH));
        Assert.assertTrue(isVisible(AccountConstants.MRK_ORDERS_DATE_XPATH));
    }
    public static void verificarBillingShipping(){
        Assert.assertTrue(isVisible(AccountConstants.DIV_BILLING_SHIPPING_XPATH));
    }
    public static void verificarShippingEdit(){
        Assert.assertTrue(isVisible(AccountConstants.INPUT_SHIPPING_FIRSTNAME_ID));
    }
    public static void verificarAccountDetailsEditPassword(){
        Assert.assertTrue(isVisible(AccountConstants.INPUT_ACCOUNT_CHANGE_PASSWORD_ID));
    }
    public static void verificarLogout(){
        Assert.assertTrue(isVisible(LoginConstants.BTN_LOGIN_XPATH));
    }
}
