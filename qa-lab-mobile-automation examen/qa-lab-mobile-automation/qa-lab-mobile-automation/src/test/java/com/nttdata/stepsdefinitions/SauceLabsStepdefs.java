package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SauceLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class SauceLabsStepdefs {
    @Steps
    SauceLabsSteps sauceApp;

    @Given("que me encuentro en el login SauceLabs")
    public void queMeEncuentroEnElLoginSauceLabs() {
        System.out.println("Thread ini");
        try {
            Thread.sleep(12000);

        } catch (Exception e) {

        }
        System.out.println("Thread fin");
    }

    @When("ingresamos el login del usuario {string}")
    public void ingresamosElLoginDelUsuario(String usuaria) {
        System.out.println("inicioSesionConElUsuario ini");
        sauceApp.ClickLog();
        System.out.println("inicioSesionConElUsuario fin");
    }

    @And("la constraseña es {string}")
    public void laConstraseñaEs(String cont) {
        System.out.println("contraseña ini");
        sauceApp.LogContrasena(cont);
        System.out.println("contraseña fin");

    }

    @Then("le doy click a login")
    public void leDoyClickALogin() {
            sauceApp.ClickLog();
    }
}
