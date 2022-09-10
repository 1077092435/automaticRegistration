package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.proyectobase.userinterface.infoPersonal.*;

public class FillInfoPersonal implements Task {

    private List<Data> data;

    public FillInfoPersonal(List<Data> data) {
        this.data = data;
    }

    public static FillInfoPersonal thePage(List<Data> data) {
        return Tasks.instrumented(FillInfoPersonal.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrName()).into(FIRSTNAME),
                Enter.theValue(data.get(0).getStrLastName()).into(LASTNAME),
                Enter.theValue(data.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonthBirth()).from(MONTHBIRTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDayBirth()).from(DAYBIRTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrYearBirth()).from(YEARBIRTH),
                Click.on(BUTTON_DIRECTION)


        );
    }
}
