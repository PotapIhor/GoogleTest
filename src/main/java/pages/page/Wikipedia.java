package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wikipedia extends GooglePage{

    @FindBy( xpath = "//*[@id=\"searchInput\"]")
    WebElement heading;

    @FindBy (name = "search")
    private WebElement fieldSearchWiki;


    public Wikipedia(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return heading.getText().toString().contains("Welcome to Wikipedia");

    }




    public Wikisearch input(String text) {
        fieldSearchWiki.sendKeys(text);
        fieldSearchWiki.submit();
        return new Wikisearch(driver);

    }

}

