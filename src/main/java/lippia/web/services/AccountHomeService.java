package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AccountConstants;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class AccountHomeService extends ActionManager{
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void verificarDashboard(){
        Assert.assertTrue(isVisible(AccountConstants.BTN_DASHBOARD_XPATH));
    }
    public static void clickOrders(String text){
        click(AccountConstants.BTN_ORDERS_XPATH);
    }
    public static void verificarOrdenes(){
        Assert.assertTrue(isVisible(AccountConstants.TD_ORDERS_VIEW_XPATH));
    }
    public static void clickOrdersView(String text){
        click(AccountConstants.BTN_ORDERS_VIEW_XPATH);
    }
    public static void verificarOrdersDetails(){
        Assert.assertTrue(isVisible(AccountConstants.MRK_ORDERS_NUMBER_XPATH));
    }
    public static void verificarNumeroYFechaOrders(){
        Assert.assertTrue(isVisible(AccountConstants.MRK_ORDERS_NUMBER_XPATH));
        Assert.assertTrue(isVisible(AccountConstants.MRK_ORDERS_DATE_XPATH));
    }
    public static void clickAddress(String text){
        click(AccountConstants.BTN_ADDRESS_XPATH);
    }
    public static void verificarBillingShipping(){
        Assert.assertTrue(isVisible(AccountConstants.DIV_BILLING_SHIPPING_XPATH));
    }
    public static void clickShipping(String text){
        click(AccountConstants.BTN_SHIPPING_XPATH);
    }
    public static void verificarShippingEdit(){
        Assert.assertTrue(isVisible(AccountConstants.INPUT_SHIPPING_FIRSTNAME_ID));
    }
    public static void clickAccountDetails(String text){
        click(AccountConstants.BTN_ACCOUNT_DETAILS_XPATH);
    }
    public static void verificarAccountDetailsEditPassword(){
        Assert.assertTrue(isVisible(AccountConstants.INPUT_ACCOUNT_CHANGE_PASSWORD_ID));
    }
    public static void verificarLogout(){
        Assert.assertTrue(isVisible(LoginConstants.BTN_LOGIN_XPATH));
    }
}
