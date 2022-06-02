package PageFactory;
import Helpers.UIHelpers;
import Utils.BaseClass;
import Utils.TestContextSetup;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF extends BaseClass {
private TestContextSetup testContextSetup;
    public WebDriver driver;
    public HomePage_PF(WebDriver driver)  {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By search_TxtBox = By.name("q");
    UIHelpers uiHelpers = new UIHelpers(getWebDriver());
    private WebElement search_TextBox = uiHelpers.WaitForElement(search_TxtBox,0,0);


    public void typeInSearchBox(String SearchItem) {
        driver.findElement(search_TxtBox).sendKeys(SearchItem);
        driver.findElement(search_TxtBox).sendKeys(Keys.ENTER);
    }
}