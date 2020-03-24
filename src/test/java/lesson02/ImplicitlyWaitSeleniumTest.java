package lesson02;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ImplicitlyWaitSeleniumTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(45000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void userBugRedLoginTest() {
        driver.get("http://users.bugred.ru/");

//        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();
        WebElement loginButton = driver.findElement(By.xpath("//a//span[text()='Войти']"));
        loginButton.click();

        driver.findElement(By.name("login")).sendKeys("test.user@email.com");
        driver.findElement(By.xpath("//form[contains(@action, 'login')]//input[@name='password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();

        WebElement userButton = driver.findElement(By.cssSelector(".dropdown-toggle"));
        assertTrue(userButton.isDisplayed(), "Кнопка пользователя не отображается");
        assertEquals(userButton.getText(), "test user");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
