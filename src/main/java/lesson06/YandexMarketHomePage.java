package lesson06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexMarketHomePage extends AbstractPage {

    @FindBy(id = "header-search")
    private WebElement searchTextInput;

    @FindBy(xpath = "//*[text()='Найти']/..")
    private WebElement searchButton;

    public YandexMarketHomePage(WebDriver driver) {
        super(driver);
    }

    public void sendKeysToSearchTextInput(String text) {
        searchTextInput.sendKeys(text);
    }

    public void clickToSearchButton() {
        searchButton.click();
    }
}
