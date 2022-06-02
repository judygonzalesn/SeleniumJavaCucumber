package Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;


public class UIHelpers {
WebDriver driver;
    public UIHelpers(WebDriver driver) {
        this.driver = driver;
    }

//    public UIHelpers(WebDriver driver){
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }


    public WebElement WaitForElement(By locator, int timeOut, int polling) {

        if (timeOut == 0) {
            timeOut = 30;
        }
        if (polling == 0) {
            polling = 5;
        }

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofMillis(polling))
                .ignoring(NoSuchElementException.class);

        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }


    public Boolean IsElementVisible (By locator, int timeOut, int polling) {
        WebElement elementReturn = null;
        if (timeOut == 0) {
            timeOut = 30;
        }
        if (polling == 0) {
            polling = 5;
        }
        try {
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(timeOut))
                    .pollingEvery(Duration.ofMillis(polling))
                    .ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }

    }


    public void Click(By locator, int timeOut, int polling) {
        WebElement clickThis = WaitForElement(locator, timeOut, polling);
        if (IsElementVisible(locator,timeOut,polling))
        {
            clickThis.click();
        }
    }
}

