package lesson03.composite.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage extends AbstractPageComposite {

    protected CategoryTabComposite categories;

    protected SearchComposite search;

    protected AbstractPage(WebDriver driver) {
        super(driver);
        search = new SearchComposite(driver);
        categories = new CategoryTabComposite(driver);
    }

    protected String getText(final WebElement element) {
        String text = "";
        text = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOf(element)).getText();
        return text;
    }
}
