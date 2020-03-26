package lesson03.composite.po;

import org.openqa.selenium.WebDriver;

public class YandexMainPage extends AbstractPage {

    public YandexMainPage(WebDriver driver) {
        super(driver);
    }

    public void search(String searchedItem) {
        search.sendKeysToSearchTextField(searchedItem);
        search.clickSearButton();
    }
}
