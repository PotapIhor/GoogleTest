package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.page.GooglePage;
import pages.page.GoogleResultPage;
import pages.page.Wikipedia;
import pages.page.Wikisearch;
import tests.patternTest.PatternTest;


import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GoogleTestPage extends PatternTest {

    //public WebDriver driver;
    //private WebElement profileUser;





    @Test
    public void testSearch() {
        driver.get("https://www.google.com.ua");
        GooglePage home = new GooglePage(driver);
        home = home.open();
        GoogleResultPage result = home.search("Nebuchadnezzar ");
        Assert.assertTrue(result());
    }
       public Boolean result(){
            List<WebElement> allElements = driver.findElements(By.className("iUh30" ));
            int s = allElements.size();
            Boolean b = false;
            if(s>0) {
                b = true;
            }
            return b;
        }
    @Test

    public void pageSearch(){
        driver.get("https://www.google.com.ua");
        GooglePage home = new GooglePage(driver);
        home = home.open();
        GoogleResultPage result = home.search("Nebuchadnezzar ");
        result.getFirstLink().isPageOpened() ;

    }


    @Test
    public void defender() {
        driver.get("https://en.wikipedia.org/wiki/Nebuchadnezzar_II");


        String getUrlValidator = driver.getCurrentUrl();


    }

 @Test
  public void selenide(){
    // System.setProperty("webdriver.chrome.driver", "C:\\ChromDriver\\chromedriver.exe");

     Configuration.browser = "chrome";
     open("https://en.wikipedia.org/wiki/Nebuchadnezzar_II");
     $("#searchInput").setValue("Java").pressEnter();
  //   $$("#firstHeading").shouldHave(CollectionCondition.exactTexts("JAVA"));
   $$("#firstHeading").shouldHaveSize(1);



    }

@Test
    public void testForSelenide(){
    GooglePage googlePage = new GooglePage(driver).open();
    GoogleResultPage googleResultPage = googlePage.search("Nebuchadnezzar");
    Wikipedia wikipedia = googleResultPage.getFirstLink();
    Wikisearch wikisearch = wikipedia.mainPageWiki();
    Assert.assertTrue(wikisearch.isPageOpened());
}

}









