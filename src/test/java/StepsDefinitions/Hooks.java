package StepsDefinitions;

import BaseUtil.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseClass {
    BaseClass base = new BaseClass();
    WebDriver driver = base.getDriver();


    @Before
    public void InitializeTest(){
        System.out.println("Open browser");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",
                projectPath + "/src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver .manage().window().maximize();
        base.setWebDriver(driver);
    }

    @After
    public void Close() {
        System.out.println("Close browser");
        driver .quit();
    }
}
