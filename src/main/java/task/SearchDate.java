package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.FamisanarHomeLogin;
import userinterfaces.FamisanarWelcome;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchDate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                 WaitUntil.the(FamisanarWelcome.DATOS, isVisible()).forNoMoreThan(180).seconds(),
                 Click.on(FamisanarWelcome.DATOS),
                 WaitUntil.the(FamisanarWelcome.SOLICITAR, isClickable()).forNoMoreThan(180).seconds(),
                 Click.on(FamisanarWelcome.SOLICITAR),
                 WaitUntil.the(FamisanarWelcome.INFO_CLIENTE, isVisible()).forNoMoreThan(240).seconds(),
                 SelectFromOptions.byVisibleText("Medicina General").from(FamisanarWelcome.ESPECIALIDAD),
                 SelectFromOptions.byVisibleText("Cita mas Cercana").from(FamisanarWelcome.FECHA),
                 Click.on(FamisanarWelcome.CONSULTAR)

         );


    }
    public static SearchDate theApp(){
        return instrumented(SearchDate.class);
    }
}
