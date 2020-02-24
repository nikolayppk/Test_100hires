
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainClass {
    protected WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/Mac/Desktop/Test_100hires/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }
    public void tearDown(){
        driver.quit();
    }
}

