package lesson06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YandexMarketSearchResultsPage extends AbstractPage {

    @FindBy(className = "n-snippet-cell2__title")
    private List<WebElement> resultsLinks;

    public YandexMarketSearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickToResultLink(int index) {
        resultsLinks.get(index - 1).click();
    }
}
