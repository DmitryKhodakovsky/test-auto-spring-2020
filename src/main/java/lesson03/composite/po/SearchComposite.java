package lesson03.composite.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchComposite extends AbstractPageComposite {

    @FindBy(className = "input__control")
    private WebElement searchTextInput;

    @FindBy(className = "search2__button")
    private WebElement searchButton;

    public SearchComposite(WebDriver driver) {
        super(driver);
    }

    public void sendKeysToSearchTextField(String searchedItem) {
        searchTextInput.sendKeys(searchedItem);
    }

    public void clickSearButton() {
        searchButton.click();
    }
}
