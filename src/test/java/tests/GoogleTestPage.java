package tests;

import  com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.page.HomePage;
import pages.page.ResultPage;
import pages.page.UrlValidator;


import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static java.nio.file.Files.size;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GoogleTestPage {

    private WebDriver driver;
    //private WebElement profileUser;

 /*   @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\DriverChrom\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @After
    public void tearDown() {
        driver.quit();
    }
*/

    @Test
    public void testSearch() {
        driver.get("https://www.google.com.ua");
        HomePage home = new HomePage(driver);
        home = home.open();
        ResultPage result = home.search("Nebuchadnezzar ");
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
        HomePage home = new HomePage(driver);
        home = home.open();
        ResultPage result = home.search("Nebuchadnezzar ");
        result.getFirstLink().isPageOpened() ;

    }


    @Test
    public void defender() {
        driver.get("https://en.wikipedia.org/wiki/Nebuchadnezzar_II");


        String getUrlValidator = driver.getCurrentUrl();


    }

 @Test
  public void selenide(){
     System.setProperty("webdriver.chrome.driver", "C:\\DriverChrom\\chromedriver.exe");

     Configuration.browser = "chrome";
     open("https://en.wikipedia.org/wiki/Nebuchadnezzar_II");
     $("#searchInput").setValue("Java").pressEnter();
  //   $$("#firstHeading").shouldHave(CollectionCondition.exactTexts("JAVA"));
   $$("#firstHeading").shouldHaveSize(1);



    }
}









