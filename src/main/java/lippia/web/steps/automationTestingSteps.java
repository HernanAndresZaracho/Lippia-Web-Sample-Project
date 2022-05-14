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
        automationTestingHomeService.clickLogout();
    }
    //No se como identificar el boton de retorno, utilice un camino secundario
    @And("^El usuario apreta el boton de \"(.*)\"$")
    public void elUsuarioApretaElBotonDeRetorno(String boton_retorno) {
        automationTestingHomeService.clickMyAccount(boton_retorno);
    }
    @Then("El usuario no deberia estar logueado en la pagina")
    public void elUsuarioNoDeberiaEstarLogueadoEnLaPagina() {
        automationTestingHomeService.verificarLogueo();
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
