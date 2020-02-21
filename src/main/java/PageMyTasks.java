import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageMyTasks {
    private WebDriver driver;

    public PageMyTasks(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class='header-search__input']")
    public WebElement linkJobs;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-primary btn-wide']")
    private WebElement buttonAdd;



    /////////////////////////     Методы     ///////////////////////

    public PageMyTasks clickLinkJobs() {
        linkJobs.click();
        return new PageMyTasks(driver);
    }
    public PageJobCreate clickButtonAdd() {
        buttonAdd.click();
        return new PageJobCreate(driver);
    }

}
