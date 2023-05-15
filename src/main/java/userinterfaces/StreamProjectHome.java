package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.epssanitas.com/usuarios/web/nuevo-portal-eps#gsc.tab=0")
public class StreamProjectHome extends PageObject {
    public static final Target LOGINBUTTON = Target.the("Login butom").located(By.className("Login__twitch"));
    public static final Target IMAGE_AVATAR = Target.the("avatar image").located(By.className("Member__avatar"));
    public static final Target NUMBER_OF_STREAMERS = Target.the("number of streaners").located(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a"));

    public static Target returnCurrentStream(int index) {
        Target currentTarget = Target.the("current button of chat for user ").located(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a"+"["+index+"]"));
        return currentTarget;
    }
}
