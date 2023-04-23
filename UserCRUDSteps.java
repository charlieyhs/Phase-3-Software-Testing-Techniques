package starter.CRUD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserCRUDSteps {
    @Steps
    UserCRUDStepsImplementation userCRUDStepsImplementation;

    /**
     * @Author: Carlos Yecid Hernandez Sanchez
     * @Since 22/04/2023
     *
     * Funciona para el Scenario "Visualizar registros"
     * y el Scenario "Buscar un usuario"
     */
    @Given("que estoy en la pagina de listado de usuarios")
    public void queEstoyEnLaPaginaDeCreacionDeUsuarios() {
        userCRUDStepsImplementation.abrirPaginaCreacionUsuario();
    }
    /**
     * @Author: Carlos Yecid Hernandez Sanchez
     * @Since 22/04/2023
     */
    @Then("se pueden visualizar todos los datos del listado correctamente")
    public void visualizacionRegistrosCorrectamente(){
        userCRUDStepsImplementation.visualizacionCorrectaRegistros();
    }

    /**
     * @Author: Carlos Yecid Hernandez Sanchez
     * @Since 22/04/2023
     */
    @When("ingreso los datos del usuario")
    public void ingresoLosDatosDelUsuario() {
        userCRUDStepsImplementation.ingresarDatosUsuario();
    }
    /**
     * @Author: Carlos Yecid Hernandez Sanchez
     * @Since 22/04/2023
     */
    @And("presiono el botón de guardar")
    public void presionoElBotonDeGuardar() {
        userCRUDStepsImplementation.clicBotonGuardar();
    }
    /**
     * @Author: Carlos Yecid Hernandez Sanchez
     * @Since 22/04/2023
     */
    @Then("el usuario es creado correctamente")
    public void elUsuarioEsCreadoCorrectamente() {
        userCRUDStepsImplementation.verificacionCreacionUsuario();
    }
    /**
     * @Author: Jhon Jayder Velasco Ovalle
     * @Since 25/04/2023
     */
    @When("modifico los datos del usuario")
    public void modificoLosDatosDelUsuario() {
        userCRUDStepsImplementation.abrirPaginaEdicionUsuarios();
    }
    @And("presiono el botón de actualizar")
    public void presionoBotonModificar() {
        userCRUDStepsImplementation.clickBotonActualizar();
    }
    /**
     * @Author: Jhon Jayder Velasco Ovalle
     * @Since 25/04/2023
     */
    @Then("el usuario es actualizado correctamente")
    public void elUsuarioEsActualizadoCorrectamente() {
        userCRUDStepsImplementation.verificacionUsuarioActualizado();
    }


















    /**
     * @Author: Carlos Yecid Hernandez Sanchez
     * @Author: Jhon Jayder Velasco Ovalle
     * @Since 22/04/2023
     */
    @When("digito un codigo en la caja de busqueda")
    public void digitaCodigoCajaBusqueda(){
        userCRUDStepsImplementation.digitaCodigoBusqueda();
    }
    /**
     * @Author: Carlos Yecid Hernandez Sanchez
     * @Author: Jhon Jayder Velasco Ovalle
     * @Since 22/04/2023
     */
    @And("presiono el boton de buscar")
    public void presionoBotonBusqueda(){
        userCRUDStepsImplementation.clicBotonBuscar();
    }
    /**
     * @Author: Carlos Yecid Hernandez Sanchez
     * @Author: Jhon Jayder Velasco Ovalle
     * @Since 22/04/2023
     */
    @Then("el usuario es mostrado correctamente")
    public void usuarioMostradoCorrectamente(){
        userCRUDStepsImplementation.usuarioBusquedaCorrecto();
    }
}
