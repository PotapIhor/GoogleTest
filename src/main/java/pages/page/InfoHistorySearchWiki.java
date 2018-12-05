package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfoHistorySearchWiki extends WikiJavaSearch {
    @FindBy(tagName = "История СССР")
    private WebElement linkHistory;
    public Boolean choosePresident;


    public InfoHistorySearchWiki(WebDriver driver) {
        super(driver);
    }

}
