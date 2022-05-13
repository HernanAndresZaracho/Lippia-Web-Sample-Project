package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.automationTestingHomeService;
import lippia.web.services.automationTestingSearchResultService;

public class automationTestingSteps extends PageSteps {

    @Given("El usuario se encuentra en la pagina de Automation Practice")
    public void elUsuarioSeEncuentraEnLaPaginaDeAutomationPractice() {
        automationTestingHomeService.navegarWeb();
    }

    @When("^El usuario clickea el boton \"(.*)\" del menu$")
    public void elUsuarioClickeaElBoton(String boton_cuenta) {
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
    public void elUsuarioClickeaEnElBoton(String boton_login) {
        automationTestingHomeService.clickLogin();
    }

    @Then("El usuario verifica que ingreso correctamente a la web")
    public void elUsuarioVerificaQueIngresoCorrectamenteALaWeb() {
        automationTestingHomeService.verificarLogin();
    }

}
