package saucedemo.com.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/saucedemo.com.feature",
        tags = "@Filtrar",
        glue = "saucedemo.com.stepdefinitions",
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class Runner {
}
