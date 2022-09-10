package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.Data;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinitions {

    @Before

    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Duvan user registration on utest page$")
    public void duvanUserRegistrationOnUtestPage() throws Exception{
        theActorCalled("Duvan").wasAbleTo(OpenPageUtest.thePage());
    }


    @When("^enter all the requested information$")
    public void enterAllTheRequestedInformation(List<Data> data) throws Exception {
        theActorInTheSpotlight().attemptsTo(FillInfoPersonal.thePage(data), FillPageAddress.thePage(data), FillPageDevices.thePage(data),
                FillPagePassword.thePage(data)
                );
    }

    @Then("^complete$")
    public void complete(List<Data> data) throws Exception{
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.to(data)));
    }

}
