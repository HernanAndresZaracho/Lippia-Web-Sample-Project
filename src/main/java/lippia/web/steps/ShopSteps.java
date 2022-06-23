package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.ShopService;
import lippia.web.validator.shopValidator;

public class ShopSteps extends PageSteps{
    @When("El usuario agrega un libro al carrito")
    public void elUsuarioAgregaUnLibroAlCarrito() {
        ShopService.clickAddHTMLForms();
    }
    @Then("El usuario comprueba que varia los impuestos para la (.*)")
    public void elUsuarioCompruebaQueVariaLosImpuestosParaLaIndia(String pais) {
        HomeService.inputBillingCountry(pais);
    }

    @And("Los impuestos para la India son 2% para los demas 5%")
    public void losImpuestosParaLaIndiaSonParaLosDemas() {
        shopValidator.validateTaxIndia();
    }
}
