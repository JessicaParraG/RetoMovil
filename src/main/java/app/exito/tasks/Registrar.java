package app.exito.tasks;

import app.exito.drivers.AppiumAndroidDriver;
import app.exito.utils.Datos;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static app.exito.userinterfaces.RegistrarUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Registrar implements Task {

    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_REGISTRARSE, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_REGISTRARSE),
                WaitUntil.the(TXT_NOMBRE, isPresent()).forNoMoreThan(20).seconds(),
                Enter.theValue(datos.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(datos.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(datos.getNumeroDocumento()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(LST_ANHO),
                Click.on(SLT_ANHO),
                Click.on(LST_MES),
                Click.on(SLT_MES),
                Click.on(LST_DIA),
                Click.on(SLT_DIA),
                Enter.theValue("3048795220").into(TXT_CELULAR),
                Enter.theValue(datos.getCorreo()).into(TXT_CORREO)
        );
        TouchAction check = new TouchAction(AppiumAndroidDriver.driver);

        int x = 84;
        int y = 1723;
        check.tap(PointOption.point(x, y)).perform();

        x = 90;
        y = 1849;
        check.tap(PointOption.point(x, y)).perform();

        actor.attemptsTo(
                Click.on(BTN_CONFIRMAR)
        );
    }

    public static Registrar usuario() {
        return instrumented(Registrar.class);
    }
}
