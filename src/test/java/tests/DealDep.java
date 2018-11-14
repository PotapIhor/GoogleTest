package tests;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DealDep {
    private WebDriver driver;
    private WebElement profileUser;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://app.staging.dealdep.com/ru/users/sign_in");
    }

    @Test
    public void userLogin() {
        //setup();
        WebElement loginField = driver.findElement(By.id("user_email"));
        loginField.sendKeys("potapenko.igorr@gmail.com");
        WebElement passwordField = driver.findElement(By.id("user_password"));
        passwordField.sendKeys("123456");
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Войти']"));
        loginButton.click();
        profileUser = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/a[3]"));
        profileUser.click();
        WebElement mailUser = (WebElement) driver.findElements(By.xpath("//*[@id=\"user_email\"]"));

        mailUser.getText();
        Assert.assertEquals("potapenko.igor@gmail.com", mailUser);
        //tearDown();
    }

    @After
    public void tearDown() {
        WebElement menuUser = driver.findElement(By.cssSelector(".login-button__menu-icon"));
        menuUser.click();
        WebElement logoutButton = driver.findElement(By.id("login__logout"));
        logoutButton.click();
        driver.quit();
    }
}
