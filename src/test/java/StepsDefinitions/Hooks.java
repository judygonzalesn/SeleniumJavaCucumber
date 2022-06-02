package StepsDefinitions;

import Utils.BaseClass;
import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {

    TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Before
    public void InitializeTest() throws IOException {
    testContextSetup.baseClass.WebDriverManager();
    }

    @After
    public void Close() throws IOException {
        testContextSetup.baseClass.WebDriverManager().quit();
    }
}
