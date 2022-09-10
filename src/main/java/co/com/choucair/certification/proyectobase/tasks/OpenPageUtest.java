package co.com.choucair.certification.proyectobase.tasks;


import co.com.choucair.certification.proyectobase.userinterface.PageUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Click;


public class OpenPageUtest implements Task {

    private PageUtest pageUtest;
    public static OpenPageUtest thePage() {
        return Tasks.instrumented(OpenPageUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pageUtest),
                Click.on(PageUtest.BUTTON_JOIN));
    }
}
