import org.openqa.selenium.By;
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

    private By headerName = By.xpath("//h1[@class = 'job-header-name']");

    //Возвращаем текст Job
    public String getHeaderName(){
        String headername = driver.findElement(headerName).getText();
        return headername;
    }

}
