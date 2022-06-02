package StepsDefinitions;


import PageFactory.HomePage_PF;
import StepsForHooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class HomePageSteps extends BaseClass {

    WebDriver driver = getDriver();

    @Given("^user enters the (.*) and hit enter$")
    public void user_enters_the_google_search(String url) {
        driver.navigate().to(url);
    }
    @When("^user search in the text (.*) and hit enter$")
    public void user_search_in_the_text_and_hit_enter(String searchItem) {
        HomePage_PF home = new HomePage_PF(driver);
        home.typeInSearchBox(searchItem);
    }

    @Then("^user should be in the Search page (.*) and (.*)$")
    public void user_should_be_in_the_Search_page(String url, String searchItem) {
        driver.getPageSource().equals(searchItem);
        driver.getCurrentUrl().equals(url);
        System.out.println("Close browser");
    }
}
