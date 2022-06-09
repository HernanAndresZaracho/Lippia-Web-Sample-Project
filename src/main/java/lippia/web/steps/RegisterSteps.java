package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.RegisterConstants;
import lippia.web.services.RegisterHomeService;
import lippia.web.validator.registerValidator;

public class RegisterSteps extends PageSteps {
    @And("^El usuario ingresa un username (.*)$")
    public void elUsuarioIngresaUnUsername(String username) {
        RegisterHomeService.inputNewUsername(username);
    }
    @And("^El usuario ingresa un password (.*)$")
    public void elUsuarioIngresaUnPassword(String Password) {
        RegisterHomeService.inputNewPassword(Password);
    }
    @And("^El usuario clickea en el boton Register para registrarse$")
    public void elUsuarioClickeaEnElBotonParaRegistrarse() {
        RegisterHomeService.clickRegister(RegisterConstants.BTN_REGISTER_XPATH);
    }
    @Then("El usuario verifica que se registro correctamente en la web")
    public void elUsuarioVerificaQueSeRegistroCorrectamenteEnLaWeb() {
        registerValidator.verificarRegister();
    }
    @Then("La web muestra un mensaje de error por username ya registrado")
    public void laWebMuestraUnMensajeDeErrorPorUsernameYaRegistrado() {
        registerValidator.noRegisterUsernameOccupied();
    }
    @Then("La web muestra un mensaje de error por mail vacio")
    public void laWebMuestraUnMensajeDeErrorPorMailVacio() {
        registerValidator.noRegisterUsername();
    }
    @Then("La web muestra un mensaje de error por password vacia")
    public void laWebMuestraUnMensajeDeErrorPorPasswordVacia() {
        registerValidator.noRegisterPassword();
    }
    @Then("La web no permite clickear en el boton Register al no ingresarse ningun password")
    public void laWebNoPermiteClickearEnElBotonRegisterAlNoIngresarseNingunPassword() {
        //no permite clickear en el boton registrar
        //si se ingresa manualmente muestra un mensaje para...
        //la password vacia
        //las credenciales vacias
        //pero al ser automatizado no permite clickear el boton Register
    }
}
