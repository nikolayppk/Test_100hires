import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLogin {

    private WebDriver driver;

    public PageLogin(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(id = "loginform-email")
    private WebElement inputEmail;

    @FindBy(id = "loginform-password")
    private WebElement inputPassword;

    @FindBy(xpath = "//a[@class='login-form__link']")
    private WebElement buttonForgetPassword;

    @FindBy(xpath = "//a[@class='login-form__link login-form__link_signup']")
    private WebElement buttonRegistration;

    @FindBy(xpath = "//button[@class='btn btn-auth']")
    private WebElement buttonSignIn;



    /////////////////////////     Методы     ///////////////////////
    public PageLogin setPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }
    public PageLogin setEmail(String email) {
        inputEmail.sendKeys(email);
        return this;
    }
    public PagePasswordReset clickForgetPassword() {
        buttonForgetPassword.click();
        return new PagePasswordReset(driver);
    }
    public PageSignUp clickButtonRegistration() {
        buttonRegistration.click();
        return new PageSignUp(driver);
    }
    public void autorization(String email, String password) {
        setEmail(email);
        setPassword(password);
        buttonSignIn.click();
    }
}

