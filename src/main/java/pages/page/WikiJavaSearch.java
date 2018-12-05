package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static java.awt.geom.Path2D.contains;

public class WikiJavaSearch extends Wikisearch {


    @FindBy(tagName = "wiki")
    private WebElement globalSearchPresident;

    @FindBy(className = "firstHeading")
    private WebElement res;

    @FindBy(className = "searchmatch")
    private WebElement faundResult;

    @FindBy(xpath = " //*[@id=\"mw-content-text\"]/div/table/tbody/tr[11]/td[2]/a ")
    private WebElement gorbachev;


    public WikiJavaSearch(WebDriver driver) {
        super(driver);
    }

    public boolean realOpen() {
        return res.getText().toString().contains("Горбачёв, Михаил Сергеевич");
    }

    public WikiJavaSearch clickForResult() {
        faundResult.click();
        return new InfoHistorySearchWiki(driver);
    }

    public InfoHistorySearchWiki president() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", gorbachev);
        gorbachev.click();
        return new InfoHistorySearchWiki(driver);
    }


    public boolean isTextPresent(String text) {
        try {
            boolean b = driver.getPageSource().contains(text);
            return b;
        } catch (Exception e) {
            return false;
        }
    }

    public InfoHistorySearchWiki choosePresident(String lastPresidentUssr) {
        driver.findElement(By.xpath("//a[text()='" + lastPresidentUssr + "']")).click();
        return new InfoHistorySearchWiki(driver);
    }


    public InfoHistorySearchWiki fast() {
        driver.get("https://ru.wikipedia.org/wiki/Список_руководителей_СССР");
        return new InfoHistorySearchWiki(driver);
    }
}
