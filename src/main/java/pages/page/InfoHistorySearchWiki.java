package pages.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfoHistorySearchWiki extends WikiJavaSearch {
    @FindBy(tagName = "История СССР")
    private WebElement linkHistory;
    public Boolean choosePresident;

//    @FindBy(xpath = " //*[@id=\"mw-content-text\"]/div/table/tbody/tr[11]/td[2]/a ")
//    private WebElement gorbachev;



    public InfoHistorySearchWiki(WebDriver driver) {
        super(driver);
    }

//    public InfoHistorySearchWiki president(){
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", gorbachev);
//        gorbachev.click();
//        return new InfoHistorySearchWiki(driver);
//    }
}
