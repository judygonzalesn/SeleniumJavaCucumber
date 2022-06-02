package Utils;

import Helpers.UIHelpers;
import PageFactory.PageObjectManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContextSetup {

    public WebDriver driver;
    public UIHelpers uiHelpers;
    public PageObjectManager pageObjectManager;
    public GenericUtils genericUtils;
    public BaseClass baseClass;

    public TestContextSetup() throws IOException {
        baseClass = new BaseClass();
        pageObjectManager = new PageObjectManager(baseClass.WebDriverManager());
        genericUtils = new GenericUtils(baseClass.WebDriverManager());
//        uiHelpers = new UIHelpers(baseClass.WebDriverManager());
    }
}
