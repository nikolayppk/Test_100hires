import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageSignUp {
    private WebDriver driver;

    public PageSignUp(WebDriver driver) {
        this.driver = driver;
    }

    private By inputEmail = By.id("emailform-email");
    private By buttonNext = By.xpath("//*[@class='btn btn-primary btn-lg btn-wide']");

    public PageSignUp setEmail(String email) {
        driver.findElement(inputEmail).sendKeys(email);
        return this;
    }
    public PageRegister butoonNextClick() {
        driver.findElement(buttonNext).click();
        return new PageRegister(driver);
    }
}

