package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.FamisanarHomeLogin;
import userinterfaces.FamisanarWelcome;

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
                 Click.on(FamisanarWelcome.SOLICITAR)

         );


    }
    public static SearchDate theApp(){
        return instrumented(SearchDate.class);
    }
}
