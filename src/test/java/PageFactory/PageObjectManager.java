package PageFactory;

import Utils.GenericUtils;
import Helpers.UIHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class PageObjectManager {

    public HomePage_PF homePage;
    public UIHelpers uiHelpers;
    public WebDriver driver;
    public WebDriverWait wait;
    public GenericUtils genericUtils;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage_PF getHomePage() throws IOException {
        homePage = new HomePage_PF(driver);
        return homePage;
    }
//
//    public UIHelpers getUiHelpers(){
//        uiHelpers = new UIHelpers(driver);
//        return uiHelpers;
//    }

    public GenericUtils getGenericUtils() {
        genericUtils = new GenericUtils(driver);
        return genericUtils;
    }
}
