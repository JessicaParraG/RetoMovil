package app.exito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IniciarSesionUI {

    public static final Target BTN_INGRESAR = Target.the("Boton ingresar").located(By.xpath("//*[@id='AppCompatButton_ingresar']"));
    public static final Target TXT_CORREO = Target.the("Correo").located(By.xpath("//*[@id='TextInputEditText_email']"));
    public static final Target TXT_CLAVE = Target.the("Clave").located(By.xpath("(//*[@class='android.widget.EditText'])[2]"));
    public static final Target BTN_MI_CUENTA = Target.the("MI CUENTA").located(By.xpath("//*[@text='Mi cuenta']"));
    public static final Target LBL_USUARIO = Target.the("Mensaje bienvenida").located(By.xpath("//*[text()='Hola, Jessica']"));
}
