package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://enlinea.famisanar.com.co/Portal/home.jspx")
public class FamisanarHomeLogin extends PageObject {
    public static final Target INPUT_CC = Target.the("input cedula").located(By.id("loginForm:id"));
    public static final Target INPUT_PASS =Target.the("input cedula").located(By.id("loginForm:clave"));
    public static final Target INPUT_SE3LECT_TIPO_ID =Target.the("input cedula").located(By.id("loginForm:tipoId"));
    public static final Target BTN_LOGIN =Target.the("input cedula").located(By.id("loginForm:loginButton"));
    public static final Target SERVICIOS = Target.the("banner de servicios ").located(By.id("tabServicios"));

}
