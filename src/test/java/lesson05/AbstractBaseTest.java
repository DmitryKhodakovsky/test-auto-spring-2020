package lesson05;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson05.steps.UserBugRedSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class AbstractBaseTest {

    protected WebDriver driver;

    protected UserBugRedSteps steps;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriverSingleton.INSTANCE.createdDriver("chrome");
        driver = WebDriverSingleton.INSTANCE.getDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        steps = new UserBugRedSteps();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSingleton.INSTANCE.getDriver().quit();
    }
}
