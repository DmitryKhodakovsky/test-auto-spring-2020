package lesson03.voids.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserBugRedIndexPage {

    @FindBy(xpath = "//a//span[text()='Войти']")
    private WebElement loginButton;

    @FindBy(css = ".dropdown-toggle")
    private WebElement userButton;

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getUserButtonText() {
        return userButton.getText();
    }
}
