import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageJobCreate {
    private WebDriver driver;

    public PageJobCreate(WebDriver driver) {
        this.driver = driver;
    }

    private By inputJobTitle = By.id( "job-title");
    private By buttonNext = By.xpath("//*[@class='btn btn-primary btn-lg btn-wide submit-form']");
    private By headLine = By.xpath( " //div [@class = 'content' ]//h1['New job']");


    /////////////////////////     Методы     ///////////////////////

    public PageJobCreate setJobTitle(String jobTitle) {
        driver.findElement(inputJobTitle).sendKeys(jobTitle);
        return this;
    }
    public PageApplicantForm clickButtonNext() {
        driver.findElement(buttonNext).click();
        return new PageApplicantForm(driver);
    }
    //Возвращаем текст заголовка
    public String getHeadline(){
        String headline = driver.findElement(headLine).getText();
        return headline;
    }

}
