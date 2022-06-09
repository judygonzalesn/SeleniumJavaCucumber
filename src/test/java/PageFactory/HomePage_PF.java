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

    UIHelpers uiHelpers = new UIHelpers(getWebDriver());
    private By search_TxtBox = uiHelpers.WaitForElement(By.name("q"),0,0);


    public void typeInSearchBox(String SearchItem) {
        driver.findElement(search_TxtBox).sendKeys(SearchItem);
        driver.findElement(search_TxtBox).sendKeys(Keys.ENTER);
    }
}