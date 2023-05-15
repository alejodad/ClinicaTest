package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.cafam.com.co/tx/salud")
public class CafamHomeLogin extends PageObject {
    public void hacerClicEnCaptcha() {
        WebElementFacade captcha = find(By.xpath("//*[contains(@class, \"recaptcha-checkbox-border\")]"));
        captcha.waitUntilVisible();
        captcha.click();
    }
     WebElementFacade captcha = find(By.xpath("//*[contains(@class, \"recaptcha-checkbox-border\")]"));
    public static final Target INPUT_CC = Target.the("caja de texto usuario").located(By.id("userPersonal"));
    public static final Target INPUT_PASS   = Target.the("caja de texto CONTRASEÑA").located(By.id(("passwordPersonal")));
    public static final Target CAPCHTA = Target.the("caja de texto usuario").located(By.xpath(("//*[contains(@class, \"recaptcha-checkbox-border\")][1]")));
    public static final Target BTN_LOGIN = Target.the("caja de texto usuario").located(By.xpath("//button[contains(text(), \"Ingresar\")]"));

}
