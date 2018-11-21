package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wikipedia extends GooglePage{
    public WebDriver driver;


    @FindBy( xpath = "//*[@id=\"firstHeading\"]")
    WebElement heading;


    public Wikipedia(WebDriver driver, String s) {
        super(driver, "https://en.wikipedia.org");
        this.driver = driver;
    }



    public boolean isPageOpened() {
        return heading.getText().toString().contains("Nebuchadnezzar II");

    }
        public Wikipedia mainPageWiki() {
            heading = driver.findElement(By.className("r"));
            heading.click();
            // links.click();
            return new Wikisearch(driver);
        }

}

