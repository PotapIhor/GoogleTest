package pages.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Wiki {
  /*  @FindBy(className = "LC20lb")
    private */


  public WebDriver driver;

  private By clicLink = By.linkText("Nebuchadnezzar II - Wikipedia");






    public Wiki(WebDriver driver) {
this.driver = driver;
    }


  /*  public boolean contains(String wikipedia) {
        return true;
    }  */
}
