import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageSignUp {
    private WebDriver driver;

    public PageSignUp(WebDriver driver) {
        this.driver = driver;
    }

    By inputEmail = By.id("emailform-email");

    By buttonNext = By.xpath("//*[@class='btn btn-primary btn-lg btn-wide']");

}

