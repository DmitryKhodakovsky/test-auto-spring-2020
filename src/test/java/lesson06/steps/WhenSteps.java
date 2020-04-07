package lesson06.steps;

import io.cucumber.java.en.When;
import lesson06.YandexMarketHomePage;
import lesson06.YandexMarketSearchResultsPage;
import lesson06.webdriver.WebDriverSingleton;

public class WhenSteps {

    @When("I search {string} on the Yandex Market")
    public void iSearchOnTheYandex(String item) {
        YandexMarketHomePage homePage = new YandexMarketHomePage(WebDriverSingleton.INSTANCE.getDriver());
        homePage.sendKeysToSearchTextInput(item);
        homePage.clickToSearchButton();
    }

    @When("I click on the {int}-(:?st|nd|rd|th) searched item on the Search result page")
    public void iClickOnTheSearchedItem(int index) {
        YandexMarketSearchResultsPage resultsPage = new YandexMarketSearchResultsPage(WebDriverSingleton.INSTANCE.getDriver());
        resultsPage.clickToResultLink(index);
    }

}
