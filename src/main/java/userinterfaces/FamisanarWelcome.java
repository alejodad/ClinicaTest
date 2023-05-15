package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://enlinea.famisanar.com.co/Portal/pages/menu/welcome.jspx")
public class FamisanarWelcome extends PageObject {
    public static final Target AFILIADO = Target.the("banner afiliado").located(By.xpath("//*[contains(@class, \"itemMenu\")]/a"));
    public static final Target CITAS_POS = Target.the("opcion cita pos").located(By.xpath("//div[contains(text(), \"Citas\")]"));
    public static final Target CAFAM = Target.the("CAFAM").located(By.xpath("//a[contains(text(), \"CAFAM\")]"));
    public static final Target DATOS = Target.the("Datos Persona").locatedBy(("//td/span[contains(text(), \"51666074\")]"));

    public static final Target SOLICITAR = Target.the("input SOLICITAR CITA").locatedBy(("//*[@id=\"generarReporteAutorizacionesXAfiliadoForm:cmdsolicitar\"]"));

}
