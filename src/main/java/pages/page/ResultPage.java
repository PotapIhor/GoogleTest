package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {
    public WebDriver driver;
    private WebElement element ; //инициализировать !!!!!


    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public Wiki getFirstLink() {
        driver.findElements(By.className("iUh30"));
        element.click();
        element.getText();
        return new Wiki(driver);
    }
}
