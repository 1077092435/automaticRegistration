package co.com.choucair.certification.proyectobase.tasks;


import co.com.choucair.certification.proyectobase.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.proyectobase.userinterface.PageDevices.*;
import static org.openqa.selenium.Keys.*;

public class FillPageDevices implements Task {

    private List<Data> data;

    public FillPageDevices(List<Data> data) {
        this.data = data;
    }

    public static FillPageDevices thePage(List<Data> data) {
        return Tasks.instrumented(FillPageDevices.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTAINERCOMPUTER),
                Enter.theValue(data.get(0).getStrComputer()).into(COMPUTER).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTAINERVERSION),
                Enter.theValue(data.get(0).getStrVersionComputer()).into(VERSION).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTAINERLANGUAGE),
                Enter.theValue(data.get(0).getStrLanguageComputer()).into(LANGUAGE).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTAINERMOBILE),
                Enter.theValue(data.get(0).getStrMobile()).into(MOBILE).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTAINERMODELMOBILE),
                Enter.theValue(data.get(0).getStrModelMobile()).into(MODELMOBILE).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTAINEROPSYSTEM),
                Enter.theValue(data.get(0).getStrOperatingSystemMobile()).into(OPSYSTEM).thenHit(ARROW_DOWN, ENTER),
                Click.on(BUTTON_LASTSTEP)
        );
    }
}
