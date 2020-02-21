import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageSignUp {
    private WebDriver driver;

    public PageSignUp(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(id = "emailform-email")
    public WebElement inputEmail;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-lg btn-wide']")
    public WebElement buttonNext;

}

