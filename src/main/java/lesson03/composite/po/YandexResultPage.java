package lesson03.composite.po;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexResultPage extends AbstractPage {

    @FindBy(css = ".serp-list a.link_theme_normal")
    private List<WebElement> results;

    public YandexResultPage(WebDriver driver) {
        super(driver);
    }

    public void search(String searchedItem) {
        search.sendKeysToSearchTextField(searchedItem);
        search.clickSearButton();
    }

    public String getFirstItemText() {
        return getText(results.get(0));
    }


}
