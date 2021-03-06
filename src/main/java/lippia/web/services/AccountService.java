package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AccountConstants;

public class AccountService extends ActionManager{

    public static void clickOrders(){
        click(AccountConstants.BTN_ORDERS_XPATH);
    }

    public static void clickOrdersView(){
        click(AccountConstants.BTN_ORDERS_VIEW_XPATH);
    }


    public static void clickAddress(){
        click(AccountConstants.BTN_ADDRESS_XPATH);
    }

    public static void clickShipping(){
        click(AccountConstants.BTN_SHIPPING_XPATH);
    }

    public static void clickAccountDetails(){
        click(AccountConstants.BTN_ACCOUNT_DETAILS_XPATH);
    }

}
