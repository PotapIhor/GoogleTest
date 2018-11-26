package pages.page;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;

public class Wikisearch extends Wikipedia {
    private WebDriver driver;


    public Wikisearch(WebDriver driver) {
        super(driver);


    }
    public boolean isPageOpened() {
        return heading.getText().toString().contains("Nebuchadnezzar II");

    }

}

