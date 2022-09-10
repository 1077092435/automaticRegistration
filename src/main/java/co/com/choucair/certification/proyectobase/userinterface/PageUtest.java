package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")

public class PageUtest extends PageObject {

    public static final Target BUTTON_JOIN = Target.the("Button to start user registration")
        .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
