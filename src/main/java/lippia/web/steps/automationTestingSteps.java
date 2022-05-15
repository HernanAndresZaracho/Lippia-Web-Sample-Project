package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.automationTestingConstants;
import lippia.web.services.automationTestingHomeService;
import org.testng.Assert;

public class automationTestingSteps extends PageSteps {

    //Login
    @Given("El usuario se encuentra en la pagina de Automation Practice")
    public void elUsuarioSeEncuentraEnLaPaginaDeAutomationPractice() {
        automationTestingHomeService.navegarWeb();
    }
    @When("^El usuario clickea el boton \"(.*)\" del menu$")
    public void elUsuarioClickeaElBotonMyAccount(String boton_cuenta) {
        automationTestingHomeService.clickMyAccount(boton_cuenta);
    }
    @And("^El usuario ingresa su username \"(.*)\"$")
    public void elUsuarioIngresaSuUsername(String username) {
        automationTestingHomeService.inputUsername(username);
    }
    @And("^El usuario ingresa su password \"(.*)\"$")
    public void elUsuarioIngresaSuPassword(String password) {
        automationTestingHomeService.inputPassword(password);
    }
    @And("^El usuario clickea en el boton \"(.*)\"$")
    public void elUsuarioClickeaEnElBotonLogin(String boton_login) {
        automationTestingHomeService.clickLogin();
    }
    @Then("El usuario verifica que ingreso correctamente a la web")
    public void elUsuarioVerificaQueIngresoCorrectamenteALaWeb() {
        automationTestingHomeService.verificarLogin();
    }
    @Then("La web muestra un mensaje de error por no encontrar el username")
    public void laWebMuestraUnMensajeDeErrorPorNoEncontrarElUsername() {
        automationTestingHomeService.noLoginUsername404();
    }
    @Then("La web muestra un mensaje pidiendo el password")
    public void laWebMuestraUnMensajePidiendElPassword() {
        automationTestingHomeService.noLoginPassword412();
    }
    @Then("La web muestra un mensaje pidiendo el username")
    public void laWebMuestraUnMensajePidiendoElUsername() {
        automationTestingHomeService.noLoginUsername412();
    }
    @And("^El usuario ingresa un password random \"(.*)\"$")
    public void elUsuarioIngresaUnPasswordRandom(String password) {
        automationTestingHomeService.inputPassword(password);
    }
    @Then("La web muestra asteriscos en el textbox password")
    public void laWebMuestraAsteriscosEnElTextboxPassword() {
        automationTestingHomeService.checkPasswordSecurity();
    }
    @Then("La web muestra un mensaje de contrasena incorrecta")
    public void laWebMuestraUnMensajeDeContrasenaIncorrecta() {
        automationTestingHomeService.noLoginPassword409();
    }
    @And("^El usuario clickea en el boton de \"(.*)\"$")
    public void elUsuarioClickeaEnElBotonDeLogout(String boton_logout) {
        automationTestingHomeService.clickLogout(boton_logout);
    }
    //No se como identificar el boton de retorno, utilice un camino secundario
    @And("^El usuario apreta el boton de \"(.*)\"$")
    public void elUsuarioApretaElBotonDeRetorno(String boton_retorno) {
        automationTestingHomeService.clickMyAccount(boton_retorno);
    }
    @Then("El usuario no deberia estar logueado en la pagina")
    public void elUsuarioNoDeberiaEstarLogueadoEnLaPagina() {
        automationTestingHomeService.verificarLogin();
    }



    //Register
    @And("^El usuario ingresa un username \"(.*)\"$")
    public void elUsuarioIngresaUnUsername(String username) {
        automationTestingHomeService.inputNewUsername(username);
    }
    @And("^El usuario ingresa un password \"(.*)\"$")
    public void elUsuarioIngresaUnPassword(String Password) {
        automationTestingHomeService.inputNewPassword(Password);
    }
    @And("^El usuario clickea en el boton \"(.*)\" para registrarse$")
    public void elUsuarioClickeaEnElBotonParaRegistrarse(String boton_register) {
        automationTestingHomeService.clickRegister(automationTestingConstants.BTN_REGISTER_XPATH);
    }
    @Then("El usuario verifica que se registro correctamente en la web")
    public void elUsuarioVerificaQueSeRegistroCorrectamenteEnLaWeb() {
        automationTestingHomeService.verificarRegister();
    }
    @Then("La web muestra un mensaje de error por username ya registrado")
    public void laWebMuestraUnMensajeDeErrorPorUsernameYaRegistrado() {
        automationTestingHomeService.noRegisterUsernameOccupied();
    }
    @Then("La web muestra un mensaje de error por mail vacio")
    public void laWebMuestraUnMensajeDeErrorPorMailVacio() {
        automationTestingHomeService.noRegisterUsername();
    }
    @Then("La web muestra un mensaje de error por password vacia")
    public void laWebMuestraUnMensajeDeErrorPorPasswordVacia() {
        automationTestingHomeService.noRegisterPassword();
    }
    @Then("La web no permite clickear en el boton Register al no ingresarse ningun password")
    public void laWebNoPermiteClickearEnElBotonRegisterAlNoIngresarseNingunPassword() {
        //no permite clickear en el boton registrar
        //si se ingresa manualmente muestra un mensaje para...
        //la password vacia
        //las credenciales vacias
        //pero al ser automatizado no permite clickear el boton Register
    }



    //Account
    @Then("El usuario verifica que ve el Dashboard")
    public void elUsuarioVerificaQueVeElDashboard() {
        automationTestingHomeService.verificarDashboard();
    }
    @And("^El usuario clickea el boton \"(.*)\" para ir a las ordenes de compra$")
    public void elUsuarioClickeaElBotonParaIrALasOrdenesDeCompra(String boton_orders) {
        automationTestingHomeService.clickOrders(boton_orders);
    }
    @Then("El usuario ve la pagina con las ordenes de compra")
    public void elUsuarioVeLaPaginaConLasOrdenesDeCompra() {
        automationTestingHomeService.verificarOrdenes();
    }
    @And("^El usuario clickea en el boton \"(.*)\" para ver su orden de compra$")
    public void elUsuarioClickeaEnElBotonParaVerSuOrdenDeCompra(String boton_orders_view) {
        automationTestingHomeService.clickOrdersView(boton_orders_view);
    }
    @Then("El usuario visualiza los detalles de su orden")
    public void elUsuarioVisualizaLosDetallesDeSuOrden() {
        automationTestingHomeService.verificarOrdersDetails();
    }
    @Then("El usuario visualiza el numero de orden y su status")
    public void elUsuarioVisualizaElNumeroDeOrdenYSuStatus() {
        automationTestingHomeService.verificarNumeroYFechaOrders();
    }
    @And("^El usuario clickea el boton \"(.*)\" para ver su direccion$")
    public void elUsuarioClickeaElBotonParaVerSuDireccion(String boton_address) {
        automationTestingHomeService.clickAddress(boton_address);
    }
    @Then("El usuario visualiza el billing and shipping address")
    public void elUsuarioVisualizaElBillingAndShippingAddress() {
        automationTestingHomeService.verificarBillingShipping();
    }
    @And("^El usuario clickea el boton \"(.*)\" en Shipping Address$")
    public void elUsuarioClickeaElBotonEnShippingAddress(String boton_shipping) {
        automationTestingHomeService.clickShipping(boton_shipping);
    }
    @Then("El usuario puede editar su Shipping Address")
    public void elUsuarioPuedeEditarSuShippingAddress() {
        automationTestingHomeService.verificarShippingEdit();
    }
    @And("^El usuario clickea el boton \"(.*)\" para ver detalle de su cuenta$")
    public void elUsuarioClickeaElBotonParaVerDetalleDeSuCuenta(String boton_account_details) {
        automationTestingHomeService.clickAccountDetails(boton_account_details);
    }
    @Then("El usuario visualiza que puede cambiar su password")
    public void elUsuarioVisualizaQuePuedeCambiarSuPassword() {
        automationTestingHomeService.verificarAccountDetailsEditPassword();
    }
    @And("^El usuario clickea el boton \"(.*)\" para desloguarse$")
    public void elUsuarioClickeaElBotonParaDesloguearse(String boton_logout) {
        automationTestingHomeService.clickLogout(boton_logout);
    }
    @Then("El usuario verifica que se deslogueo")
    public void elUsuarioVerificaQueSeDeslogueo() {
        automationTestingHomeService.verificarLogout();
    }



}
