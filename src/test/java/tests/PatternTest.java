package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.page.*;

import java.util.concurrent.TimeUnit;

public class PatternTest {
    protected WebDriver driver;
    protected GooglePage googlePage;
    protected GoogleResultPage googleResultPage;
    protected Wikipedia wikipedia;
    protected Wikisearch wikisearch;
    protected InfoHistorySearchWiki infoHistorySearchWiki;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\DriverChrom\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        googlePage = new GooglePage(driver);
        googleResultPage = new GoogleResultPage(driver);
        wikipedia = new Wikipedia(driver);
        wikisearch = new Wikisearch(driver);
        infoHistorySearchWiki = new InfoHistorySearchWiki(driver);
    }



    @After
    public void tearDown() {
        driver.close();
    }



}