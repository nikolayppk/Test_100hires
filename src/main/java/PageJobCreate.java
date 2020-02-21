import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageJobCreate {
    private WebDriver driver;

    public PageJobCreate(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "job-title")
    private WebElement inputJobTitle;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-lg btn-wide submit-form']")
    private WebElement buttonNext;

    /////////////////////////     Методы     ///////////////////////

    public PageJobCreate setJobTitle(String jobTitle) {
        inputJobTitle.sendKeys(jobTitle);
        return this;
    }
    public PageApplicantForm clickButtonNext() {
        buttonNext.click();
        return new PageApplicantForm(driver);
    }

}
