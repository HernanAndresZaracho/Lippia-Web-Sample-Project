package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.github.jknack.handlebars.internal.antlr.atn.SemanticContext;
import lippia.web.constants.automationTestingConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class automationTestingHomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    //Login
    public static void clickMyAccount(String text) {
        click(automationTestingConstants.BTN_MYACCOUNT_ID, text);
    }
    public static void inputUsername(String text) {
        setInput(automationTestingConstants.INPUT_USERNAME_ID, text);
    }
    public static void inputPassword(String text) {
        setInput(automationTestingConstants.INPUT_PASSWORD_ID, text);
    }
    public static void clickLogin() {
        click(automationTestingConstants.BTN_LOGIN_XPATH);
    }
    public static void verificarLogin() {
        Assert.assertTrue(isVisible(automationTestingConstants.BTN_LOGOUT_XPATH));
    }
    public static void noLoginUsername404() {
        Assert.assertTrue(isVisible(automationTestingConstants.LI_USERNAME404_XPATH));
    }
    public static void noLoginPassword412() {
        Assert.assertTrue(isVisible(automationTestingConstants.LI_PASSWORD412_XPATH));
    }
    public static void noLoginUsername412() {
        Assert.assertTrue(isVisible(automationTestingConstants.LI_USERNAME412_XPATH));
    }
    public static void noLoginPassword409() {
        Assert.assertTrue(isVisible(automationTestingConstants.LI_PASSWORD409_XPATH));
    }
    public static void checkPasswordSecurity() {
        Assert.assertTrue(isVisible(automationTestingConstants.INPUT_PASSWORD_SECURITY_XPATH));
    }
    public static void clickLogout(String text){
        click(automationTestingConstants.BTN_LOGOUT_XPATH);
    }
    public static void verificarLogueo() {
        Assert.assertTrue(isVisible(automationTestingConstants.BTN_LOGIN_XPATH ));
    }


    //Register
    public static void inputNewUsername(String text) {
        setInput(automationTestingConstants.INPUT_NEW_USERNAME_ID, text);
    }
    public static void inputNewPassword(String text) {
        setInput(automationTestingConstants.INPUT_NEW_PASSWORD_ID, text);
    }
    public static void clickRegister(String text) {
        click(automationTestingConstants.BTN_REGISTER_XPATH);
    }
    public static void verificarRegister() {
        Assert.assertTrue(isVisible(automationTestingConstants.BTN_DASHBOARD_XPATH));
    }
    public static void noRegisterUsername(){
        Assert.assertTrue(isVisible(automationTestingConstants.LI_USERNAME_INVALID_XPATH));
    }
    public static void noRegisterPassword(){
        Assert.assertTrue(isVisible(automationTestingConstants.LI_PASSWORD_INVALID_XPATH));
    }


    //Account
    public static void verificarDashboard(){
        Assert.assertTrue(isVisible(automationTestingConstants.BTN_DASHBOARD_XPATH));
    }
    public static void clickOrders(String text){
        click(automationTestingConstants.BTN_ORDERS_XPATH);
    }
    public static void verificarOrdenes(){
        Assert.assertTrue(isVisible(automationTestingConstants.TD_ORDERS_VIEW_XPATH));
    }
    public static void clickOrdersView(String text){
        click(automationTestingConstants.BTN_ORDERS_VIEW_XPATH);
    }
    public static void verificarOrdersDetails(){
        Assert.assertTrue(isVisible(automationTestingConstants.MRK_ORDERS_NUMBER_XPATH));
    }
    public static void verificarNumeroYFechaOrders(){
        Assert.assertTrue(isVisible(automationTestingConstants.MRK_ORDERS_NUMBER_XPATH));
        Assert.assertTrue(isVisible(automationTestingConstants.MRK_ORDERS_DATE_XPATH));
    }
    public static void clickAddress(String text){
        click(automationTestingConstants.BTN_ADDRESS_XPATH);
    }
    public static void verificarBillingShipping(){
        Assert.assertTrue(isVisible(automationTestingConstants.DIV_BILLING_SHIPPING_XPATH));
    }
    public static void clickShipping(String text){
        click(automationTestingConstants.BTN_SHIPPING_XPATH);
    }
    public static void verificarShippingEdit(){
        Assert.assertTrue(isVisible(automationTestingConstants.INPUT_SHIPPING_FIRSTNAME_ID));
    }
    public static void clickAccountDetails(String text){
        click(automationTestingConstants.BTN_ACCOUNT_DETAILS_XPATH);
    }
    public static void verificarAccountDetailsEditPassword(){
        Assert.assertTrue(isVisible(automationTestingConstants.INPUT_ACCOUNT_CHANGE_PASSWORD_ID));
    }
    public static void verificarLogout(){
        Assert.assertTrue(isVisible(automationTestingConstants.BTN_LOGIN_XPATH));
    }
}
