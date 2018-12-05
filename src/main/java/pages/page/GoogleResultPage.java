package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleResultPage extends GooglePage {

    @FindBy(className = "LC20lb")
    private WebElement links;


    public GoogleResultPage(WebDriver driver) {
        super(driver);
    }


    public Wikipedia getFirstLink() {
        links.click();
        return new Wikipedia(driver);
    }
}
