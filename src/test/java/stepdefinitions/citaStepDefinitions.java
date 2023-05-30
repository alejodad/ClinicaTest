package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.Login;
import task.OpenTheBrowser;
import task.SearchDate;
import userinterfaces.CafamHomeLogin;
import userinterfaces.FamisanarHomeLogin;
import userinterfaces.StreamProjectHome;

import java.util.ArrayList;

public class citaStepDefinitions {
    private FamisanarHomeLogin streamProjectHome;
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private util.Login login= new util.Login();
    ArrayList al = new ArrayList();
    public Actor alejo = Actor.named("Alejandro");
    @Before
    public void setUp() {
        alejo.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
        login.showLoginDialog();

        String username = login.getUsername();
        String password = login.getPassword();
        alejo.remember("user",username);
        alejo.remember("pwd",password);
    }

    @Given("Usuario esta en pagina principal")
    public void usuario_esta_en_pagina_principal() {

        streamProjectHome.open();
        alejo.wasAbleTo(
                Login.theApp(alejo.recall("user"),alejo.recall("pwd"))
        );
        //alejo.can(BrowseTheWeb.with(hisBrowser));
        //alejo.wasAbleTo(
          //      OpenTheBrowser.on(streamProjectHome));

    }

    @When("Busca cita mas cercana")
    public void busca_cita_mas_cercana() {
        // Write code here that turns the phrase above into concrete actions
        hisBrowser.switchTo().frame("ifAuto");
        alejo.attemptsTo(
                SearchDate.theApp()
        );

    }

    @Then("Agenda cita mas cerca")
    public void agenda_cita_mas_cerca() {
        // Write code here that turns the phrase above into concrete actions

    }
}
