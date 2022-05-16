package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginHomeService;

public class LoginSteps extends PageSteps{
    @Given("El usuario se encuentra en la pagina de Automation Practice")
    public void elUsuarioSeEncuentraEnLaPaginaDeAutomationPractice() {
        LoginHomeService.navegarWeb();
    }
    @When("^El usuario clickea el boton \"(.*)\" del menu$")
    public void elUsuarioClickeaElBotonMyAccount(String boton_cuenta) {
        LoginHomeService.clickMyAccount(boton_cuenta);
    }
    @And("^El usuario ingresa su username \"(.*)\"$")
    public void elUsuarioIngresaSuUsername(String username) {
        LoginHomeService.inputUsername(username);
    }
    @And("^El usuario ingresa su password \"(.*)\"$")
    public void elUsuarioIngresaSuPassword(String password) {
        LoginHomeService.inputPassword(password);
    }
    @And("^El usuario clickea en el boton \"(.*)\"$")
    public void elUsuarioClickeaEnElBotonLogin(String boton_login) {
        LoginHomeService.clickLogin();
    }
    @Then("El usuario verifica que ingreso correctamente a la web")
    public void elUsuarioVerificaQueIngresoCorrectamenteALaWeb() {
        LoginHomeService.verificarLogin();
    }
    @Then("La web muestra un mensaje de error por no encontrar el username")
    public void laWebMuestraUnMensajeDeErrorPorNoEncontrarElUsername() {
        LoginHomeService.noLoginUsername404();
    }
    @Then("La web muestra un mensaje pidiendo el password")
    public void laWebMuestraUnMensajePidiendElPassword() {
        LoginHomeService.noLoginPassword412();
    }
    @Then("La web muestra un mensaje pidiendo el username")
    public void laWebMuestraUnMensajePidiendoElUsername() {
        LoginHomeService.noLoginUsername412();
    }
    @And("^El usuario ingresa un password random \"(.*)\"$")
    public void elUsuarioIngresaUnPasswordRandom(String password) {
        LoginHomeService.inputPassword(password);
    }
    @Then("La web muestra asteriscos en el textbox password")
    public void laWebMuestraAsteriscosEnElTextboxPassword() {
        LoginHomeService.checkPasswordSecurity();
    }
    @Then("La web muestra un mensaje de contrasena incorrecta")
    public void laWebMuestraUnMensajeDeContrasenaIncorrecta() {
        LoginHomeService.noLoginPassword409();
    }
    @And("^El usuario clickea en el boton de \"(.*)\"$")
    public void elUsuarioClickeaEnElBotonDeLogout(String boton_logout) {
        LoginHomeService.clickLogout(boton_logout);
    }
    //No se como identificar el boton de retorno, utilice un camino secundario
    //@And("^El usuario apreta el boton de \"(.*)\"$")
    //public void elUsuarioApretaElBotonDeRetorno(String boton_retorno) {
    //automationTestingHomeService.clickMyAccount(boton_retorno);
    //}
    @Then("El usuario no deberia estar logueado en la pagina")
    public void elUsuarioNoDeberiaEstarLogueadoEnLaPagina() {
        LoginHomeService.verificarLogin();
    }
}
