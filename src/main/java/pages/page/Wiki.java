package pages.page;

import org.openqa.selenium.WebDriver;

public class Wiki {
    public WebDriver driver;

    public Wiki(WebDriver driver) {
this.driver = driver;
    }


    public boolean contains(String wikipedia) {
        return true;
    }
}
