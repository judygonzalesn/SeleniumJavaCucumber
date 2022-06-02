package BaseUtil;

import org.openqa.selenium.WebDriver;

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
