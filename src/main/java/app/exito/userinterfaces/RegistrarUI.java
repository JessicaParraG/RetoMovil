package app.exito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistrarUI {

    public static final Target BTN_REGISTRARSE = Target.the("Boton registrarse").located(By.xpath("//*[@id='AppCompatButton_registrarse']"));
    public static final Target TXT_NOMBRE = Target.the("Nombres").locatedBy("(//*[@class='android.widget.EditText'])[1]");
    public static final Target TXT_APELLIDO = Target.the("Apellidos").locatedBy("(//*[@class='android.widget.EditText'])[2]");
    public static final Target TXT_NUMERO_DOCUMENTO = Target.the("Numero de documento").locatedBy("(//*[@class='android.widget.EditText'])[3]");
    public static final Target LST_ANHO = Target.the("Lista año").located(By.xpath("(//*[@id='text_input_end_icon'])[2]"));
    public static final Target SLT_ANHO = Target.the("Año").locatedBy("//*[@text='1998']");
    public static final Target LST_MES = Target.the("Lista mes").located(By.xpath("(//*[@id='text_input_end_icon'])[3]"));
    public static final Target SLT_MES = Target.the("Mes").locatedBy("//*[@text='06']");
    public static final Target LST_DIA = Target.the("Lista dia").located(By.xpath("(//*[@id='text_input_end_icon'])[4]"));
    public static final Target SLT_DIA = Target.the("Dia").locatedBy("//*[@text='01']");
    public static final Target TXT_CELULAR = Target.the("Celular").located(By.xpath("//*[@id='TextInputEditText_tel']"));
    public static final Target TXT_CORREO = Target.the("Correo").locatedBy("(//*[@class='android.widget.EditText'])[5]");
    public static final Target CHK_TERMINOS = Target.the("Terminos y condiciones").located(By.xpath("//*[@id='AppCompatTextView_terminos_y_condiciones']"));
    public static final Target BTN_CONFIRMAR = Target.the("Boton confirmar").located(By.xpath("//*[@id='AppCompatButton_registrar']"));
    public static final Target LBL_CODIGO = Target.the("Codigo de confirmacion").located(By.xpath("//*[@id='AppCompatTextView_bienvenido']"));
}
