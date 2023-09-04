package app.exito.stepsDefinitions;

import app.exito.drivers.AppiumAndroidDriver;
import app.exito.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.io.IOException;

import static app.exito.userinterfaces.RegistrarUI.LBL_CODIGO;

public class RegistrarStepsDefinition {

    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario abra la aplicacion del exito$")
    public void queElUsuarioAbraLaAplicacionDelExito() throws IOException {
        OnStage.theActorCalled("actor").can(BrowseTheWeb.with(AppiumAndroidDriver.appium().abrir()));
    }

    @Cuando("^el usuario se realice el registro$")
    public void elUsuarioSeRealiceElRegistro() {
        OnStage.theActorInTheSpotlight().attemptsTo(Registrar.usuario());
    }

    @Entonces("^se valida que el registro sea exitoso$")
    public void seValidaQueElRegistroSeaExitoso() {
        Ensure.that(LBL_CODIGO).isDisplayed();
    }
}
