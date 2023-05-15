package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeysIntoBy;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.remote.server.handler.SendKeys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HacerClicEnCaptcha implements Task {

    private final Target captcha = Target.the("captcha").locatedBy("//label[contains(text(), \"No soy un robot\")]");

    @Override
    @Step("{0} hace clic en el captcha")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(captcha, isVisible()),
                Click.on(captcha)
        );
    }

    public static HacerClicEnCaptcha enElCaptcha() {
        return new HacerClicEnCaptcha();
    }
}
