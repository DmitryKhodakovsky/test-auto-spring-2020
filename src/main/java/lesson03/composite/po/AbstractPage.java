package lesson03.composite.po;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage extends AbstractPageComposite {

    protected CategoryTabComposite categories;

    protected SearchComposite search;

    protected AbstractPage(WebDriver driver) {
        super(driver);
        search = new SearchComposite(driver);
        categories = new CategoryTabComposite(driver);
    }
}
