package lesson06.steps;

import io.cucumber.java.en.Given;
import lesson06.webdriver.WebDriverSingleton;

public class GivenSteps {

    @Given("I am on Yandex Market Home page")
    public void iAmOnYandexHomePage() {
        WebDriverSingleton.INSTANCE.createdDriver("chrome");
        WebDriverSingleton.INSTANCE.getDriver().get("https://market.yandex.ru/");
    }

}
