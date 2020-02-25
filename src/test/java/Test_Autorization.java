
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.*;


public class Test_Autorization extends MainClass{
    /*
    Test1:
    1. Регистрация нового пользователя;
    2. Проверка соответствия использованного Email;
    Test2:
    1. Проверка авторизации, валидные значения email, password;
    2. Добавление job;
    */
    StartPage startPage;
    String emailAuthorization = "gigepih703@cmailing.com";
    String password = "0987qwer";
    String headlinePageCreateJob = "New job";
    String jobTitle = "QA Engineer";
    String firstName = "First Name";
    String lastName = "Last Name";
    String emailRegistration;
    String textCheckEmail;

    @BeforeMethod
    public void before(){
        setUp();
        startPage = new StartPage(driver);
        driver.get("https://100hires.com");

    }
    @Test
    public void test1(){
        emailRegistration = randomestring()+"@gmail.com"; // генерируем рандомный email
        textCheckEmail = String.format("Confirm your email address: %s change email", emailRegistration);
        PageLogin pageLogin = startPage.ClickButtonLog();
        PageSignUp pageSignUp = pageLogin.clickButtonRegistration();
        pageSignUp.setEmail(emailRegistration);                             //выполняем регистрацию
        PageRegister pageRegister = pageSignUp.butoonNextClick();
        PageCheck_Email pageCheck_email = pageRegister.registration(firstName, lastName); //заполняем обязателные пол
        Assert.assertEquals(pageCheck_email.getEmail(), textCheckEmail);    // выполняем проверку текста отображаемого после регистрации и введенный email

    }
    @Test
    public void test2(){
        PageLogin pageLogin = startPage.ClickButtonLog();
        PageMyTasks pageMyTasks = pageLogin.autorization(emailAuthorization, password);
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
    @AfterMethod
    public void quit() {
        tearDown();
    }
    public String randomestring() {
        String generatedstring = RandomStringUtils.randomAlphabetic(8);
        return(generatedstring);
    }

}

