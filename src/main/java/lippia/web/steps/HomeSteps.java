package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.validator.homeValidator;

public class HomeSteps extends PageSteps{
    @When("El usuario clickea el boton Shop del menu")
    public void elUsuarioClickeaElBotonShopDelMenu() {
        HomeService.clickShop();
    }

    @And("El usuario clickea el boton home")
    public void elUsuarioClickeaElBotonHome() {
        HomeService.clickHome();
    }

    @And("Prueba que la pagina contenga 3 libros")
    public void pruebaQueLaPaginaContengaLibros() {
        homeValidator.checkArrivals();
    }

    @Then("Verifica que exiten 3 libros")
    public void verificaQueExitenLibros() {
        homeValidator.checkBooks();
    }

    @When("El usuario clickea en cualquier arrival")
    public void elUsuarioClickeaEnCualquierArrival() {
        HomeService.clickArrivalHtml();
    }

    @Then("Verifica que navego a la pagina del arrival seleccionado")
    public void verificaQueNavegoALaPaginaDelArrivalSeleccionado() {
        homeValidator.checkHTMLPage();
    }

    @When("El usuario clickea en un libro a su eleccion")
    public void elUsuarioClickeaEnUnLibroASuEleccion() {
        HomeService.clickHTMLForms();
    }

    @And("El usuario agrega el libro al carrito")
    public void elUsuarioAgregaElLibroAlCarrito() {
        HomeService.clickAddBasket();
    }

    @Then("Verifica que su libro se agrego al carrito")
    public void verificaQueSuLibroSeAgregoAlCarrito() {
        homeValidator.checkBookAddedBasket();
    }

    @And("El usuario visualiza el precio en el carrito del menu")
    public void elUsuarioVisualizaElPrecioEnElCarritoDelMenu() {
        homeValidator.checkCartAdded();
    }

    @When("El usuario clickea en el mensaje de View Basket")
    public void elUsuarioClickeaEnElViewBasket() {
        HomeService.clickViewBasket();
    }

    @Then("El usuario visualiza valores totales y subtotales")
    public void elUsuarioVisualizaValoresTotalesYSubtotales() {
        homeValidator.checkSubTotals();
    }

    @And("El valor total es mayor al subtotal")
    public void elValorTotalEsMayorAlSubtotal() {
        homeValidator.checkTotalMayor();
    }

    @When("El usuario clickea el boton de Continuar Pago")
    public void elUsuarioClickeaElBotonDeContinuarPago() {
        HomeService.clickCheckout();
    }

    @And("El usuario completa sus datos")
    public void elUsuarioCompletaSusDatos() {
        HomeService.completaDatosPersonales();
    }

    @And("El usuario puede agregar un cupon de descuento")
    public void elUsuarioPuedeAgregarUnCuponDeDescuento() {
        homeValidator.checkoutCoupon();

    }
    @And("El usuario clickea en el boton de Pago")
    public void elUsuarioClickeaEnElBotondePago() {
        HomeService.clickCheckoutBank();
    }
    @And("El usuario clickea en el boton Realizar Pedido")
    public void elUsuarioClickeaEnElBotonRealizarPedido() {
        HomeService.clickPlaceOrder();
    }

    @And("El pedido se completa")
    public void elPedidoSeCompleta() {
        homeValidator.checkBuy();
    }

    @Then("El usuario visualiza los detalles de su orden de compra")
    public void elUsuarioVisualizaLosDetallesDeSuOrdenDeCompra() {
        homeValidator.checkOrders();
    }
}
