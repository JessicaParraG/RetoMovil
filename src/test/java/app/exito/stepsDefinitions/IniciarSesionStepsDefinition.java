package app.exito.stepsDefinitions;

import app.exito.tasks.CerrarSesion;
import app.exito.tasks.IniciarSesion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static app.exito.userinterfaces.IniciarSesionUI.LBL_USUARIO;

public class IniciarSesionStepsDefinition {

    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("^ingrese las credenciales (.*) (.*)$")
    public void ingreseLasCredenciales(String correo, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.conUsuario(correo, clave));
    }

    @Y("^valida que el nombre de usuario sea visible$")
    public void validaQueElNombreDeUsuarioSeaVisible() {
        Ensure.that(LBL_USUARIO).isDisplayed();
    }

    @Entonces("^cierra sesion$")
    public void cierraSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(CerrarSesion.delUsuario());
    }
}
