package app.exito.stepsDefinitions;

import app.exito.tasks.AgregarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import static app.exito.tasks.AgregarProducto.producto;
import static app.exito.userinterfaces.AgregarProductoUI.LBL_PRODUCTO;

public class AgregarProductoStepsDefinition {

    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Y("^busque un producto y lo agregue al carrito$")
    public void busqueUnProductoYLoAgregueAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProducto.alCarrito());
    }

    @Entonces("^valida que el producto se haya agregado correctamente$")
    public void validaQueElProductoSeHayaAgregadoCorrectamente() {
        Ensure.that(Text.of(LBL_PRODUCTO).equals(producto));
    }
}
