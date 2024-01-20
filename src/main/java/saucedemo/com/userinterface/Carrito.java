package saucedemo.com.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Carrito {
    public static final Target TXT_USER = Target.the("Caja de texto para escribir el usuario de la pagina")
            .located(By.xpath("//input[@id='user-name']"));
    public static final Target TXT_PASSWORD = Target.the("Caja de texto para escribir la contraseña de la pagina")
            .located(By.xpath("//input[@id='password']"));
    public static final Target BTN_ACCEPT = Target.the("Boton para validar credenciales")
            .located(By.xpath("//input[@id='login-button']"));
    public static final Target SEL_FILTER = Target.the("Selecciona el tipo de filtro para los productos")
            .located(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]"));
    public static final Target SEL_PROD1 = Target.the("Selecciona producto (Sauce Labs Fleece Jacket)")
            .located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]"));
    public static final Target BTN_ADD = Target.the("Boton para agregar el producto al carrito")
            .located(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
    public static final Target BTN_CART = Target.the("Boton para ver las compras seleccionadas en el carrito")
            .located(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
    public static final Target LBL_VALIDATION = Target.the("Label para verificar que el producto se agrego correctamente")
            .located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]"));

}
