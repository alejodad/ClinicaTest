package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import task.Login;
import task.OpenTheBrowser;
import task.SearchDate;
import userinterfaces.CafamHomeLogin;
import userinterfaces.FamisanarHomeLogin;
import userinterfaces.StreamProjectHome;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class citaStepDefinitions {
    private CafamHomeLogin streamProjectHome;
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    ArrayList al = new ArrayList();
    public Actor alejo = Actor.named("Alejandro");
    @Before
    public void setUp() {
        alejo.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
        hisBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Given("Usuario esta en pagina principal")
    public void usuario_esta_en_pagina_principal() {
        streamProjectHome.open();
        alejo.wasAbleTo(
                Login.theApp()
        );
        new WebDriverWait(hisBrowser, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        new WebDriverWait(hisBrowser, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.rc-anchor-center-container"))).click();
        hisBrowser.switchTo().defaultContent();

    }

    @When("Busca cita mas cercana")
    public void busca_cita_mas_cercana() {
        // Write code here that turns the phrase above into concrete actions
        //hisBrowser.switchTo().frame("ifAuto");
        alejo.attemptsTo(
                SearchDate.theApp()
        );

    }

    @Then("Agenda cita mas cerca")
    public void agenda_cita_mas_cerca() {
        // Write code here that turns the phrase above into concrete actions

    }
}
