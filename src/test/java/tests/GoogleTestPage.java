package tests;

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


import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GoogleTestPage {

    private WebDriver driver;
    //private WebElement profileUser;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\ChromDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



@After
    public void tearDown() {
        driver.quit();
    }

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
        result.getFirstLink();

    }


    @Test
    public void defender(){

    }
    }


