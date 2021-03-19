package pa.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectJoinToday {
    public static final Target BUTTON_JT = Target.the("Select button join today")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

    public static final Target INPUT_NAME = Target.the("When do you write your name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("When do you write your lastname")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("When do you write your email")
            .located(By.id("email"));

    public static final Target SELECT_BIRTHMONTH = Target.the("When do you select your birthmonth")
            .located(By.id("birthMonth"));

    public static final Target SELECT_BIRTHDAY = Target.the("When do you select your birthday")
            .located(By.id("birthDay"));

    public static final Target SELECT_BIRTHYEAR = Target.the("When do you select your birthyear")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NL = Target.the("When click on button Next: Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));

    //SECOND STEP

    public static final Target INPUT_CITY = Target.the("When do you write your city")
            .located(By.id("city"));

    public static final Target INPUT_ZIP = Target.the("When do you write your ZIP code")
            .located(By.id("zip"));

    public static final Target SELECT_COUNTRY = Target.the("When do yuo click on your country")
            .located(By.name("countryId"));

    public static final Target FIELD_COUNTRY = Target.the("When do yuo write your country")
            .located(By.xpath("//input[@placeholder='Select a country']"));

    public static final Target BUTTON_ND = Target.the("When click on button Next: Devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    //THIRD STEP

    public static final Target BUTTON_LS = Target.the("When click on button Next: Last Step")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    //LAST STEP

    public static final Target INPUT_PASS = Target.the("When do you write your password")
            .located(By.id("password"));

    public static final Target INPUT_CONPASS = Target.the("When do you confirm your password")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_TOU = Target.the("When you marck the checkbox Terms of use")
            .located(By.id("termOfUse"));

    public static final Target CHECKBOX_PSP = Target.the("When you marck the checkbox Privacy & Security Policy")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_CS = Target.the("When click on button Complete Setup")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}

