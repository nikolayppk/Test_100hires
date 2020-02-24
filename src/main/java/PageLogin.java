import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class PageLogin {

    private WebDriver driver;

    public PageLogin(WebDriver driver) { this.driver = driver; }

    private By inputEmail = (By.id("loginform-email"));
    private By inputPassword = (By.id("loginform-password"));
    private By buttonForgetPassword = (By.xpath("//a[@class='login-form__link']"));
    private By buttonRegistration = (By.xpath("//a[@class='login-form__link login-form__link_signup']"));
    private By buttonSignIn = (By.xpath("//button[@class='btn btn-auth']"));

    /////////////////////////     Методы     ///////////////////////
    public PageLogin setPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
        return this;
    }
    public PageLogin setEmail(String email) {
        driver.findElement(inputEmail).sendKeys(email);
        return this;
    }
    public PagePasswordReset clickForgetPassword() {
        driver.findElement(buttonForgetPassword).click();
        return new PagePasswordReset(driver);
    }
    public PageSignUp clickButtonRegistration() {
        driver.findElement(buttonRegistration).click();
        return new PageSignUp(driver);
    }
    public PageMyTasks autorization(String email, String password) {
        setEmail(email);
        setPassword(password);
        driver.findElement(buttonSignIn).click();
        return new PageMyTasks(driver);
    }
}

