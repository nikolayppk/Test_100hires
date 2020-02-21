import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageRegister {
    private WebDriver driver;

    public PageRegister(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "fieldsform-first_name")
    private WebElement inputFirstName;

    @FindBy(id = "fieldsform-last_name")
    private WebElement inputLastName;

    @FindBy(id = "fieldsform-email")
    private WebElement inputEmail;

    @FindBy(id = "fieldsform-company_name")
    private WebElement inputCompanyName;

    @FindBy(id = "fieldsform-web_site")
    private WebElement inputWebSiteCompany;

    @FindBy(id = "fieldsform-phone")
    private WebElement inputPhone;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-lg btn-wide']")
    private WebElement buttonFinish;

   /////////////////////////     Методы     ///////////////////////

    public PageRegister setFirstName(String FirstName) {
        inputFirstName.sendKeys(FirstName);
        return this;
    }
    public PageRegister setLastName(String LastName) {
        inputLastName.sendKeys(LastName);
        return this;
    }
    public PageRegister setEmail(String Email) {
        inputLastName.sendKeys(Email);
        return this;
    }
    public PageRegister setCompanyName(String CompanyName) {
        inputLastName.sendKeys(CompanyName);
        return this;
    }
    public PageRegister setWebSiteCompany(String WebSiteCompany) {
        inputLastName.sendKeys(WebSiteCompany);
        return this;
    }
    public PageRegister setPhone(String Phone) {
        inputLastName.sendKeys(Phone);
        return this;
    }
    public PageLogin clickButtonFinish() {
        buttonFinish.click();
        return new PageLogin(driver);
    }

}
