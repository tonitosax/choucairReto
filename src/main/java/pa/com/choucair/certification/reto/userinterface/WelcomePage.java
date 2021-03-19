package pa.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomePage {
    public static final Target WELCOME_TEXT = Target.the("Verificar mensaje de Bienvenida")
            .located(By.xpath("//h1[contains(text(), 'Welcome to the world's largest community of freelance software testers!')]"));
}
