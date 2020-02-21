import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagePasswordReset {
    private WebDriver driver;

    public PagePasswordReset(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(id = "passwordresetrequestform-email")
    private WebElement inputEmail;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement buttonSend;

}

