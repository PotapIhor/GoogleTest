package pages.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wiki {
    public WebDriver driver;


    @FindBy( xpath = "//*[@id=\"firstHeading\"]")
    WebElement heading;


    public Wiki(WebDriver driver) {
        this.driver = driver;
    }



    public boolean isPageOpened(){
        return heading.getText().toString().contains("Nebuchadnezzar II");



}
}
