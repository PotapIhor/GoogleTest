package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private WebElement fild;

    public HomePage(WebDriver driver) {
            this.driver = driver;
    }

    public HomePage open(){
        driver.get("https://www.google.com.ua");
        return new HomePage(driver);
    }

    public ResultPage search(String text) {
        fild = driver.findElement(By.id("lst-ib"));
        fild.sendKeys(text);
        fild.submit();
        return new ResultPage(driver);
    }
}
