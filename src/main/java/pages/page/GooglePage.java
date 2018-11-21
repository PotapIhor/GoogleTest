package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.lang.model.element.Element;

public class GooglePage extends ParentPage {
    private WebDriver driver;
    private WebElement fild;

    @FindBy(name = "q")
    public Element searchFild;



    public GooglePage(WebDriver driver, String s) {
        super(driver, "https://www.google.com.ua");
        this.driver = driver;
    }

    public GooglePage open(){
        return new GooglePage(driver, "https://en.wikipedia.org");
    }

    public GoogleResultPage search(String text) {
        fild = driver.findElement(By.id("lst-ib"));
        fild.sendKeys(text);
        fild.submit();
        return new GoogleResultPage(driver);
    }
}
