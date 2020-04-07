package lesson06.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import lesson06.webdriver.WebDriverSingleton;

public class CucumberHooks {

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void tearDown() {
        WebDriverSingleton.INSTANCE.getDriver().quit();
    }
}
