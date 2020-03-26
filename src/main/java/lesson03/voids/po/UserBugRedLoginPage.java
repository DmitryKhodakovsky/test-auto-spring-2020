package lesson03.voids.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserBugRedLoginPage {

    @FindBy(name = "login")
    private WebElement usernameTextField;

    @FindBy(xpath = "//form[contains(@action, 'login')]//input[@name='password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "//input[@value='Авторизоваться']")
    private WebElement authorizeButton;

    // login as one method
    public void login(String username, String password) {
        usernameTextField.sendKeys(username);
        passwordTextField.sendKeys(password);
        authorizeButton.click();
    }

    // login as two methods
    public void enterUsernameAndPassword(String username, String password) {
        usernameTextField.sendKeys(username);
        passwordTextField.sendKeys(password);
    }

    public void clickAuthButton() {
        authorizeButton.click();
    }

    // login as three methods
    public void sendKeysToUsernameTextField(String username) {
        usernameTextField.sendKeys(username);
    }

    public void sendKeysToPasswordTextField(String password) {
        passwordTextField.sendKeys(password);
    }

    public void clickAuthorizationButton() {
        authorizeButton.click();
    }

    public String getUsernameTextFieldValue() {
        return usernameTextField.getText();
    }

}
