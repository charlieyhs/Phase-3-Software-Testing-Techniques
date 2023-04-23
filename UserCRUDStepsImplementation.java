package starter.CRUD;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class UserCRUDStepsImplementation extends UIInteractionSteps {
    /***
     * @Author Carlos Yecid Hernandez Sanchez
     * @Since 22/04/2023
     * Este método debería navegar a la página de creación de usuario en la aplicación.
     */
    @Step("Abrir página de creación de usuario")
    public void abrirPaginaCreacionUsuario() {
        getDriver().navigate().to("http://localhost/PHP_CRUD");
    }
    @Step("visualizacion registros")
    public void visualizacionCorrectaRegistros() {
        $(".resultado");
    }
    /**
     * @Author Carlos Yecid Hernandez Sanchez
     * @Since 22/04/2023
     * Este método debería ingresar los datos del
     * usuario en los campos correspondientes en la página de creación de usuario.
     * */
    @Step("Ingresar datos del usuario")
    public void ingresarDatosUsuario() {
        $("input[name='name']").type("carlos");
        $("#input[name='surname']").type("hernandez");
        $("#input[name='identity']").type("123456");
        $("#input[name='document']").type("54321");
        $("#input[name='address']").type("Boyaca");
        $("#input[name='telephone']").type("3214567654");
    }
    /**
     * @Author Carlos Yecid Hernandez Sanchez
     * @Since 22/04/2023
     * Este método debería hacer clic en el botón
     * de guardar en la página de creación de usuario.
     * */
    @Step("Presionar botón de guardar")
    public void clicBotonGuardar() {
        $("button[type='submit' name='guardar']").click();
    }
    /**
     * @Author Carlos Yecid Hernandez Sanchez
     * @Since 22/04/2023
     * Este método debería verificar que el usuario ha sido
     * creado correctamente en la aplicación.
     * Se va a revisar con el mensaje de confirmación que se muestra en la pantalla y
     * si el usuario aparece en la lista.
     * */
    @Step("Verificar creación de usuario")
    public void verificacionCreacionUsuario() {
        assert($(".resultado")).containsText("carlos");
        assert ($(".message")).containsText("Empleado Creado!");
    }
    /**
     * @Author: Jhon Jayder Velasco Ovalle
     * @Since 22/04/2023
     * Este método nos ayuda abriendo la página
     * de edición de usuarios con los datos
     * específicos del usuario seleccionado y asi poder
     * editarlos.
     */
    @Step("Abrir página de edición de usuario")
    public void abrirPaginaEdicionUsuarios() {
        seleccionUsuarioLeer();
    }
    /**
     * @Author: Jhon Jayder Velasco Ovalle
     * @Since 22/04/2023
     * Este método nos ayuda a seleccionar un registro de la tabla
     * para poder mostrarlo en la página de edición.
     */
    private void seleccionUsuarioLeer() {
        clickBotonEditar();
        modificacionUsuarios();
        verficacionDatosUsuario();
    }
    /**
     * @Author: Jhon Jayder Velasco Ovalle
     * @Since 22/04/2023
     * Este método nos ayuda a dar clic en el botón
     * de editar en un registro específico.
     */
    private void clickBotonEditar() {
        $("button[type='submit' name='editar']").click();
    }
    /**
     * @Author: Jhon Jayder Velasco Ovalle
     * @Since 22/04/2023
     * Este método nos ayuda Modificar los campos
     * de edición específicos del usuario seleccionado.
     */
    @Step("Modificar datos de usuario")
    private void modificacionUsuarios() {
        limpiarCampos();
        $("input[name='name']").type("jhon");
        $("#input[name='surname']").type("velasco");
        $("#input[name='identity']").type("98765");
        $("#input[name='document']").type("014432");
        $("#input[name='address']").type("Borbur");
        $("#input[name='telephone']").type("3154325764");
    }
    /**
     * @Author Jhon Jayder Velasco Ovalle
     * @Since 22/04/2023
     * Este método debe limpiar los campos que se
     * van a utilizar para rellenar.
     * */
    @Step("limpiar campos del usuario")
    private void limpiarCampos(){
        $("input[name='name']").clear();
        $("input[name='surname']").clear();
        $("input[name='identity']").clear();
        $("input[name='document']").clear();
        $("input[name='address']").clear();
        $("input[name='telephone']").clear();
    }
    /**
     * @Author Jhon Jayder Velasco Ovalle
     * @Since 22/04/2023
     * Este método debería verificar que los datos de usuario
     * seleccionado son correctos.
     * */
    @Step("Verificar detalles de usuario")
    private void verficacionDatosUsuario() {
        $("input[name='name']").type("jhon");
        $("#input[name='surname']").type("velasco");
        $("#input[name='identity']").type("98765");
        $("#input[name='document']").type("014432");
        $("#input[name='address']").type("Borbur");
        $("#input[name='telephone']").type("3154325764");

        $(".name").shouldContainText("jhon");
        $(".surname").shouldContainText("velasco");
        $(".identity").shouldContainText("98765");
        $(".document").shouldContainText("014432");
        $(".address").shouldContainText("Borbur");
        $(".telephone").shouldContainText("3154325764");
    }
    @Step("click en el botón de actualizar")
    public void clickBotonActualizar() {
        $("button[type='submit' name='actualizar']").click();
    }
    /**
     * @Author Jhon Jayder Velasco Ovalle
     * @Since 22/04/2023
     * Este método debería verificar que el usuario ha sido
     * actualizado correctamente en la aplicación.
     * Se va a revisar con el mensaje de confirmación que se muestra en la pantalla y
     * si el usuario aparece en la lista.
     * */
    @Step("Verificar actualización de usuario")
    public void verificacionUsuarioActualizado() {
        assert($(".resultado")).containsText("jhon");
        assert ($(".message")).containsText("Registro actualizado correctamente");
    }

    /**
     * @Author Carlos Yecid Hernandez Sanchez
     * @Author Jhon Jayder Velasco Ovalle
     * @Since 28/04/2023
     * Este método debería ingresar los datos de
     * busqueda en el campo correspondientes en la página.
     * */
    @Step("Digita codigo de busqueda")
    public void digitaCodigoBusqueda(){
        $("#codeWhere").type("1");
    }
    /**
     * @Author Carlos Yecid Hernandez Sanchez
     * @Author Jhon Jayder Velasco Ovalle
     * @Since 28/04/2023
     * Este método debería dar clic en el botón de buscar.
     * */
    @Step("click en boton de buscar")
    public void clicBotonBuscar(){
        $("button[type='submit' name='buscar']").click();
    }
    /**
     * @Author Carlos Yecid Hernandez Sanchez
     * @Author Jhon Jayder Velasco Ovalle
     * @Since 22/04/2023
     * Este método debería verificar que el usuario ha sido
     * creado correctamente en la aplicación.
     * Se va a revisar si el usuario aparece en la lista.
     * */
    @Step("Usuario con el codigo de busqueda es mostrado correctamente")
    public void usuarioBusquedaCorrecto(){
        assert($(".resultado")).containsText("carlos");
    }
}
