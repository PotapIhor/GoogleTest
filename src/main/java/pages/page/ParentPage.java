package pages.page;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {
    WebDriver driver;
    String expectedUrl;
    String baseUrl ;

    public ParentPage(WebDriver webDriver) {
        this.driver = webDriver;
        this.expectedUrl = baseUrl + expectedUrl;
        PageFactory.initElements(webDriver, this);
    }

    public String getExpectedUrl() {
        return driver.getCurrentUrl();
    }

}
