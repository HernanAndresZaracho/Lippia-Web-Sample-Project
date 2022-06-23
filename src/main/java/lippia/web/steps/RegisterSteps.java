package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.RegisterConstants;
import lippia.web.services.RegisterService;
import lippia.web.validator.registerValidator;

public class RegisterSteps extends PageSteps {
    @And("^El usuario ingresa un username (.*)$")
    public void elUsuarioIngresaUnUsername(String username) {
        RegisterService.inputNewUsername(username);
    }
    @And("^El usuario ingresa un password (.*)$")
    public void elUsuarioIngresaUnPassword(String Password) {
        RegisterService.inputNewPassword(Password);
    }
    @And("^El usuario clickea en el boton Register para registrarse$")
    public void elUsuarioClickeaEnElBotonParaRegistrarse() {
        RegisterService.clickRegister(RegisterConstants.BTN_REGISTER_XPATH);
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
}
