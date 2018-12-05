package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.page.*;
import tests.PatternTest;


import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GoogleTestPage extends PatternTest {


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
    }

    @Test
  public void selenide(){
     Configuration.browser = "chrome";
     open("https://en.wikipedia.org/wiki/Nebuchadnezzar_II");
     $("#searchInput").setValue("Java").pressEnter();
  //   $$("#firstHeading").shouldHave(CollectionCondition.exactTexts("JAVA"));
   $$("#firstHeading").shouldHaveSize(1);



    }

    @Test
    public void testForSelenide(){
    GooglePage googlePage = new GooglePage(driver).open();
    GoogleResultPage googleResultPage = googlePage.search("Wikipedia");
    Wikipedia wikipedia = googleResultPage.getFirstLink();
    Assert.assertTrue(wikipedia.isPageOpened());

    Wikisearch wikisearch = wikipedia.input("Java Automation");
    Assert.assertTrue(wikisearch.isPageOpened());
}

    @Test
    public void bigTest(){
    GooglePage googlePage = new GooglePage(driver).open();
    GoogleResultPage googleResultPage = googlePage.search("Wikipedia");
    Wikipedia wikipedia = googleResultPage.getFirstLink();
    Wikisearch wikisearch = wikipedia.input("Java Automation");
    WikiJavaSearch wikiJavaSearch = wikisearch
            .twoStepSearch("Список руководителей СССР")
            .beck()
            .twoStepSearch("Список руководителей СССР")
            .clickForResult();
   InfoHistorySearchWiki infoHistorySearchWiki = wikiJavaSearch.president();
    Assert.assertTrue(infoHistorySearchWiki.realOpen());
}

    @Test
    public void bigTest2(){
        Boolean b = new GooglePage(driver)
                .open()
                .search("Wikipedia")
                .getFirstLink()
                .input("Java Automation")
                .twoStepSearch("Список руководителей СССР")
                .beck()
                .twoStepSearch("Список руководителей СССР")
                .clickForResult()
                .president()
                .realOpen();
        Assert.assertTrue(b);
    }

    @Test
    public void bigTest3(){
        GooglePage googlePage= new  GooglePage(driver)
                .open()
                .search("Wikipedia")
                .getFirstLink()
                .input("Java Automation")
                .twoStepSearch("Список руководителей СССР")
                .clickForResult().choosePresident("Владимир Ильич Ленин");
                Assert.assertTrue(infoHistorySearchWiki.isTextPresent("Ленин, Владимир Ильич"));
    }

    @Test
    public void bigTest4(){
        WikiJavaSearch b = new WikiJavaSearch(driver)
                .fast()
                .clickForResult().choosePresident("Владимир Ильич Ленин");
    }
}









