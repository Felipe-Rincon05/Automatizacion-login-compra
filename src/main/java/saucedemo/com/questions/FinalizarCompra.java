package saucedemo.com.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import saucedemo.com.userinterface.Carrito;

public class FinalizarCompra implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return Carrito.LBL_VALIDATION.resolveFor(actor).getText();
    }
    public static Question<String> value() {return new FinalizarCompra();}
}
