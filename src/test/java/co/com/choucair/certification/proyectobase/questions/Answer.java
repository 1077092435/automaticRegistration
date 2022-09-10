package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.model.Data;
import co.com.choucair.certification.proyectobase.userinterface.PagePassword;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {

    private List<Data> data;

    public Answer(List<Data> data) {
        this.data = data;
    }

    public static Answer to(List<Data> data) {
        return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String textEndButton = Text.of(PagePassword.BUTTON_FINISHED).viewedBy(actor).asString();
        return data.get(0).getStrTextEnd().equals(textEndButton);
    }


}
