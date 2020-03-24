package lesson02;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleSeleniumWebElementsTest {

    @Test
    public void whatWeDoEpamPageTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://epam.com");

        WebElement whatWeDoLink = driver.findElement(By.linkText("WHAT WE DO"));
        whatWeDoLink.click();

        List<WebElement> elements = driver.findElements(By.className("rollover-tiles__link"));

        List<String> expectedText = Arrays.asList("Consult", "Design", "Engineer", "Operate", "Optimize");
        List<String> actualText = elements.stream().map(WebElement::getText).collect(Collectors.toList());

        Assert.assertEquals(actualText, expectedText);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
