import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.security.krb5.internal.PAData;


public class StartPage extends MainClass{
    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    By logIn = (By.xpath("//a[@class='header__top__login']"));
    By inputEmail = By.id("emailform-email");
    By buttonForFree = (By.xpath("//*[@class='btn btn-lg btn-purple signup-form__submit']"));

    /////////////////////////     Методы     ///////////////////////

        public PageRegister clickButtonGetFree(){
            driver.findElement(buttonForFree).click();
            return new PageRegister(driver);
        }
        public StartPage setEmail(String email){
            driver.findElement(inputEmail).sendKeys(email);
            return this;
        }
        public PageLogin ClickButtonLog(){
            driver.findElement(logIn).click();
            return new PageLogin(driver);
        }
 }

