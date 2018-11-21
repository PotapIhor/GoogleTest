package pages.page;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;

public class Wikisearch extends Wikipedia {
    private WebDriver driver;


    public Wikisearch(WebDriver driver) {
        super(driver, "https:/ /en.wikipedia.org/wiki/Nebuchadnezzar_II");
    }
}

