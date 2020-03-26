package lesson03.composite.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPageComposite {

    protected WebDriver driver;

    protected AbstractPageComposite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
