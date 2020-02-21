import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageSetPassword {
    private WebDriver driver;

    public PageSetPassword(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "setpassword-password")
    private WebElement inputPassword;

    @FindBy(id = "setpassword-confirm_password")
    private WebElement inputConfirmPassword;

    @FindBy(xpath = "//*[@class='form-group field-setpassword-confirm_password required has-error']")
    private WebElement buttonSetPassword;


    /////////////////////////     Методы     ///////////////////////
    public PageSetPassword setPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }
    public PageSetPassword setConfirmPassword(String confirmPassword) {
        inputConfirmPassword.sendKeys(confirmPassword);
        return this;
    }
    public PageMyTasks clickButtonSetPassword() {
        buttonSetPassword.click();
        return new PageMyTasks(driver);
    }
}
