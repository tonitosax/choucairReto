package pa.com.choucair.certification.reto.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.choucair.certification.reto.model.UTestData;
import pa.com.choucair.certification.reto.questions.Answer;
import pa.com.choucair.certification.reto.tasks.JoinToday;
import pa.com.choucair.certification.reto.tasks.OpenUp;

import java.util.List;

public class UTestStepDefinition {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to open a page UTest$")
    public void thanBrandonWantsToOpenAPageUTest() throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
    }

    @When("^he search for the join button and fill the form to register$")
    public void heSearchForTheJoinButtonAndFillTheFormToRegister(List<UTestData> UTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(JoinToday.OnthePage(UTestData.get(0).getStrName(),UTestData.get(0).getStrLastName(), UTestData.get(0).getStrEmail(),
                UTestData.get(0).getStrCity(), UTestData.get(0).getStrZip(), UTestData.get(0).getStrCountry(), UTestData.get(0).getStrPassword()));
    }

    @Then("^he complete the register in page UTest$")
    public void heCompleteTheRegisterInPageUTest(List<UTestData> UTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(UTestData.get(0).getStrWelcome())));
    }

}
