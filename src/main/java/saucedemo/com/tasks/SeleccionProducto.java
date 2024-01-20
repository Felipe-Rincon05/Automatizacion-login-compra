package saucedemo.com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import saucedemo.com.models.DatosSauce;
import saucedemo.com.userinterface.Carrito;

public class SeleccionProducto implements Task {
    private DatosSauce datos;

    public SeleccionProducto(DatosSauce datos) {
        this.datos = datos;
    }
    public static SeleccionProducto selProducto(DatosSauce datos) {
        return Tasks.instrumented(SeleccionProducto.class, datos);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.getStrUser()).into(Carrito.TXT_USER),
                Enter.theValue(datos.getStrPassword()).into(Carrito.TXT_PASSWORD),
                Click.on(Carrito.BTN_ACCEPT),
                Click.on(Carrito.SEL_FILTER),
                Hit.the(Keys.ARROW_DOWN).into(Carrito.SEL_FILTER),
                Hit.the(Keys.ARROW_DOWN).into(Carrito.SEL_FILTER),
                Hit.the(Keys.ARROW_DOWN).into(Carrito.SEL_FILTER),
                Hit.the(Keys.ENTER).into(Carrito.SEL_FILTER),
                Click.on(Carrito.SEL_PROD1),
                Click.on(Carrito.BTN_ADD),
                Click.on(Carrito.BTN_CART)
        );
    }
}
