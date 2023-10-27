package newProject.utilies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

    public static void sleepInSeconds(int sleepInSeconds) {
        try {
            Thread.sleep(sleepInSeconds * 1000L);
        } catch (Exception e) {
            //
        }
    }

    public WebElement waitUntilElementIsVisible(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
