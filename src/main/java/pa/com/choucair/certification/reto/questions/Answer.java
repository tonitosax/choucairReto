package pa.com.choucair.certification.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.choucair.certification.reto.userinterface.WelcomePage;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {this.question = question;}

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String Welcome = Text.of(WelcomePage.WELCOME_TEXT).viewedBy(actor).asString();

        if (question.equals(Welcome)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
