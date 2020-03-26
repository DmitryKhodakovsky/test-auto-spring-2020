package lesson03.fluent.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserBugRedLoginPage {

    private WebDriver driver;

    @FindBy(name = "login")
    private WebElement usernameTextField;

    @FindBy(xpath = "//form[contains(@action, 'login')]//input[@name='password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "//input[@value='Авторизоваться']")
    private WebElement authorizeButton;

    public UserBugRedLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // login as one method
    public UserBugRedIndexPage login(String username, String password) {
        usernameTextField.sendKeys(username);
        passwordTextField.sendKeys(password);
        authorizeButton.click();
        return new UserBugRedIndexPage(driver);
    }

    // login as one method
    public UserBugRedLoginPage loginError(String username, String password) {
        usernameTextField.sendKeys(username);
        passwordTextField.sendKeys(password);
        authorizeButton.click();
        return this;
    }

    public String getUsernameTextFieldValue() {
        return usernameTextField.getText();
    }

    // login as two methods
    public UserBugRedLoginPage enterUsernameAndPassword(String username, String password) {
        usernameTextField.sendKeys(username);
        passwordTextField.sendKeys(password);
        return this;
    }

    public UserBugRedIndexPage clickAuthButton() {
        authorizeButton.click();
        return new UserBugRedIndexPage(driver);
    }

    // login as three methods
    public UserBugRedLoginPage sendKeysToUsernameTextField(String username) {
        usernameTextField.sendKeys(username);
        return this;
    }

    public UserBugRedLoginPage sendKeysToPasswordTextField(String password) {
        passwordTextField.sendKeys(password);
        return this;
    }

    public UserBugRedIndexPage clickAuthorizationButton() {
        authorizeButton.click();
        return new UserBugRedIndexPage(driver);
    }

}
