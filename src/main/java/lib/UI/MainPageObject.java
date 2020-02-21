package lib.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageObject {
    protected WebDriver driver;

    public MainPageObject(WebDriver driver) {
        this.driver = driver;

    }


    private WebElement waitForElement(By by, String error_message, long timeout_second)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout_second);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by));
    }
    // Перегрузка метода ожидания с дефолтным временем ожидания
    private WebElement waitForElement(By by, String error_message)
    {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by));
    }
    // Ожидание элемента и click
    private WebElement waitForElementAndClick(By by, String error_message, int timeout_second)
    {
        WebElement element = waitForElement(by, error_message, timeout_second);
        element.click();
        return element;
    }
    //  Ожидание элемента и ввод значения
    private WebElement waitForElementAndSend(By by, String value, String error_message, int timeout_second)
    {
        WebElement element = waitForElement(by, error_message, timeout_second);
        element.sendKeys(value);
        return element;
    }
    //  Ожидание элемента и удаление значения
    private WebElement waitForElementAndClear(By by, String value, String error_message, int timeout_second)
    {
        WebElement element = waitForElement(by, error_message, timeout_second);
        element.clear();
        return element;
    }
    // Отсутствие элемента
    private boolean waitForElementNotPresent(By by, String error_message, long timeout_second) {
        WebDriverWait wait = new WebDriverWait(driver, timeout_second);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.invisibilityOfElementLocated(by));
    }
    // Свайп вверх
//    private void swipeUp(int timeOfSwipe)
//    {
//        TouchAction action = new TouchAction(driver);
//        Dimension size = driver.manage().window().getSize();
//        int x = size.width / 2;
//        int start_y = (int) (size.height * 0.8);
//        int end_y = (int) (size.height * 0.2);
//        action.press(x, start_y).waitAction(timeOfSwipe).moveTo(x, end_y).release().perform();
//    }
}


