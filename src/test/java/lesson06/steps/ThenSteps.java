package lesson06.steps;

import io.cucumber.java.en.Then;
import lesson06.YandexMarketItemPage;
import lesson06.webdriver.WebDriverSingleton;

import static org.assertj.core.api.Assertions.assertThat;

public class ThenSteps {

    @Then("item should have cost {word} RUB on the Item page")
    public void itemShouldHaveCostOnTheItemPage(String expectedPrice) {
        YandexMarketItemPage itemPage = new YandexMarketItemPage(WebDriverSingleton.INSTANCE.getDriver());
        String actualPrice = itemPage.getItemPrice();
        assertThat(actualPrice).contains(expectedPrice);
    }
}
