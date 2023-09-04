package app.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static app.exito.userinterfaces.IniciarSesionUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class IniciarSesion implements Task {

    String correo;
    String clave;

    public IniciarSesion(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_INGRESAR, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_INGRESAR),
                Enter.theValue(correo).into(TXT_CORREO),
                Enter.theValue(clave).into(TXT_CLAVE),
                Click.on(BTN_INGRESAR),
                Click.on(BTN_MI_CUENTA)
        );
    }

    public static IniciarSesion conUsuario(String correo, String clave) {
        return instrumented(IniciarSesion.class, correo, clave);
    }
}
