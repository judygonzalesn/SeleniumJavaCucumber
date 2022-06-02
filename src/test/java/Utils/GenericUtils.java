package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericUtils {
    public WebDriver driver;

    public GenericUtils(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean getPageSource(String searchItem) {
        return driver.getPageSource().contains(searchItem);
    }

    public Boolean getCurrentUrl(String searchItem) {
        return driver.getCurrentUrl().contains(searchItem);
    }

}
