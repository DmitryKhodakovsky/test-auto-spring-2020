package lesson02;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ImplicitlyExplicitWaitSeleniumTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void userBugRedLoginTest() {
        driver.get("http://users.bugred.ru/");

        WebElement loginButton = getClickableElement(By.xpath("//a//span[text()='Войти']"));
        loginButton.click();

        driver.findElement(By.name("login")).sendKeys("test.user@email.com");
        driver.findElement(By.xpath("//form[contains(@action, 'login')]//input[@name='password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();

        WebElement userButton = driver.findElement(By.cssSelector(".dropdown-toggle"));
        assertTrue(userButton.isDisplayed(), "Кнопка пользователя не отображается");
        assertEquals(userButton.getText(), "test user");
    }

    WebElement getClickableElement(By locator) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
        WebElement element = new WebDriverWait(driver, 7)
                .until(ExpectedConditions.elementToBeClickable(locator));
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        return element;
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
