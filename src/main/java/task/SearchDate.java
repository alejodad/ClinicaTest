package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.Select;
import userinterfaces.CafamHomeLogin;
import userinterfaces.FamisanarHomeLogin;
import userinterfaces.FamisanarWelcome;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SearchDate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(

                 WaitUntil.the(CafamHomeLogin.BTN_LOGIN, isClickable()).forNoMoreThan(10).seconds(),
                 Click.on(CafamHomeLogin.BTN_LOGIN),
              WaitUntil.the(CafamHomeLogin.TURISMO, isVisible()).forNoMoreThan(30).seconds(),
              WaitUntil.the(CafamHomeLogin.PANEL_AFILIADO, isClickable()),
              Click.on(CafamHomeLogin.PANEL_AFILIADO),
                 Scroll.to(CafamHomeLogin.PANEL_AFILIADO),
                 WaitUntil.the(CafamHomeLogin.FORM, isVisible()).forNoMoreThan(30).seconds(),
              Click.on(CafamHomeLogin.FORM)

         );

         if(!CafamHomeLogin.MEDICINA_GENERAL.resolveFor(actor).isVisible()){
             actor.attemptsTo(Click.on(CafamHomeLogin.ESPECIALIDAD));
         }

        actor.attemptsTo(
                 Click.on(CafamHomeLogin.MEDICINA_GENERAL),
                 WaitUntil.the(CafamHomeLogin.MEDICINA_GENERAL, isNotVisible()),
                 WaitUntil.the(CafamHomeLogin.PRESENCIAL_, isClickable()).forNoMoreThan(30).seconds(),
                 Click.on(CafamHomeLogin.PRESENCIAL_),
                 Click.on(CafamHomeLogin.PRESENCIAL),
              WaitUntil.the(CafamHomeLogin.BTN_CONTINUAR, isClickable()).forNoMoreThan(30).seconds().then(Click.on(CafamHomeLogin.BTN_CONTINUAR)),
              WaitUntil.the(CafamHomeLogin.TEXTO_SOLICITAR, isVisible()).forNoMoreThan(30).seconds().then(Scroll.to(CafamHomeLogin.TEXTO_SOLICITAR)).then(Click.on(CafamHomeLogin.BTN_CITAS)),
              WaitUntil.the(CafamHomeLogin.DISPONIBLES, isVisible()).forNoMoreThan(30).seconds().then(Scroll.to(CafamHomeLogin.DISPONIBLES)),
              Click.on(CafamHomeLogin.SOLCITAR),
              WaitUntil.the(CafamHomeLogin.ASIGNAR_CITA, isVisible())
              //,Click.on(CafamHomeLogin.ASIGNAR_CITA)


              /*   WaitUntil.the(FamisanarWelcome.DATOS, isVisible()).forNoMoreThan(180).seconds(),
                 Click.on(FamisanarWelcome.DATOS),
                 WaitUntil.the(FamisanarWelcome.SOLICITAR, isClickable()).forNoMoreThan(180).seconds(),
                 Click.on(FamisanarWelcome.SOLICITAR),
                 WaitUntil.the(FamisanarWelcome.INFO_CLIENTE, isVisible()).forNoMoreThan(240).seconds(),
                 SelectFromOptions.byVisibleText("Medicina General").from(FamisanarWelcome.ESPECIALIDAD),
                 SelectFromOptions.byVisibleText("Cita mas Cercana").from(FamisanarWelcome.FECHA),
                 Click.on(FamisanarWelcome.CONSULTAR)*/


         );


    }
    public static SearchDate theApp(){
        return instrumented(SearchDate.class);
    }
}
