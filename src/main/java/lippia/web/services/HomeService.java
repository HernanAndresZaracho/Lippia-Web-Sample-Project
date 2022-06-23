package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomeConstants;
import org.testng.Assert;

public class HomeService extends ActionManager{

    public static void clickShop(){
        click(HomeConstants.BTN_SHOP_XPATH);
    }
    public static void clickHome(){
        click(HomeConstants.BTN_HOME_XPATH);
    }
    public static void clickNextArrival(){
        click(HomeConstants.BTN_HOME_NEXT_ARRIVAL_XPATH);
    }
    public static void clickArrivalHtml(){
        click(HomeConstants.BTN_ARRIVAL_HTML_XPATH);
    }
    public static void clickHTMLForms(){
        click(HomeConstants.BTN_HTML_FORMS_XPATH);
    }


    public static void clickAddBasket(){
        click(HomeConstants.BTN_ADD_BASKET_XPATH);
    }
    public static void clickViewBasket(){
        click(HomeConstants.BTN_VIEW_BASKET_XPATH);
    }
    public static void clickCheckout(){
        click(HomeConstants.BTN_CHECKOUT_XPATH);
    }
    public static void clickCheckoutBank(){
        click(HomeConstants.BTN_CHECKOUT_BANK_XPATH);
    }
    public static void clickPlaceOrder(){
        click(HomeConstants.BTN_PLACE_ORDER_XPATH);
    }




     public static void completaDatosPersonales(){
        inputBillingName("Hernan");
        inputBillingLastname("Zaracho");
        inputBillingEmail("hernancrowdar22@test.com");
        inputBillingPhone("3794001122");
        inputBillingAddress("Avenida siempre viva");
        inputBillingCity("Capital");
        inputBillingPostal("3400");
        //inputBillingCountry("Argentina");
        //inputBillingState("Corrientes");
    }



    public static void inputBillingName(String text) {
        setInput(HomeConstants.INPUT_BILLING_NAME_XPATH, text,true);
    }
    public static void inputBillingLastname(String text) {
        setInput(HomeConstants.INPUT_BILLING_LASTNAME_XPATH, text,true);
    }
    public static void inputBillingEmail(String text) {
        setInput(HomeConstants.INPUT_BILLING_EMAIL_XPATH, text,true);
    }
    public static void inputBillingPhone(String text) {
        setInput(HomeConstants.INPUT_BILLING_PHONE_XPATH, text,true);
    }
    public static void inputBillingAddress(String text) {
        setInput(HomeConstants.INPUT_BILLING_ADDRESS_XPATH, text,true);
    }
    public static void inputBillingCity(String text) {
        setInput(HomeConstants.INPUT_BILLING_CITY_XPATH, text,true);
    }
    public static void inputBillingPostal(String text) {
        setInput(HomeConstants.INPUT_BILLING_POSTAL_XPATH, text,true);
    }
    public static void inputBillingCountry(String text) {
        setInput(HomeConstants.INPUT_BILLING_COUNTRY_XPATH, text,true);
    }
    public static void inputBillingState(String text) {
        setInput(HomeConstants.INPUT_BILLING_STATE_XPATH, text,true);
    }

}
