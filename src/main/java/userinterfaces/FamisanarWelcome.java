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
    public static final Target INFO_CLIENTE = Target.the("Informacion cliente").locatedBy(("//label[contains(text(), \"51666074\")]"));
    public static final Target ESPECIALIDAD = Target.the("seleccion de especialidad").located(By.id("//*[@id=\"asignarCitaForm:especialidad\"]"));

    public static final Target FECHA = Target.the("seleccion de fecha").located(By.id("//*[@id=\"asignarCitaForm:consultaPor\"]"));
    public static final Target CONSULTAR = Target.the("boton consultar").located(By.id("//*[@id=\"asignarCitaForm:cmdAceptar\"]"));


}
