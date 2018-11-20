package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleResultPage {
    private WebDriver driver;
    private WebElement q;


    @FindBy (className ="r")
    public WebElement links;

  /*  public List<WebElement> getLinks(){
        return getLinks;
    }  */

    public GoogleResultPage(WebDriver driver) {
        this.driver = driver;
    }



   public Wikipedia getFirstLink() {
    q = driver.findElement(By.className("r"));
    q.click();
      // links.click();
        return new Wikipedia(driver, "https:/ /en.wikipedia.org/wiki/Nebuchadnezzar_II");
    }
}
