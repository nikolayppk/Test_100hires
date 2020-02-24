
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Autorization extends MainClass{
    /*
    Кейсы:
    1. проверка авторизации, валидные значения email, password
    2. добавление job
    */
    StartPage startPage;
    String email = "gigepih703@cmailing.com";
    String password = "0987qwer";
    String headlinePageCreateJob = "New job";
    String jobTitle = "QA Engineer";

    @BeforeClass
    public void before(){
        setUp();
        startPage = new StartPage(driver);
    }
    @Test
    public void test1(){
        driver.get("https://100hires.com");
        PageLogin pageLogin = startPage.ClickButtonLog();
        PageMyTasks pageMyTasks = pageLogin.autorization(email, password);
        PageJobs pageJobs = pageMyTasks.clickLinkJobs();
        PageJobCreate pageJobCreate = pageJobs.clickButtonAddJobs();
        Assert.assertEquals(pageJobCreate.getHeadline(), headlinePageCreateJob); // проверяем что находимся в форме создания New job
        pageJobCreate.setJobTitle(jobTitle);
        PageApplicantForm pageApplicantForm = pageJobCreate.clickButtonNext();
        System.out.println(pageApplicantForm.getHeaderName());
        pageMyTasks.clickLinkJobs();
        pageJobs.clickButtonActiveJobs();
        Assert.assertEquals(pageJobs.getFirstJob(), jobTitle); // проверяем что job добавился в список активных
        pageJobs.buttonDeleteFirstJob(); //удаляем созданный job
    }
    @AfterTest
    public void quit() {
        tearDown();
    }

}

