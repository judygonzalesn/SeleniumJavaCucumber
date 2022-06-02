package cucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(features ="src/test/resources/Features",
        glue={"StepsDefinitions"},
        monochrome = true)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {
}
