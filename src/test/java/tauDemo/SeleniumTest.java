package tauDemo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {



    WebDriver driver;

    @Before
    public void beforeAll() {

        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        driver = new FirefoxDriver();

    }

    @After
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void openTheComPageAndCheckTitle() {
        String expectedComTitle = "Example Domain";
        driver.get("https://www.example.com");
        Assert.assertEquals(expectedComTitle,driver.getTitle());
    }

    @Test
    public void openTheOrgPageAndCheckTitle() {
        String expectedOrgTitle = "Example Domain";
        driver.get("https://www.example.org");
        Assert.assertEquals(expectedOrgTitle,driver.getTitle());
    }
}
