package lippia.web.constants;

public class ShopConstants {
    //BUTTON
    public static final String BTN_HTML_FORMS_ADD_XPATH = "xpath://a[@data-product_id='181']";
    public static final String BTN_SELECTED_COUNTRY_XPATH = "xpath://div[@class='select2-container country_to_state country_select']/a/span[@id='select2-chosen-1']";
    ////div[@class='select2-container country_to_state country_select']/a/span/b[@role='presentation']
    public static final String BTN_SELECTED_STATE_XPATH = "xpath://div/a/span[@id='select2-chosen-3168']";
    ////div[@class='select2-container state_select']/a/span/b[@role='presentation']
    public static final String BTN_SELECT_XPATH = "xpath://div[contains(@class,'select2-result-label')]";


    //VIEW
    public static final String VIEW_TAX_INDIAN_XPATH = "xpath://tr[@class='tax-rate tax-rate-in-tax-1']//span[@class='woocommerce-Price-amount amount']";
    public static final String VIEW_SUBTOTAL_XPATH = "xpath://tr[@class='cart-subtotal']//span[@class='woocommerce-Price-amount amount']";
    //IMAGEN

    //MESSAGE

    //INPUT
    public static final String INPUT_CHOISE_COUNTRY_XPATH = "xpath://div[@class='select2-container country_to_state country_select']/div/div/input[@class='select2-input']";
    public static final String INPUT_CHOISE_STATE_XPATH = "xpath://div[@class='select2-container country_to_state country_select']/div/div/input[@class='select2-input']";

    public static final String SELECT_COUNTRY_TEXTBOX_XPATH = "xpath://input[@id='s2id_autogen1_search']";
    ////div[@id='select2-drop']/div[@class='select2-search']/input[@class='select2-input']
    public static final String SELECT_STATE_TEXTBOX_XPATH = "xpath://input[@id='s2id_autogen3168_search']";
    ////span[@class='select2-match']
}
