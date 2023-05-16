package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.cafam.com.co/tx/salud-citas-medicas")
public class CafamHomeLogin extends PageObject {
    public void hacerClicEnCaptcha() {
        WebElementFacade captcha = find(By.xpath("//*[contains(@class, \"recaptcha-checkbox-border\")]"));
        captcha.waitUntilVisible();
        captcha.click();
    }
     WebElementFacade captcha = find(By.xpath("//*[contains(@class, \"recaptcha-checkbox-border\")]"));
    public static final Target INPUT_CC = Target.the("caja de texto usuario").located(By.id("userPersonal"));
    public static final Target INPUT_PASS   = Target.the("caja de texto CONTRASEÑA").located(By.id(("passwordPersonal")));
    public static final Target BTN_LOGIN = Target.the("caja de texto usuario").located(By.xpath("//div[@id=\"react-tabs-1\"]//button[contains(text(), \"Ingresar\")]"));

    public static final Target PANEL_AFILIADO = Target.the("panel agendar").located(By.xpath("//input[@id=\"affiliate\"]"));
    public static final Target FORM = Target.the("formulario").located(By.cssSelector("div.form-fields"));
    public static final Target TURISMO = Target.the("formulario").located(By.xpath("//span[contains(text(), \"Turismo\")]"));
    //span[contains(text(), "Turismo")]
    public static final Target ESPECIALIDAD = Target.the("especialidad").located(By.xpath("//div[@class=\"form-field   \"][1]//div[@class=\"select-form__selected-text  \"][1]"));
    public static final Target MEDICINA_GENERAL = Target.the("Medicina General").located(By.xpath("//li[contains(text(),\"Medicina General\")]"));

    public static final Target PRESENCIAL_ = Target.the("Modalidad presencial").located(By.xpath("//div[@class=\"form-field   \"]//div[@class=\"select-form__selected-text  \"][1]"));

    public static final Target PRESENCIAL = Target.the("Modalidad presencial").located(By.xpath("//li[contains(text(),\"Presencial Centro Medico\")]"));
    public static final Target BTN_CONTINUAR = Target.the("Boton continuar").located(By.xpath("//button[contains(text(), \"Continuar\")]"));
    public static final Target BTN_CITAS = Target.the("Citas disponibles").located(By.xpath("//button[contains(text(), \"Consultar citas disponibles\")]"));
    public static final Target DISPONIBLES = Target.the("Opciones").located(By.xpath("//div[@id=\"panel-appointments\"]"));
    public static final Target TEXTO_SOLICITAR = Target.the("Pimera opcion").located(By.xpath("//h3[contains(text(), \"Selecciona la Cita\")]"));
    public static final Target SOLCITAR = Target.the("Pimera opcion").located(By.xpath("//div[@id=\"panel-appointments\"]/div[1]//button"));
    public static final Target ASIGNAR_CITA = Target.the("Pimera opcion").located(By.xpath("//button[contains(text(), \"Asignar Cita\")]"));







}
