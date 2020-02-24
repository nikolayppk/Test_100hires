import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageMyTasks {
    private WebDriver driver;

    public PageMyTasks(WebDriver driver) {
        this.driver = driver;
    }

    private By linkJobs = By.xpath( "//a[@href = '/jobs']");


    /////////////////////////     Методы     ///////////////////////

    public PageJobs clickLinkJobs() {
        try {
            WebElement button = driver.findElement(linkJobs);
            button.click();
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            WebElement button = driver.findElement(linkJobs);
            button.click();
        }
        return new PageJobs(driver);
    }

}
