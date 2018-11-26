package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wikipedia extends GooglePage{
   // public WebDriver driver;


    @FindBy( xpath = "//*[@id=\"searchInput\"]")
    WebElement heading;


    public Wikipedia(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return heading.getText().toString().contains("Welcome to Wikipedia");

    }




        public Wikisearch mainPageWiki() {
            //heading = driver.findElement(By.className("r"));
            heading.click();
            // links.click();
            return new Wikisearch(driver);
        }

}

