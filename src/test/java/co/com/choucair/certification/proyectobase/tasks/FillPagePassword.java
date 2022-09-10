package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.proyectobase.userinterface.PagePassword.*;

public class FillPagePassword implements Task {

    private List<Data> data;

    public FillPagePassword(List<Data> data) {
        this.data = data;
    }

    public static FillPagePassword thePage(List<Data> data) {
        return Tasks.instrumented(FillPagePassword.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(CONFIRM_PASSWORD),
                Click.on(CHECK_STAYINFORMED),
                Click.on(CHECK_TERMS),
                Click.on(CHECK_PRIVACY),
                Click.on(BUTTON_FINISHED)
        );
    }
}
