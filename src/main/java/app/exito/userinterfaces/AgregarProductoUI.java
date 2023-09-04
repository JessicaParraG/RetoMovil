package app.exito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AgregarProductoUI {

    public static final Target BTN_CATEGORIAS = Target.the("Categorias").located(By.xpath("//*[@text='Categorías']"));
    public static final Target BTN_RECOGE = Target.the("Compra y recoge").located(By.xpath("//*[@id='constraitLayout_buy_and_collect']"));
    public static final Target LST_CIUDAD = Target.the("Ciudad").located(By.xpath("//*[@text='Seleccione ciudad']"));
    public static final Target SLT_CIUDAD = Target.the("Ciudad").located(By.xpath("//*[@text='Medellín']"));
    public static final Target LST_NOMBRE_ALMACEN = Target.the("Nombre almacen").located(By.xpath("//*[@text='Seleccione almacén']"));
    public static final Target SLT_NOMBRE_ALMACEN = Target.the("Almacen").located(By.xpath("//*[@text='Exito Envigado']"));
    public static final Target BTN_CONTINUAR = Target.the("Continuar").located(By.xpath("//*[@id='appCompatButton_continue']"));
    public static final Target BTN_TECNOLOGIA = Target.the("Tecnologia").located(By.xpath("//*[@text='Tecnología']"));
    public static final Target BTN_CELULARES = Target.the("Celulares").located(By.xpath("//*[@text='Celulares']"));
    public static final Target BTN_AGREGAR = Target.the("Agregar producto").located(By.xpath("(//*[@id='appCompatTextView_add_item'])[1]"));
    public static final Target LBL_PRODUCTO = Target.the("Producto").located(By.xpath("(//*[@id='appCompatTextView_product_title'])[1]"));
    public static final Target BTN_CARRITO = Target.the("Carrito").located(By.xpath("//*[@id='appCompatImageView_shopping_cart']"));
    public static final Target LBL_COMPRA_RECOGE = Target.the("").located(By.xpath("//*[@text='Compra y Recoge']"));
}
