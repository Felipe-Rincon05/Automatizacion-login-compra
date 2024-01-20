package saucedemo.com.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import saucedemo.com.enums.Validacion;
import saucedemo.com.models.DatosSauce;
import saucedemo.com.questions.FinalizarCompra;
import saucedemo.com.tasks.SeleccionProducto;

import java.util.Map;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepDefinitionSauce {
    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
        theActorCalled("Felipe Rincon");
    }
    @Given("El usuario ingresa a la pagina Swag Labs")
    public void elUsuarioIngresaALaPaginaSwagLabs() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }
    @When("Selecciona el producto")
    public void seleccionaElProducto(DatosSauce datos) {
        theActorInTheSpotlight().attemptsTo(SeleccionProducto.selProducto(datos));
    }
    @Then("Se realiza la question de validacion")
    public void seRealizaLaQuestionDeValidacion() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(FinalizarCompra.value(), equalTo(Validacion.LBL_TEXT.getMesaje()))
        );
    }
    @DataTableType
    public DatosSauce datosSauce(@Transpose Map<String, String> entry){
        return new DatosSauce(
                entry.get("strUser"),
                entry.get("strPassword")
        );
    }
}
