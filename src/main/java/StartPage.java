import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage {
    private WebDriver driver;
    public StartPage(WebDriver driver) {
        this.driver = driver;
    }
        @FindBy(xpath = "//a[@class='header__top__login']")
        private WebElement loginIn;

        @FindBy(id = "emailform-email")
        private WebElement inputEmail;

        @FindBy(xpath = "//*[@class='btn btn-lg btn-purple signup-form__submit']")
        private WebElement buttonForFree;

    /////////////////////////     Методы     ///////////////////////

        public PageLogin clickLoginIn(){
            loginIn.click();
            return new PageLogin(driver);
        }
        public PageRegister clickButtonGetFree(){
            buttonForFree.click();
            return new PageRegister(driver);
        }
        public StartPage setEmail(String email){
            inputEmail.sendKeys(email);
            return this;
        }
 }

