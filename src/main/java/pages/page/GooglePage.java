package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.lang.model.element.Element;

public class GooglePage extends ParentPage {
    private WebElement fild;

    @FindBy(name = "q")
    public Element searchFild;


    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public GooglePage open() {
        driver.get("https://www.google.com");
        return new GooglePage(driver);
    }


    public GoogleResultPage search(String text) {
        fild = driver.findElement(By.name("q"));
        fild.sendKeys(text);
        fild.submit();
        return new GoogleResultPage(driver);
    }
}
