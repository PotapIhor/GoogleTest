package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class WikiJavaSearch extends Wikisearch{

    @FindBy (className = "firstHeading")
    private WebElement res;

    @FindBy (className = "searchmatch")
    private WebElement faundResult;

       @FindBy(xpath = " //*[@id=\"mw-content-text\"]/div/table/tbody/tr[11]/td[2]/a ")
    private WebElement gorbachev;

    public WikiJavaSearch(WebDriver driver) {
        super(driver);
    }

    public boolean realOpen(){
        return res.getText().toString().contains("Горбачёв, Михаил Сергеевич");
    }

    public WikiJavaSearch clickForResult(){
          faundResult.click();
          return new WikiJavaSearch(driver);
    }

    public InfoHistorySearchWiki president(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", gorbachev);
        gorbachev.click();
        return new InfoHistorySearchWiki(driver);
    }

    public InfoHistorySearchWiki choosePresident(String lastPresidentUssr){

        //Запихнуть в [xpath lastPresidentUssr  и убрать ретурн нула

      $(By.xpath("//a[@title= president ]")).hover().click();
      return null;
    }
}
