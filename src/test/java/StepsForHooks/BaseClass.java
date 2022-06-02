package StepsForHooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {

    private static WebDriver Driver; // private = restricted access

    // Getter
    public WebDriver getDriver() {
        return Driver;
    }

    // Setter
    public void setWebDriver(WebDriver driver) {
        this.Driver = driver;
    }



}
