package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageDirection {


    public static final Target CITY = Target.the("City")
            .located(By.id("city"));
    public static final Target POSTALCODE = Target.the("Postal Code")
            .located(By.id("zip"));
    public static final Target CONTAINERCOUNTRY = Target.the("Container Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target COUNTRY = Target.the("Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_DEVICES = Target.the("Button Devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
