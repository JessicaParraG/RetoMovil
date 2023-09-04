package app.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static app.exito.userinterfaces.CerrarSesionUI.BTN_ACEPTAR;
import static app.exito.userinterfaces.CerrarSesionUI.BTN_CERRAR_SESION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CerrarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CERRAR_SESION, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_CERRAR_SESION),
                Click.on(BTN_ACEPTAR)
        );
    }

    public static CerrarSesion delUsuario(){
        return instrumented(CerrarSesion.class);
    }
}
