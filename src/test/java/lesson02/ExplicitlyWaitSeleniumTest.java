package lesson02;

import io.github.bonigarcia.wdm.WebDriverManager;
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

public class ExplicitlyWaitSeleniumTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void userBugRedLoginTest() {
        driver.get("http://users.bugred.ru/");

        WebDriverWait wait = new WebDriverWait(driver, 7);

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a//span[text()='Войти']")));
        loginButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login"))).sendKeys("test.user@email.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[contains(@action, 'login')]//input[@name='password']"))).sendKeys("test");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Авторизоваться']"))).click();

        WebElement userButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dropdown-toggle")));
        assertTrue(userButton.isDisplayed(), "Кнопка пользователя не отображается");
        assertEquals(userButton.getText(), "test user");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
