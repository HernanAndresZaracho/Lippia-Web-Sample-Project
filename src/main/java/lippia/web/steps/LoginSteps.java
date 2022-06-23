package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginService;
import lippia.web.validator.loginValidator;

public class LoginSteps extends PageSteps{
    @Given("El usuario se encuentra en la pagina de Automation Practice")
    public void elUsuarioSeEncuentraEnLaPaginaDeAutomationPractice() {
        LoginService.navegarWeb();
    }
    @When("^El usuario clickea el boton My Account del menu$")
    public void elUsuarioClickeaElBotonMyAccount() {
        LoginService.clickMyAccount();
    }
    @And("^El usuario ingresa su username (.*)$")
    public void elUsuarioIngresaSuUsername(String username) {
        LoginService.inputUsername(username);
    }
    @And("^El usuario ingresa su password (.*)$")
    public void elUsuarioIngresaSuPassword(String password) {
        LoginService.inputPassword(password);
    }
    @And("^El usuario clickea en el boton Login$")
    public void elUsuarioClickeaEnElBotonLogin() {
        LoginService.clickLogin();
    }
    @Then("El usuario verifica que ingreso correctamente a la web")
    public void elUsuarioVerificaQueIngresoCorrectamenteALaWeb() {
        loginValidator.verificarLogin();
    }
    @Then("La web muestra un mensaje de error por no encontrar el username")
    public void laWebMuestraUnMensajeDeErrorPorNoEncontrarElUsername() {
        loginValidator.noLoginUsername404();
    }
    @Then("La web muestra un mensaje pidiendo el password")
    public void laWebMuestraUnMensajePidiendElPassword() {
        loginValidator.noLoginPassword412();
    }
    @Then("La web muestra un mensaje pidiendo el username")
    public void laWebMuestraUnMensajePidiendoElUsername() {
        loginValidator.noLoginUsername412();
    }
    @And("^El usuario ingresa un password random \"(.*)\"$")
    public void elUsuarioIngresaUnPasswordRandom(String password) {
        LoginService.inputPassword(password);
    }
    @Then("La web muestra asteriscos en el textbox password")
    public void laWebMuestraAsteriscosEnElTextboxPassword() {
        loginValidator.checkPasswordSecurity();
    }
    @Then("La web muestra un mensaje de contrasena incorrecta")
    public void laWebMuestraUnMensajeDeContrasenaIncorrecta() {
        loginValidator.noLoginPassword409();
    }
    @And("^El usuario clickea en el boton Logout$")
    public void elUsuarioClickeaEnElBotonDeLogout() {
        LoginService.clickLogout();
    }
    @Then("El usuario no deberia estar logueado en la pagina")
    public void elUsuarioNoDeberiaEstarLogueadoEnLaPagina() {
        loginValidator.verificarLogout();
    }


}
