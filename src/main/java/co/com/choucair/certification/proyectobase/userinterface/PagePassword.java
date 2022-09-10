package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagePassword {

    public static final Target PASSWORD = Target.the("Password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_STAYINFORMED = Target.the("Checbox Stay Informed")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_TERMS = Target.the("Checbox I have read and accept the uTest Terms of Use and the uTest Guidelines")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY = Target.the("Checbox I have read and accept the Privacy & Security Policy")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_FINISHED = Target.the("Button Final")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
