package task;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.HoverOverBy;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterfaces.CafamHomeLogin;
import userinterfaces.FamisanarHomeLogin;
import userinterfaces.FamisanarWelcome;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                 Enter.theValue("51666074").into(CafamHomeLogin.INPUT_CC),
                 Enter.theValue("Alejandra.123").into(CafamHomeLogin.INPUT_PASS).thenHit(Keys.TAB)

                 /*WaitUntil.the(FamisanarHomeLogin.SERVICIOS, isVisible()),
                 Click.on(FamisanarHomeLogin.SERVICIOS),
                 WaitUntil.angularRequestsHaveFinished(),
                 WaitUntil.the(FamisanarWelcome.AFILIADO, isVisible()).forNoMoreThan(180).seconds(),
                 Click.on(FamisanarWelcome.AFILIADO),
                 WaitUntil.the(FamisanarWelcome.CITAS_POS, isClickable()),
                 Click.on(FamisanarWelcome.CITAS_POS),
                 Click.on(FamisanarWelcome.CAFAM) */

         );


    }
    public static Login theApp(){
        return instrumented(Login.class);
    }
}
