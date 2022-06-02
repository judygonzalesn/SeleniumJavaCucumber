package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    String projectPath = System.getProperty("user.dir");
    public static WebDriver Driver;

    // Getter
    public WebDriver WebDriverManager() throws IOException {
        if (Driver == null) {
            FileInputStream fis = new FileInputStream(projectPath + "/src/test/resources/Resources/Global.properties");
            Properties prop = new Properties();
            prop.load(fis);
            String url = prop.getProperty("QAUrl");
            String browser = prop.getProperty("browser");
            if (Driver == null) {
                System.out.println("Open browser");
                if (browser.equalsIgnoreCase("chrome")) {
                    System.setProperty("webdriver.chrome.driver",
                            projectPath + "/src/test/resources/Drivers/chromedriver.exe");
                    Driver = new ChromeDriver();
                }

                Driver.manage().window().maximize();
                Driver.navigate().to(url);
            }
            setWebDriver(Driver);
        }
        return Driver;
    }

    public WebDriver getWebDriver() {
        return Driver;
    }
    public void setWebDriver(WebDriver setDriver) {
        this.Driver = setDriver;
    }


}
