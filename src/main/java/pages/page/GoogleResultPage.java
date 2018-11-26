package pages.page;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

public class GoogleResultPage extends GooglePage {
    //private WebDriver driver;
    //private WebElement clickForSearch;


    @FindBy (xpath ="//*[@id=\"rso\"]//div/div[1]/div/div/div[1]/a[1]/h3")
    //*[@id="rso"]/div[1]/div/div[1]/div/div/div[1]/a[1]/h3
    private WebElement links;

  /*  public List<WebElement> getLinks(){
        return getLinks;
    }  */

    public GoogleResultPage(WebDriver driver) {
        super(driver);
    }


    public GooglePage open(){
        driver.get("http://www.google.com/search?hl=ru&source=hp&ei=fqT2W6yJLYa5swGzyLT4CQ&q=Nebuchadnezzar");
        return new GooglePage(driver);
    }




    public Wikipedia getFirstLink() {
        links.click();
        return new Wikipedia(driver);
    }
}
