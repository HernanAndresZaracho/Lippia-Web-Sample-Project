package lippia.web.validator;

import lippia.web.constants.HomeConstants;
import lippia.web.constants.ShopConstants;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.*;
import static lippia.web.services.HomeService.clickNextArrival;

public class shopValidator {
    static SoftAssert softAssert = new SoftAssert();

    public static void validateTaxIndia(){
        String total = getAttribute(HomeConstants.VIEW_TOTAL_XPATH, "innerText").substring(0,3);
        String subTotal = getAttribute(ShopConstants.VIEW_SUBTOTAL_XPATH, "innerText").substring(0,3);
        String tax = getAttribute(ShopConstants.VIEW_TAX_INDIAN_XPATH, "innerText").substring(0,1);
        float Total = Integer.parseInt(total);
        float SubtTotal = Integer.parseInt(subTotal);
        float Tax = Integer.parseInt(tax);
        softAssert.assertEquals(Total == (SubtTotal + Tax),"El total no es lo mismo a la suma del subtotal y el tax");
    }
    public static void checkoutCoupon(){
        softAssert.assertTrue(isVisible(HomeConstants.BTN_CHECKOUT_COUPON_XPATH));
        click(HomeConstants.BTN_CHECKOUT_COUPON_XPATH);
        waitVisibility(HomeConstants.BTN_APLY_COUPON_XPATH);
        softAssert.assertTrue(isVisible(HomeConstants.BTN_APLY_COUPON_XPATH));
    }
}
