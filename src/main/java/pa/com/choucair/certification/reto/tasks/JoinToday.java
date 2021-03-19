package pa.com.choucair.certification.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import pa.com.choucair.certification.reto.userinterface.SelectJoinToday;

import java.util.Random;


public class JoinToday implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strCity;
    private String strZip;
    private String strCountry;
    private String strPassword;

    public JoinToday(String strName, String strLastName, String strEmail, String strCity, String strZip, String strCountry, String strPassword) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
        this.strPassword = strPassword;
    }

    public static JoinToday OnthePage(String strName, String strLastName, String strEmail, String strCity, String strZip, String strCountry, String strPassword) {
        return Tasks.instrumented(JoinToday.class,strName,strLastName,strEmail,strCity,strZip, strCountry, strPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SelectJoinToday.BUTTON_JT),
                Enter.theValue(strName).into(SelectJoinToday.INPUT_NAME),
                Enter.theValue(strLastName).into(SelectJoinToday.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(SelectJoinToday.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("February").from(SelectJoinToday.SELECT_BIRTHMONTH),
                SelectFromOptions.byVisibleText("8").from(SelectJoinToday.SELECT_BIRTHDAY),
                SelectFromOptions.byVisibleText("1991").from(SelectJoinToday.SELECT_BIRTHYEAR),
                Click.on(SelectJoinToday.BUTTON_NL),
                //SECOND STEP
                Enter.theValue(strCity).into(SelectJoinToday.INPUT_CITY),
                Enter.theValue(strZip).into(SelectJoinToday.INPUT_ZIP),
                Click.on(SelectJoinToday.SELECT_COUNTRY),
                Enter.theValue(strCountry).into(SelectJoinToday.FIELD_COUNTRY),
                Click.on(SelectJoinToday.BUTTON_ND),
                //THIRD STEP
                Click.on(SelectJoinToday.BUTTON_LS),
                //LAST STEP
                Enter.theValue(strPassword).into(SelectJoinToday.INPUT_PASS),
                Enter.theValue(strPassword).into(SelectJoinToday.INPUT_CONPASS),
                Click.on(SelectJoinToday.CHECKBOX_TOU),
                Click.on(SelectJoinToday.CHECKBOX_PSP),
                Click.on(SelectJoinToday.BUTTON_CS)
        );
    }
}
