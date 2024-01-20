package saucedemo.com.enums;

public enum Validacion {
    LBL_TEXT("Sauce Labs Fleece Jacket");
    private final String mensaje;
    Validacion(String mensaje){
        this.mensaje = mensaje;
    }
    public String getMesaje (){return mensaje;}
}
