package lesson03.composite.po;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class CategoryTabComposite extends AbstractPageComposite {

    @FindBy(css = ".home-arrow__tabs a.home-link")
//    @FindBys({
//            @FindBy(className = "home-arrow__tabs"),
//            @FindBy(how = How.CSS, using = "a.home-link")
//    })
    private List<WebElement> categories;

    public CategoryTabComposite(WebDriver driver) {
        super(driver);
    }

    public void clickCategory(String category) {
        categories.stream()
                .filter(cat -> cat.getText().equals(category))
                .findFirst()
                .get()
                .click();
    }
}
