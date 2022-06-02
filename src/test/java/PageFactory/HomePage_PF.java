package PageFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
    WebDriver driver;

    public HomePage_PF(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using ="q")
    @CacheLookup
    private  WebElement searchBox;



    public void typeInSearchBox(String SearchItem)
    {
        searchBox.sendKeys(SearchItem);
        searchBox.sendKeys(Keys.ENTER);
    }
}
