package pages.page;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {
    WebDriver driver;
  //  String expectedUrl;
    WebElement elementsActions;
    String baseUrl;

    public ParentPage(WebDriver webDriver, String baseUrl) {
     //   elementsActions = new ElementsActions(webDriver);
        this.driver = webDriver;
        this.baseUrl = baseUrl;
        PageFactory.initElements(webDriver, this);
    }

    public String getExpectedUrl() {
        return driver.getCurrentUrl();
    }

}
