import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageJobs {

    private WebDriver driver;
        public PageJobs(WebDriver driver) {
            this.driver = driver;
        }

    private By buttonAddJobs = By.xpath( "//a[@class= 'btn btn-lg btn-primary btn-wide']");
    private By activeJobs = By.xpath("//a[@class='breadcrumbs__link' and @href= '/jobs/index']");
    private By firstJobs = By.xpath("//div[@class='job-block__title']");
    private By buttonDeleteFirstJob = By.xpath("//span[@class = 'glyphicon glyphicon-trash']");



    public PageJobCreate clickButtonAddJobs() {
        driver.findElement(buttonAddJobs).click();
        return new PageJobCreate(driver);
    }
    public PageJobs clickButtonActiveJobs() {
        driver.findElement(activeJobs).click();
        return this;
    }
    //Возвращаем текст первой активной Job
    public String getFirstJob(){
        String nameFirstJob = driver.findElement(firstJobs).getText();
        return nameFirstJob;
    }
    public PageJobs buttonDeleteFirstJob() {
        driver.findElement(buttonDeleteFirstJob).click();
        return this;
    }
}
