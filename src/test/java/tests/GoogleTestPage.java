package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.page.HomePage;
import pages.page.ResultPage;


import java.util.concurrent.TimeUnit;

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
    public void testSearch(){
        HomePage home = new HomePage(driver);
        home = home.open();
        ResultPage result = home.search("Nebuchadnezzar ");

        assertTrue(result.getFirstLink().contains("wikipedia"));
    }

}
