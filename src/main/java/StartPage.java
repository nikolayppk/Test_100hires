import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.security.krb5.internal.PAData;


public class StartPage extends MainClass{
    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    By  logIn = (By.xpath("//a[@class='header__top__login']"));


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
        public PageLogin ClickButtonLog(){
            driver.findElement(logIn).click();
            return new PageLogin(driver);
        }
 }

