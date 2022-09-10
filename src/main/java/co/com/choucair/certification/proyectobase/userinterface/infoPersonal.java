package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class infoPersonal {

    public static final Target FIRSTNAME = Target.the("Firstname")
            .located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("Lastname")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email")
            .located(By.id("email"));
    public static final Target MONTHBIRTH = Target.the("Month Birth")
            .located(By.id("birthMonth"));
    public static final Target DAYBIRTH = Target.the("Day Birth")
            .located(By.id("birthDay"));
    public static final Target YEARBIRTH = Target.the("Year Birth")
            .located(By.id("birthYear"));
    public static final Target BUTTON_DIRECTION = Target.the("Button addressing")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
