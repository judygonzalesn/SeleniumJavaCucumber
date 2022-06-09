package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Features/Home.feature",
glue={"StepsDefinitions"},
monochrome=true,
plugin = {"pretty", "html:target/Reports/cucumber-reports.html"}
)
public class TestRunner {

}
