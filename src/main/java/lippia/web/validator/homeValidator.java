package lippia.web.validator;

import lippia.web.constants.HomeConstants;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.*;
import static lippia.web.services.HomeService.clickNextArrival;

public class homeValidator {
    static SoftAssert softAssert = new SoftAssert();
    public static void checkoutCoupon(){
        softAssert.assertTrue(isVisible(HomeConstants.BTN_CHECKOUT_COUPON_XPATH));
        click(HomeConstants.BTN_CHECKOUT_COUPON_XPATH);
        waitVisibility(HomeConstants.BTN_APLY_COUPON_XPATH);
        softAssert.assertTrue(isVisible(HomeConstants.BTN_APLY_COUPON_XPATH));
    }
    public static void checkArrivals(){
        for(int i = 0; i < 3; i++){
            clickNextArrival();
        }
    }
    public static void checkBooks(){
        softAssert.assertTrue(isVisible(HomeConstants.BTN_ARRIVAL_HTML_XPATH));
        softAssert.assertTrue(isVisible(HomeConstants.BTN_ARRIVAL_RUBY_XPATH));
        softAssert.assertTrue(isVisible(HomeConstants.BTN_ARRIVAL_JAVASCRIPT_XPATH));
    }
    public static void checkOrders(){
        softAssert.assertTrue(isVisible(HomeConstants.VIEW_ORDERS_XPATH));
        softAssert.assertTrue(isVisible(HomeConstants.VIEW_BILLING_XPATH));
        softAssert.assertTrue(isVisible(HomeConstants.VIEW_ADDITIONAL_XPATH));
    }
    public static void checkHTMLPage(){
        softAssert.assertTrue(isVisible(HomeConstants.BTN_HTML_FORMS_XPATH));
    }
    public static void checkBookAddedBasket(){
        softAssert.assertTrue(isVisible(HomeConstants.MSG_ADDED_BASKET_XPATH));
    }
    public static void checkCartAdded(){
        softAssert.assertNotEquals("₹0.00",HomeConstants.MSG_BASKET_NOTNULL_XPATH);
    }
    public static void checkSubTotals(){
        softAssert.assertTrue((isVisible(HomeConstants.VIEW_TOTAL_XPATH)));
        softAssert.assertTrue(isVisible(HomeConstants.VIEW_SUBTOTAL_XPATH));
    }
    public static void checkTotalMayor() {
        String total = getAttribute(HomeConstants.VIEW_TOTAL_XPATH, "innerText").substring(1,4);
        String subTotal = getAttribute(HomeConstants.VIEW_SUBTOTAL_XPATH, "innerText").substring(1,4);
        int Total = Integer.parseInt(total);
        int SubtTotal = Integer.parseInt(subTotal);
        softAssert.assertTrue(Total > SubtTotal,"El subtotal es mas grande que el total");
    }
    public static void checkTax() {
        softAssert.assertTrue((isVisible(HomeConstants.VIEW_TAX_XPATH)));
    }
    public static void checkBuy() {
        waitVisibility(HomeConstants.MSG_BUY_COMPLETE_XPATH);
        softAssert.assertTrue((isVisible(HomeConstants.MSG_BUY_COMPLETE_XPATH)));
        softAssert.assertTrue((isVisible(HomeConstants.MSG_BANK_XPATH)));
        softAssert.assertTrue((isVisible(HomeConstants.MSG_BILLING_XPATH)));
        softAssert.assertTrue((isVisible(HomeConstants.MSG_CUSTOMER_XPATH)));
    }
    public static boolean checkStock(){
        boolean flag = true;
        if(isVisible(HomeConstants.MSG_OUT_STOCK_XPATH) == flag){
            return true;
        }
        else{
            return false;
        }
    }
}
