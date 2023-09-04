package app.exito.tasks;

import app.exito.utils.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static app.exito.userinterfaces.AgregarProductoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AgregarProducto implements Task {

    public static String producto;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_CATEGORIAS, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_CATEGORIAS),
                WaitUntil.the(BTN_RECOGE, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_RECOGE),
                Click.on(LST_CIUDAD),
                Click.on(SLT_CIUDAD),
                Click.on(LST_NOMBRE_ALMACEN),
                Click.on(SLT_NOMBRE_ALMACEN),
                Click.on(BTN_CONTINUAR)
        );

        try {
            Esperar.por(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                WaitUntil.the(BTN_CONTINUAR, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_CONTINUAR),
                WaitUntil.the(BTN_TECNOLOGIA, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_TECNOLOGIA),
                Click.on(BTN_CELULARES),
                Click.on(BTN_AGREGAR)
        );

        producto = LBL_PRODUCTO.resolveFor(actor).getText();

        actor.attemptsTo(
                WaitUntil.the(BTN_CARRITO, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_CARRITO),
                WaitUntil.the(LBL_COMPRA_RECOGE, isPresent()).forNoMoreThan(20).seconds()
        );
    }

    public static AgregarProducto alCarrito(){
        return instrumented(AgregarProducto.class);
    }
}
