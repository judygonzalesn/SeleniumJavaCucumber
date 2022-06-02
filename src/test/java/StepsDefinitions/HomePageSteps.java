package StepsDefinitions;


import Utils.TestContextSetup;
import PageFactory.HomePage_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class HomePageSteps {
    WebDriver driver;
    TestContextSetup testContextSetup;
    public HomePageSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }
    @Given("^user opened url to \"([^\"]*)\"$")
    public void user_enters_the_google_search(String url) {
      testContextSetup.genericUtils.getCurrentUrl(url);
    }

    @When("^user search in the text (.*) and hit enter$")
    public void user_search_in_the_text_and_hit_enter(String searchItem) throws IOException {
        HomePage_PF homePage_pf = testContextSetup.pageObjectManager.getHomePage();
        homePage_pf.typeInSearchBox(searchItem);
    }

    @Then("^user should be in the Search page (.*) and (.*)$")
    public void user_should_be_in_the_Search_page(String url, String searchItem) {
        testContextSetup.genericUtils.getCurrentUrl(url);
        testContextSetup.genericUtils.getPageSource(searchItem);
    }
}
