package lesson02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SimpleSeleniumTest {

    @Test
    public void openEpamPageWithSystemPropertiesTest() {
        System.setProperty("webdriver.chrome.driver",
                this.getClass().getClassLoader().getResource("lesson02/drivers/chromedriver").getPath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://epam.com");
        assertEquals(driver.getTitle(), "EPAM | Enterprise Software Development, Design & Consulting");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void openEpamPageWithWebDriverManagerTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://epam.com");
        assertEquals(driver.getTitle(), "EPAM | Enterprise Software Development, Design & Consulting");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
