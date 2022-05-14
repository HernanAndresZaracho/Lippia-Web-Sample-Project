package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.automationTestingConstants;
import lippia.web.services.automationTestingHomeService;

public class automationTestingSteps extends PageSteps {

    //Login
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
    @Then("El usuario verifica que no ingreso a la web")
    public void elUsuarioVerificaQueNoIngresoCorrectamenteALaWeb() {
        automationTestingHomeService.verificarNoLogin();
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


}
