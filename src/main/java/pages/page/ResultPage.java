package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage {
    private WebDriver driver;
    private WebElement q;


    @FindBy (className ="r")
    public WebElement links;

  /*  public List<WebElement> getLinks(){
        return getLinks;
    }

*/


    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }



   public Wiki getFirstLink() {
    q = driver.findElement(By.className("r"));
    q.click();
      // links.click();
        return new Wiki(driver);
    }
}
