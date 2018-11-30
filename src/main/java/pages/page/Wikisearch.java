package pages.page;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;

public class Wikisearch extends Wikipedia {

    @FindBy (name = "search")
    private WebElement result;


    public Wikisearch(WebDriver driver) {
        super(driver);
        }



    public WikiJavaSearch twoStepSearch(String text){
        result.clear();
        result.sendKeys(text);
        result.submit();
        //driver.navigate().back();
        return new WikiJavaSearch(driver);
    }

    public WikiJavaSearch beck(){
        driver.navigate().back();
        return new WikiJavaSearch(driver);

    }
}

