package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.ShopConstants;
import lippia.web.validator.homeValidator;
import org.testng.Assert;

import java.util.Objects;

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
        if(homeValidator.checkStock()){
            Assert.assertTrue(isVisible(HomeConstants.BTN_ADD_BASKET_ARRIVAL_XPATH),"El libro se encuentra fuera de stock");
        }
        else{
            click(HomeConstants.BTN_ADD_BASKET_XPATH);
        }

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
        inputBillingCountry("Argentina");
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
        if(Objects.equals(text, "India")){
            click("id:select2-chosen-1");
            setInput("id:s2id_autogen1_search",text);
            click("xpath:(//div[contains(@id,'select2-result-label')])[2]");
            //click(ShopConstants.BTN_SELECTED_COUNTRY_XPATH);
            //setInput(ShopConstants.SELECT_COUNTRY_TEXTBOX_XPATH,text);
            //click(ShopConstants.BTN_SELECT_XPATH);
        }
        else{
            click("id:select2-chosen-1");
            setInput("id:s2id_autogen1_search",text);
            click(ShopConstants.BTN_SELECT_XPATH);
        }
    }
    public static void inputBillingState(String text) {
        click(ShopConstants.BTN_SELECTED_STATE_XPATH);
        setInput(ShopConstants.SELECT_STATE_TEXTBOX_XPATH,text);
        click(ShopConstants.BTN_SELECT_XPATH);
    }

}
