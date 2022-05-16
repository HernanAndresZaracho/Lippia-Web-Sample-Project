package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.AccountHomeService;
import lippia.web.services.LoginHomeService;
public class AccountSteps extends PageSteps{
    @Then("El usuario verifica que ve el Dashboard")
    public void elUsuarioVerificaQueVeElDashboard() {
        AccountHomeService.verificarDashboard();
    }
    @And("^El usuario clickea el boton \"(.*)\" para ir a las ordenes de compra$")
    public void elUsuarioClickeaElBotonParaIrALasOrdenesDeCompra(String boton_orders) {
        AccountHomeService.clickOrders(boton_orders);
    }
    @Then("El usuario ve la pagina con las ordenes de compra")
    public void elUsuarioVeLaPaginaConLasOrdenesDeCompra() {
        AccountHomeService.verificarOrdenes();
    }
    @And("^El usuario clickea en el boton \"(.*)\" para ver su orden de compra$")
    public void elUsuarioClickeaEnElBotonParaVerSuOrdenDeCompra(String boton_orders_view) {
        AccountHomeService.clickOrdersView(boton_orders_view);
    }
    @Then("El usuario visualiza los detalles de su orden")
    public void elUsuarioVisualizaLosDetallesDeSuOrden() {
        AccountHomeService.verificarOrdersDetails();
    }
    @Then("El usuario visualiza el numero de orden y su status")
    public void elUsuarioVisualizaElNumeroDeOrdenYSuStatus() {
        AccountHomeService.verificarNumeroYFechaOrders();
    }
    @And("^El usuario clickea el boton \"(.*)\" para ver su direccion$")
    public void elUsuarioClickeaElBotonParaVerSuDireccion(String boton_address) {
        AccountHomeService.clickAddress(boton_address);
    }
    @Then("El usuario visualiza el billing and shipping address")
    public void elUsuarioVisualizaElBillingAndShippingAddress() {
        AccountHomeService.verificarBillingShipping();
    }
    @And("^El usuario clickea el boton \"(.*)\" en Shipping Address$")
    public void elUsuarioClickeaElBotonEnShippingAddress(String boton_shipping) {
        AccountHomeService.clickShipping(boton_shipping);
    }
    @Then("El usuario puede editar su Shipping Address")
    public void elUsuarioPuedeEditarSuShippingAddress() {
        AccountHomeService.verificarShippingEdit();
    }
    @And("^El usuario clickea el boton \"(.*)\" para ver detalle de su cuenta$")
    public void elUsuarioClickeaElBotonParaVerDetalleDeSuCuenta(String boton_account_details) {
        AccountHomeService.clickAccountDetails(boton_account_details);
    }
    @Then("El usuario visualiza que puede cambiar su password")
    public void elUsuarioVisualizaQuePuedeCambiarSuPassword() {
        AccountHomeService.verificarAccountDetailsEditPassword();
    }
    @And("^El usuario clickea el boton \"(.*)\" para desloguarse$")
    public void elUsuarioClickeaElBotonParaDesloguearse(String boton_logout) {
        LoginHomeService.clickLogout(boton_logout);
    }
    @Then("El usuario verifica que se deslogueo")
    public void elUsuarioVerificaQueSeDeslogueo() {
        AccountHomeService.verificarLogout();
    }
}
