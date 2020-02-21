import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageApplicantForm {
    private WebDriver driver;

    public PageApplicantForm(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@class='btn btn-default btn-lg btn-wide applicant-form__btn_details']")
    private WebElement buttonBack;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-lg btn-wide']")
    private WebElement buttonNext;



}
