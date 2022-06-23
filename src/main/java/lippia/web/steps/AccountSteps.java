package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.*;
import lippia.web.services.AccountService;
import lippia.web.services.LoginService;
import lippia.web.validator.accountValidator;

public class AccountSteps extends PageSteps{
    @Then("El usuario verifica que ve el Dashboard")
    public void elUsuarioVerificaQueVeElDashboard() {
        accountValidator.verificarDashboard();
    }
    @And("^El usuario clickea el boton Orders para ir a las ordenes de compra$")
    public void elUsuarioClickeaElBotonParaIrALasOrdenesDeCompra() {
        AccountService.clickOrders();
    }
    @Then("El usuario ve la pagina con las ordenes de compra")
    public void elUsuarioVeLaPaginaConLasOrdenesDeCompra() {
        accountValidator.verificarOrdenes();
    }
    @And("^El usuario clickea en el boton View para ver su orden de compra$")
    public void elUsuarioClickeaEnElBotonParaVerSuOrdenDeCompra() {
        AccountService.clickOrdersView();
    }
    @Then("El usuario visualiza los detalles de su orden")
    public void elUsuarioVisualizaLosDetallesDeSuOrden() {
        accountValidator.verificarOrdersDetails();
    }
    @Then("El usuario visualiza el numero de orden y su status")
    public void elUsuarioVisualizaElNumeroDeOrdenYSuStatus() {
        accountValidator.verificarNumeroYFechaOrders();
    }
    @And("^El usuario clickea el boton Address para ver su direccion$")
    public void elUsuarioClickeaElBotonParaVerSuDireccion() {
        AccountService.clickAddress();
    }
    @Then("El usuario visualiza el billing and shipping address")
    public void elUsuarioVisualizaElBillingAndShippingAddress() {
        accountValidator.verificarBillingShipping();
    }
    @And("^El usuario clickea el boton Edit en Shipping Address$")
    public void elUsuarioClickeaElBotonEnShippingAddress() {
        AccountService.clickShipping();
    }
    @Then("El usuario puede editar su Shipping Address")
    public void elUsuarioPuedeEditarSuShippingAddress() {
        accountValidator.verificarShippingEdit();
    }
    @And("^El usuario clickea el boton Account Details para ver detalle de su cuenta$")
    public void elUsuarioClickeaElBotonParaVerDetalleDeSuCuenta() {
        AccountService.clickAccountDetails();
    }
    @Then("El usuario visualiza que puede cambiar su password")
    public void elUsuarioVisualizaQuePuedeCambiarSuPassword() {
        accountValidator.verificarAccountDetailsEditPassword();
    }
    @And("^El usuario clickea el boton Logout$")
    public void elUsuarioClickeaElBotonParaDesloguearse() {
        LoginService.clickLogout();
    }
    @Then("El usuario verifica que se deslogueo")
    public void elUsuarioVerificaQueSeDeslogueo() {
        accountValidator.verificarLogout();
    }

    @Given("El usuario se encuentra logueado")
    public void elUsuarioSeEncuetraLogueado() {
        LoginService.doLogin(PropertyManager.getProperty("mail"), PropertyManager.getProperty("password"));
    }
}
