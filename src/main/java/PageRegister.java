import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageRegister {
    private WebDriver driver;

    public PageRegister(WebDriver driver) {
        this.driver = driver;
    }

    By inputFirstName = By.id("fieldsform-first_name");
    By inputLastName = By.id("fieldsform-last_name");
    By inputEmail = By.id("fieldsform-email");
    By inputCompanyName = By.id("fieldsform-company_name");
    By inputWebSiteCompany = By.id("fieldsform-web_site");
    By inputPhone = By.id("fieldsform-phone");
    By buttonFinish = By.xpath("//*[@class='btn btn-primary btn-lg btn-wide']");

   /////////////////////////     Методы     ///////////////////////

    public PageCheck_Email registration(String firstName, String lastName) {
        driver.findElement(inputFirstName).sendKeys(firstName);
        driver.findElement(inputLastName).sendKeys(lastName);
        driver.findElement(buttonFinish).click();
        return new PageCheck_Email(driver);
    }
    public String getEmail(){
        String email = driver.findElement(inputEmail).getText();
        return email;
    }

}
