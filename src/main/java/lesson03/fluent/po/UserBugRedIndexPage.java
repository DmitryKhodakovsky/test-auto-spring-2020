package lesson03.fluent.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserBugRedIndexPage {

    private WebDriver driver;

    @FindBy(xpath = "//a//span[text()='Войти']")
    private WebElement loginButton;

    @FindBy(css = ".dropdown-toggle")
    private WebElement userButton;

    public UserBugRedIndexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public UserBugRedLoginPage clickLoginButton() {
        loginButton.click();
        return new UserBugRedLoginPage(driver);
    }

    public String getUserButtonText() {
        return userButton.getText();
    }
}
