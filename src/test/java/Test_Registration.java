import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Test_Registration {

    private WebDriver driver;
    private StartPage startPage;
    private PageLogin pageLogin;
    private PageMyTasks pageMyTasks;
    private PageSignUp pageSignUp;
    private String email = "jaber76291@twit-mail.com";
    private String password = "0987qwer";
    private String urlPageTask = "https://app.100hires.com/my-tasks";


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/Mac/Desktop/Test_100hires/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://100hires.com");
        startPage = PageFactory.initElements(driver, StartPage.class);
        pageLogin = PageFactory.initElements(driver, PageLogin.class);
        pageMyTasks = PageFactory.initElements(driver, PageMyTasks.class);
        pageSignUp = PageFactory.initElements(driver, PageSignUp.class);


    }
    // Сравнение url после успешной авторизации
    @Test
    public void test1() {
        startPage.clickLoginIn();
        pageLogin.autorization(email,password);
        pageMyTasks.linkJobs.click();
        Assert.assertEquals(driver.getCurrentUrl(), urlPageTask);
    }
    @Test
    public void test2(){
        startPage.clickLoginIn();
        pageLogin.clickButtonRegistration();
        pageSignUp.inputEmail.sendKeys(email);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
